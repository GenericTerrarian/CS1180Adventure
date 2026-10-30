public class Armor extends Equippable {

    public Armor(String nm, String desc, int[] stat, int aval) {

        super(nm, desc, stat, aval, -1);

    }

    public Armor(String nm, String desc, int[] stat, int aval, int coid) {

        super(nm, desc, stat, aval, coid);

    }

    final static Armor[] ARMOR_ARRAY_MISC = {
            new Armor("No Armor", "N/A", new int[] {0,0,0,0}, -1),
            new Armor("Thong", "Sexy", new int[] {999,999,999,999}, -1)
    };

    final static Armor[] ARMOR_ARRAY_ROBES = { //Category 1
            new Armor("Blue Robe", Desc.EMPTY(), new int[] {}, 0)
    };

    final static Armor[][] ARMOR_ARRAY = {ARMOR_ARRAY_MISC, ARMOR_ARRAY_ROBES};

    public static Armor Get(int CollectionID, int ArmorID) {

        return ARMOR_ARRAY[CollectionID][ArmorID];

    }

}