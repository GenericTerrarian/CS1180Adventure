public class Weapon extends Equippable {

    public Weapon(String nm, String desc, int[] stat, int efid, int aval) {

        super(nm, desc, stat, efid, aval);

    }

    public Weapon(Weapon weapon) {

        super(weapon.name, weapon.description, weapon.statistics, weapon.effectID, weapon.avalibility);

    }

    final static Weapon[] WEAPON_ARRAY_MISC = {
            new Weapon("No Weapon", "N/A", new int[] {0,0,0,0}, 0, -1),
            new Weapon("Gay Sex Blade", "Penis", new int[] {999, 999, 999, 999}, 0, -1)
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

    public static Weapon GetNew(int collectionID, int weaponID){

        return new Weapon(WEAPON_ARRAY[collectionID][weaponID]);

    }

}
