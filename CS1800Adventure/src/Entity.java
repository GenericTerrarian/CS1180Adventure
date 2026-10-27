import java.util.ArrayList;

public class Entity extends NameObject {

    int[] statistics; //0 Max HP, 1 Defense, 2 Attack, 3 Speed
    int[] effStats;
    int HP;
    int AP = 0;

    Attack[] attacks;
    Spell[] spells;

    ArrayList<Condition> conditions = new ArrayList<Condition>(0);

    public Entity(String nm, String desc, int[] stat, Attack[] atk, Spell[] spl){

        super(nm, desc);

        this.statistics = stat;
        this.effStats = stat;
        this.attacks = atk;
        this.spells = spl;

    }

    //Calculates how much damage should be taken
    public int TakeDamage(int damage) {

        if (damage > effStats[1]) {
            HP = HP - (damage - effStats[1]);
            return (damage - effStats[1]);
        }
        HP = HP - 1;
        return 1;

    }

    //Calculates how much healing should be done
    public int Heal(int hp) {

        double healthMod = 1.00;

        this.HP = this.HP + ((int) (hp * healthMod));

        if (this.HP > this.effStats[0]) {
            this.HP = this.effStats[0];
        }

        return (int) (hp * healthMod);

    }

    //Prints HP/effHLT
    public void PrintHP(boolean name) {

        if (name == true) {

            System.out.print(this.name + ": ");

        }

        System.out.print("[" + HP + "/" + effStats[0] + "]");

    }

    //Calculates the damage an attack should do to a target
    public int GetAttackDamage(Attack attack){

        return (int) (attack.damageMultiplier * this.effStats[2]);

    }

    //Increments damage from DOT conditions
    public void TickDOT(DOT dot) {

        return;

    }

}
