public class Item extends NameObject{

    int healing;
    int effectID;

    public Item(String nm, String desc, int hp, int efid) {

        super(nm, desc);

        this.healing = hp;
        this.effectID = efid;

    }

    public Item(Item item) {

        super(item.name, item.description);

        this.healing = item.healing;
        this.effectID = item.effectID;

    }

}
