public class Attack extends NameObject{

    double damageMultiplier;
    int categoryID;
    int attackID;
    int conditionID;

    public Attack(String nm, String desc, double dm, int caid, int atid) {

        super(nm, desc);

        this.damageMultiplier = dm;

        this.categoryID = caid;
        this.attackID = atid;

        this.conditionID = 0;

    }

    public Attack(String nm, String desc, double dm, int caid, int atid, int coid) {

        super(nm, desc);

        this.damageMultiplier = dm;

        this.categoryID = caid;
        this.attackID = atid;

        this.conditionID = coid;

    }

    final static Attack[] ATTACK_ARRAY_MISC = {
            new Attack("No Attack", "N/A", 0.00, 0, 0)
    };

    final static Attack[] ATTACK_ARRAY_MONSTER_VISCERAL = {};
    final static Attack[] ATTACK_ARRAY_MONSTER_MELEE = {};
    final static Attack[] ATTACK_ARRAY_MONSTER_RANGED = {};

    final static Attack[] ATTACK_ARRAY_HERO_VISCERAL = {
            new Attack("Punch", "Not to be confused with the healing item /'Knuckle Sandwich/'", 0.40, 4, 0),
            new Attack("Big Kick", "Not to be performed by the feint of heart or chicken of leg", 0.80, 4, 1),
            new Attack("Bite", "Anyone who has dated a freaky Mexican girl will know this one", 0.2, 4, 2, 2),
    };
    final static Attack[] ATTACK_ARRAY_HERO_MELEE = {};
    final static Attack[] ATTACK_ARRAY_HERO_RANGED = {};

    final static Attack[][] ATTACK_ARRAY = {
            ATTACK_ARRAY_MISC,
            ATTACK_ARRAY_MONSTER_VISCERAL, ATTACK_ARRAY_MONSTER_MELEE, ATTACK_ARRAY_MONSTER_RANGED,
            ATTACK_ARRAY_HERO_VISCERAL, ATTACK_ARRAY_HERO_MELEE, ATTACK_ARRAY_HERO_RANGED};

    public static Attack Get(int categoryID, int attackID) {
        return ATTACK_ARRAY[categoryID][attackID];
    }

    public static void Launch(Entity launcher, Entity target, Attack attack) {

        Text.EMPTY_FUNCTION();

    }

}
