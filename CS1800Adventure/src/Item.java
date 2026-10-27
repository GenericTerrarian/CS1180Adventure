public class Item extends NameObject{

    int[] statistics; // 0 HP, 1 AP, 2 PP, 3 effect
    int ID;

    public Item(String nm, String desc, int[] stats, int id) {

        super(nm, desc);

        this.statistics = stats;
        this.ID = id;

    }

    public Item(Item item) {

        super(item.name, item.description);

        this.statistics = item.statistics;
        this.ID = item.ID;

    }

    public boolean OverworldUsable() {

        if (this.statistics[0] > 0) {
            return true;
        }
        else {
            return false;
        }

    }

    final static Item[] ITEM_ARRAY = {
            //new Item(null, DescHandle.GetDesc(0,0,0), new int[] {}, 0)
            new Item("Clean Bandages", Desc.Get(1,0,0),       new int[] {30,0,0,0}, 0),
            new Item("Soothing Poultice", Desc.Get(1,0,1),    new int[] {60,0,0,0}, 1),
            new Item("Lifeforce Potion", Desc.Get(1,0,2),     new int[] {120,0,0,0}, 2),
            new Item("Golden Core", Desc.Get(1,0,3),          new int[] {99999,0,0,0}, 3),

            new Item(null, Desc.Get(0,0,0), new int[] {}, 0),
            new Item(null, Desc.Get(0,0,0), new int[] {}, 0),
            new Item(null, Desc.Get(0,0,0), new int[] {}, 0),
            new Item(null, Desc.Get(0,0,0), new int[] {}, 0)
    };

    public static Item NewInst(int id) {

        return new Item(ITEM_ARRAY[id]);

    }

}
