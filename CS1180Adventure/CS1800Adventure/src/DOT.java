public class DOT extends Condition{

    String tickDescription;
    int tickDamage;

    public DOT(String nm, String desc, String inf, byte tnlf, String tkdsc, int tkdmg) {

        super(nm, desc, inf, tnlf);

        this.tickDescription = tkdsc;
        this.tickDamage = tkdmg;

    }

}
