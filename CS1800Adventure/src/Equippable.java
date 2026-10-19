import java.lang.reflect.Array;
import java.util.ArrayList;

public class Equippable extends NameObject {

    int health;
    int defense;
    int attack;
    int speed;

    int effectID;

    int[] availibility;

    public Equippable(String nm, String desc, int[] stat, int efid, int[] aval) {

        super(nm, desc);

        this.health = stat[0];
        this.defense = stat[1];
        this.attack = stat[2];
        this.speed = stat[3];

        this.effectID = efid;
        this.availibility = aval;

    }

}
