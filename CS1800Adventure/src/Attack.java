public class Attack extends NameObject{

    double damageMultiplier;
    int effectID;

    public Attack(String nm, String desc, double dm, int efid) {

        super(nm, desc);

        this.damageMultiplier = dm;
        this.effectID = efid;

    }

}
