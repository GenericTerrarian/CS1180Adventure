public class BuffDebuff extends Condition {

    int[] statistics;

    public BuffDebuff (String nm, String desc, String inf, byte tnlf, int[] stats) {

        super(nm, desc, inf, tnlf);

        this.statistics = stats;

    }


}
