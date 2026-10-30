public class Weapon extends Equippable {

    public Weapon(String nm, String desc, int[] stat, int aval) {

        super(nm, desc, stat, aval, -1);

    }

    public Weapon(String nm, String desc, int[] stat, int aval, int coid) {

        super(nm, desc, stat, aval, coid);

    }

    final static Weapon[] WEAPON_ARRAY_MISC = {
            new Weapon("No Weapon", "N/A", new int[] {0,0,0,0}, 0),
            new Weapon("Gay Sex Blade", "Penis", new int[] {999, 999, 999, 999}, 0)
    };

    final static Weapon[] WEAPON_ARRAY_SWORDS = { //Category 1

    };
    final static Weapon[] WEAPON_ARRAY_KNIVES = {};
    final static Weapon[] WEAPON_ARRAY_SPEARS = {};
    final static Weapon[] WEAPON_ARRAY_HAMMERS = {};
    final static Weapon[] WEAPON_ARRAY_AXES = {};

    final static Weapon[] WEAPON_ARRAY_BOWS = {};
    final static Weapon[] WEAPON_ARRAY_FIREARMS = {};

    final static Weapon[] WEAPON_ARRAY_TOMES = {};
    final static Weapon[] WEAPON_ARRAY_STAVES = {};
    final static Weapon[] WEAPON_ARRAY_FLASKS = {};

    final static Weapon[][] WEAPON_ARRAY = {WEAPON_ARRAY_MISC, WEAPON_ARRAY_SWORDS};

    public static Weapon Get(int collectionID, int weaponID){

        return WEAPON_ARRAY[collectionID][weaponID];

    }

}
