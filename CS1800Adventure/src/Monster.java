public class Monster extends Entity{

    int preference;

    public Monster(String nm, String desc, int[] stat, Attack[] atk, Spell[] spl, int pref) {

        super(nm, desc, stat, atk, spl);

        this.preference = pref;

    }

    public Monster(Monster monster) {

        super(monster.name, monster.description, new int[] {monster.health, monster.defense, monster.attack, monster.speed}, new Attack[] {monster.attackI, monster.attackII}, monster.spells);

        this.preference = monster.preference;

    }

}
