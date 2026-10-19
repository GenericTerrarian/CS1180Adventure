import java.util.ArrayList;

public class Entity extends NameObject {

    int health;
    int defense;
    int attack;
    int speed;

    int effHLT;
    int effDEF;
    int effATK;
    int effSPD;

    int HP;
    int AP = 0;

    Attack attackI;
    Attack attackII;
    Spell[] spells;

    ArrayList<Condition> conditions = new ArrayList<Condition>(0);

    public Entity(String nm, String desc, int[] stat, Attack[] atk, Spell[] spl){

        super(nm, desc);

        this.health = stat[0];
        this.defense = stat[1];
        this.attack = stat[2];
        this.speed = stat[3];
        this.effHLT = health;
        this.effDEF = defense;
        this.effATK = attack;
        this.effSPD = speed;

        this.attackI = atk[0];
        this.attackII = atk[1];
        this.spells = spl;

    }

    //Calculates how much damage should be taken
    public int TakeDamage(int damage) {

        if (damage > effDEF) {
            HP = HP - (damage - effDEF);
            return (damage - effDEF);
        }
        HP = HP - 1;
        return 1;

    }

    //Calculates how much healing should be done
    public int Heal(int hp) {

        double healthMod = 1.00;

        this.HP = this.HP + ((int) (hp * healthMod));

        if (this.HP > this.health) {
            this.HP = this.health;
        }

        return (int) (hp * healthMod);

    }

    //Prints HP/effHLT
    public void PrintHP(boolean name) {

        if (name == true) {

            System.out.print(this.name + ": ");

        }

        System.out.println("[" + HP + "/" + effHLT + "]");

    }

    //Calculates the damage an attack should do to a target
    public int GetAttackDamage(Attack attack){

        return (int) (attack.damageMultiplier * this.effATK);

    }

    //Increments damage from DOT conditions
    public void CheckDOTConditions() {

        return;

    }

}
