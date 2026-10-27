public class Condition extends NameObject {

    String inflictDesc;
    int turnsLeft;

    public Condition(String nm, String desc, String inf, byte tnlf) {

        super(nm, desc);

        this.inflictDesc = inf;
        this.turnsLeft = tnlf;

    }

}
