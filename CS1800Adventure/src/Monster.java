public class Monster extends Entity{

    int preference;

    public Monster(String nm, String desc, int[] stat, Attack[] atk, Spell[] spl, int pref) {

        super(nm, desc, stat, atk, spl);

        this.preference = pref;

    }

    public Monster(Monster monster) {

        super(monster.name, monster.description, monster.statistics, monster.attacks, monster.spells);

        this.preference = monster.preference;

    }

    final static Monster[] MONSTER_ARRAY_GENTLE_FOREST = {
            new Monster("Grass Frogger", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Puddle Frogger", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Rock Frogger", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Slime", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Crow", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Angry Dandelion", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Mite", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Mole", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0)
    };
    final static Monster[] MONSTER_ARRAY_SPOOKY_MONTH = {
            new Monster("Pumpkin Frogger", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Ghost Frogger", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Jack-O-Lantern", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Raven", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Poltergeist", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Wailing Willow", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Horseman", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Headless Horseman", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Horseless Headless Horseman", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Horseless Headless Horseman's Headless Horse", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0),
            new Monster("Horseless Headless Horseman's Headless Horse's Head", null, new int[] {}, new Attack[] {}, new Spell[] {}, 0)
    };
    final static Monster[] MONSTER_ARRAY_DOOM_DEMONS = {};
    final static Monster[] MONSTER_ARRAY_BRIMSTONE_CALAMITY = {};

    final static Monster[][] MONSTER_ARRAY = {MONSTER_ARRAY_GENTLE_FOREST, MONSTER_ARRAY_SPOOKY_MONTH, MONSTER_ARRAY_DOOM_DEMONS, MONSTER_ARRAY_BRIMSTONE_CALAMITY};

    public static Monster GetNew(int collectionID, int monsterID) {

        return MONSTER_ARRAY[collectionID][monsterID];

    }

}
