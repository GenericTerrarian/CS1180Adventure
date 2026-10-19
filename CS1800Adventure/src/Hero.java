public class Hero extends Entity{

    Weapon weapon;
    Armor armor;
    Charm charmI;
    Charm charmII;
    int heroID;

    public Hero(String nm, String desc, int[] stat, Attack[] atk, Spell[] spl, Weapon wpn, Armor arm, Charm[] chm, int id){

        super(nm, desc, stat, atk, spl);

        this.charmI = chm[0];
        this.charmII = chm[1];
        this.weapon = wpn;
        this.armor = arm;;
        this.heroID = id;

    }

    public Hero(Hero hero) {

        super(hero.name, hero.description, new int[] {hero.health, hero.defense, hero.attack, hero.speed}, new Attack[] {hero.attackI, hero.attackII}, hero.spells);

        this.charmI = hero.charmI;
        this.charmII = hero.charmII;
        this.weapon = hero.weapon;
        this.armor = hero.armor;
        this.heroID = hero.heroID;

    }



}
