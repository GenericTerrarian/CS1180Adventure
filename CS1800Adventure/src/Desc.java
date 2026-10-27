public class Desc {

    final static String[][] MISC = {{"EMPTY DESCRIPTION, FIX THIS"}};

    final static String[] ITEM_DEFAULT_CATEGORY = {
            "Clean Bandages:\nOh my gauze...",
            "Soothing Poultice:\nFlowery's guts",
            "Lifeforce Potion:\nIt's just Dayquil",
            "Golden Core:\nEat the primordial essence nom nom nom"
    };
    final static String[][] ITEM = {
           ITEM_DEFAULT_CATEGORY
    };
    final static String[][] DESCRIPTION_ARRAY_CHARM = {};

    final static String[] WEAPON_SWORDS = {};
    final static String[] WEAPON_KNIVES = {};
    final static String[] WEAPON_SPEARS = {};
    final static String[] WEAPON_HAMMERS = {};
    final static String[] WEAPON_AXES = {};
    final static String[][] WEAPON = {};

    final static String[] ARMOR_ROBES = {};
    final static String[][] ARMOR = {};

    final static String[] HERO_JOURNEYS = {
            "Journey:\nMilf",
            "Alexander:\nCowboy",
            "Uncle Bob:\nA BLACK MAN",
            "Luna:\nCatgirl",
            "Juniper:\nSharp Teeth",
            "Jayson:\nTumblr Sexyman",
            "Samantha:\nLesbian",
            "Samuel:\nKnuckles the Echidna"
    };
    final static String[] HERO_NEXUS_EVENT = {};
    final static String[] HERO_STAR_MAN = {};
    final static String[] HERO_BIOHAZARD = {};
    final static String[][] HERO = {};

    final static String[] MONSTER_GENTLE_FOREST = {};
    final static String[] MONSTER_SPOOKY_MONTH = {};
    final static String[] MONSTER_DOOM_DEMONS = {};
    final static String[] MONSTER_BRIMSTONE_CALAMITY = {};
    final static String[][] MONSTER = {};

    final static String[] CONDITION_DOT = {};
    final static String[] CONDITION_BUFFDEBUFF = {};
    final static String[] CONDITION_SPECIAL_CONDITION = {};
    final static String[][] CONDITION = {};

    final static String[][][] DESCRIPTION_ARRAY = {
            MISC, ITEM
    };

    public static String Get(int catagory, int collection, int id) {

        return DESCRIPTION_ARRAY[catagory][collection][id];

    }

    public static String EMPTY() {
        return DESCRIPTION_ARRAY[0][0][0];
    }

}
