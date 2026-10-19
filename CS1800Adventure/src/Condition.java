public class Condition extends NameObject {

    String inflictDesc;
    boolean temporary;
    int turnsLeft;
    boolean notify;

    public Condition(String nm, String desc, String inf, boolean temp, boolean nof, byte tnlf) {

        super(nm, desc);

        this.inflictDesc = inf;
        this.temporary = temp;
        this.notify = nof;
        this.turnsLeft = tnlf;

    }

}
