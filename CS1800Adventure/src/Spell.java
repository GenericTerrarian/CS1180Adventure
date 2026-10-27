public class Spell extends NameObject{

    int categoryID;
    int spellID;

    public Spell(String nm, String desc, int caid, int spid) {

        super(nm, desc);

        this.categoryID = caid;
        this.spellID = spid;

    }

    static final Spell[] SPELL_ARRAY_MISC = {
            new Spell("No Spell", "N/A", 0, 0)
    };

    static final Spell[] SPELL_ARRAY_PYRO = {};
    static final Spell[] SPELL_ARRAY_CRYO = {};
    static final Spell[] SPELL_ARRAY_ELECTRO = {};

    static final Spell[] SPELL_ARRAY_HYDRO = {
            new Spell("Vital Tide", Desc.EMPTY(), 4, 0)
    };
    static final Spell[] SPELL_ARRAY_CHROMO = {};
    static final Spell[] SPELL_ARRAY_BIO = {};

    static final Spell[] SPELL_ARRAY_GEO = {};
    static final Spell[] SPELL_ARRAY_AERO = {};
    static final Spell[] SPELL_ARRAY_FERRO = {};

    static final Spell[] SPELL_ARRAY_NECRO = {};
    static final Spell[] SPELL_ARRAY_HELIO = {};
    static final Spell[] SPELL_ARRAY_SELINO = {};

    static final Spell[] SPELL_ARRAY_AIEO = {};
    static final Spell[] SPELL_ARRAY_CHRONO = {};

    static final Spell[][] SPELL_ARRAY = {};

    //region Spell Functions

    //===MISC===
    public static void NoSpell() {
        System.out.println("Nothing Happened");
    }

    //===VITAL MAGIC===
    //Hydro
    public static void VitalTide(Entity caster, Entity target) {

    }
    //Chromo
    public static void Absorb(Entity caster, Entity target) {

    }
    //Bio
    public static void Flourish(Entity caster, Entity target) {

    }

    //===DESTRUCTIVE MAGIC===
    //Pyro
    public static void FireShock(Entity caster, Entity target) {

    }
    //Cryo
    public static void IceShock(Entity caster, Entity target) {

    }
    //Electro
    public static void ThunderShock(Entity caster, Entity target) {

    }

    //===EMPOWERING MAGIC===
    //Geo
    public static void StoneSinew(Entity caster, Entity target) {

    }
    //Aero
    public static void HermesWind(Entity caster, Entity target) {

    }
    //Ferro
    public static void SteelKnuckles(Entity caster, Entity target) {

    }

    //===CRIPPLING MAGIC===
    //Necro
    public static void Wither(Entity caster, Entity target) {

    }
    //Helio
    public static void DayBreak(Entity caster, Entity target) {

    }
    //Selino
    public static void MoonBeam(Entity caster, Entity target) {

    }

    //endregion

    public static Spell GetNew(int categoryID, int spellID) {
        return SPELL_ARRAY[categoryID][spellID];
    }

    public static void Cast(Entity caster, Entity target, Spell spell) {

        switch (spell.categoryID) {
            case 0: //MISC
                switch (spell.spellID) {
                    case 0:
                        return;
                }
            case 1: //HYDRO
                switch (spell.spellID) {
                    case 0 -> VitalTide(caster, target);
                }
            case 2: //CHROMO
                switch (spell.spellID) {
                    case 0 -> Absorb(caster, target);
                }
            case 3: //BIO
                switch (spell.spellID) {
                    case 0 -> Flourish(caster, target);
                }
        }

    }

}
