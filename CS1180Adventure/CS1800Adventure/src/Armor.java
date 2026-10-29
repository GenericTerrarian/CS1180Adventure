public class Armor extends Equippable {

    public Armor(String nm, String desc, int[] stat, int efid, int aval) {

        super(nm, desc, stat, efid, aval);

    }

    public Armor(Armor armor) {

        super(armor.name, armor.description, armor.statistics, armor.effectID, armor.avalibility);

    }

    final static Armor[] ARMOR_ARRAY_MISC = {
            new Armor("No Armor", "N/A", new int[] {0,0,0,0}, 0, -1),
            new Armor("Thong", "Sexy", new int[] {999,999,999,999}, 0, -1)
    };

    final static Armor[] ARMOR_ARRAY_ROBES = { //Category 1
            new Armor("Blue Robe", Desc.EMPTY(), new int[] {}, 0, 1)
    };

    final static Armor[][] ARMOR_ARRAY = {ARMOR_ARRAY_MISC, ARMOR_ARRAY_ROBES};

    public static Armor GetNew(int CollectionID, int ArmorID) {

        return new Armor(ARMOR_ARRAY[CollectionID][ArmorID]);

    }

}