public class Charm extends Equippable {

    public Charm(String nm, String desc, int[] stat, int aval) {

        super(nm, desc, stat, aval, -1);

    }

    public Charm(String nm, String desc, int[] stat, int aval, int coid) {

        super(nm, desc, stat, aval, coid);

    }

    final static Charm[] CHARM_ARRAY = {
            new Charm("No Charm", "N/A", new int[] {0,0,0,0}, 0)
    };

    public static Charm Get(int charmID) {

        return CHARM_ARRAY[charmID];

    }

}
