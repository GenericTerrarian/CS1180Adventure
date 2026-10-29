public class Charm extends Equippable {

    public Charm(String nm, String desc, int[] stat, int efid, int aval) {

        super(nm, desc, stat, efid, aval);

    }

    public Charm(Charm charm) {

            super(charm.name, charm.description, charm.statistics, charm.effectID, charm.avalibility);

    }

    final static Charm[] CHARM_ARRAY = {
            new Charm("No Charm", "N/A", new int[] {0,0,0,0}, 0, -1)
    };

    public static Charm GetNew(int charmID) {

        return new Charm(CHARM_ARRAY[charmID]);

    }

}
