public class Hero extends Entity{

    Weapon weapon;
    Armor armor;
    Charm charmI;
    Charm charmII;
    int[][] availability;
    int castID;
    int heroID;

    public Hero(String nm, String desc, int[] stat, Attack[] atk, Spell[] spl, Weapon wpn, Armor arm, Charm chm1, Charm chm2, int[][] aval, int csid, int hrid){

        super(nm, desc, stat, atk, spl);

        this.charmI = chm1;
        this.charmII = chm2;
        this.weapon = wpn;
        this.armor = arm;
        this.availability = aval;
        this.castID = csid;
        this.heroID = hrid;

    }

    public Hero(Hero hero) {

        super(hero.name, hero.description, hero.statistics, hero.attacks, hero.spells);

        this.charmI = hero.charmI;
        this.charmII = hero.charmII;
        this.weapon = hero.weapon;
        this.armor = hero.armor;
        this.availability = hero.availability;
        this.castID = hero.castID;
        this.heroID = hero.heroID;

        this.HP = this.effStats[0];

    }

    //Journey is the baseline well-rounded character
    static final Hero[] HERO_ARRAY_JOURNEYS_END = {
            new Hero("Journey", "Milf",                 new int[] {100, 8, 20, 10}, new Attack[] {Attack.Get(4,0), Attack.Get(4,2)}, new Spell[] {Spell.Get(1,0),Spell.Get(0,0),Spell.Get(0,0),Spell.Get(0,0)}, Weapon.Get(0,0), Armor.Get(0,0), Charm.Get(0), Charm.Get(0), new int[][] {{1},{1},{}}, 0, 0),
            new Hero("Alexander", "Chuck Noris",        new int[] {200, 15, 16, 4}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Uncle Bob", "Uncle Ruckus",       new int[] {150, 12, 18, 6}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Luna", "Catgirl Muscle Mommy",    new int[] {80, 4, 16, 15}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Juniper", "Sharp Teeth",          new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Jayson", "Tumblr Sexyman",        new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Samantha", "Anorexic Lesbian",    new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Samuel", "Knuckles the Echidna",  new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0)
    };
    static final Hero[] HERO_ARRAY_NEXUS_EVENT = {
            new Hero("Nexus Jayson", null, new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Nexus Juniper", null, new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Geni", null, new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Bill", null, new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Revna", null, new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
            new Hero("Peagiorno", null, new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0),
    };
    static final Hero[] HERO_ARRAY_STAR_MAN = {
            new Hero("Star Man Alexander", null, new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0)
    };
    static final Hero[] HERO_ARRAY_BIOHAZARD = {
            new Hero("Biohazard Luna", null, new int[] {}, new Attack[] {}, new Spell[] {}, null, null, null, null, null, 0, 0)
    };

    static final Hero[][] HERO_ARRAY = {HERO_ARRAY_JOURNEYS_END, HERO_ARRAY_NEXUS_EVENT, HERO_ARRAY_STAR_MAN, HERO_ARRAY_BIOHAZARD};

    public static Hero GetNew(int castID, int heroID) {

        return new Hero(HERO_ARRAY[castID][heroID]);

    }

    public void DescribeHero() {

        System.out.println(this.name + "\n");
        System.out.println(this.description + "\n");

        System.out.print("HP: "); PrintHP(false); System.out.println("\n");
        System.out.println("Health: " + this.effStats[0] + "\t\t\tWeapon: " + this.weapon.name);
        System.out.println("Defense: " + this.effStats[1] + "\t\t\tArmor: " + this.armor.name);
        System.out.println("Attack: " + this.effStats[2] + "\t\t\tCharm I: " + this.charmI.name);
        System.out.println("Speed: " + this.effStats[3] + "\t\t\tCharm II: " + this.charmII.name);
        System.out.println();
        System.out.println("Basic Attack: " + this.attacks[0].name);
        System.out.println("Special Attack: " + this.attacks[1].name);
        System.out.println();
        System.out.println("Spell I: " + this.spells[0].name);
        System.out.println("Spell II: " + this.spells[1].name);
        System.out.println("Spell III: " + this.spells[2].name);
        System.out.println("Spell IV: " + this.spells[3].name);

        Text.Prompt();

    }

}
