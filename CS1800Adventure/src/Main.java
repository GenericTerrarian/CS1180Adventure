import java.util.*;
import java.util.stream.Collectors;

//Credits
//https://www.geeksforgeeks.org/java/how-to-print-colored-text-in-java-console/ - ANSI colors
//https://docs.oracle.com/en/java/ - Misc. knowledge

public class Main {

    //Technical Stuff

    //region Unicode========================================================================================

    //region Text colors

    static final String RESET = "\u001B[0m";

    static final String XERO = "\u001B[31m";
    static final String GOLD = "\u001B[33m";
    static final String HERO = "\u001B[35m";
    static final String WATER = "\u001B[34m";
    static final String FIRE = "\u001B[31m";
    static final String EARTH = "\u001B[32m";
    static final String WIND = "\u001B[36m";

    //endregion

    //region Symbols

    static final String HEART = "♥";
    static final String HEART2 = "♥♥";
    static final String HEART3 = "♥♥♥";

    static final String STAR = "★";
    static final String STAR2 = "★★";
    static final String STAR3 = "★★★";

    static final String SHARP = "✦";
    static final String SHARP2 = "✦✦";
    static final String SHARP3 = "✦✦✦";

    static final String SAFE = "✡";
    static final String SAFE2 = "✡✡";
    static final String SAFE3 = "✡✡✡";

    static final String SPIRAL = "꩜";
    static final String SPIRAL2 = "꩜꩜";
    static final String SPIRAL3 = "꩜꩜꩜";

    static final String X_DESC = "EMPTY_DESCRIPTION";

    static final String BRIMSTONE = "\uD83D\uDF0F";

    //endregion

    //region Map Unicode Characters

    final static String MAP4CROSS = "╋";

    final static String MAP3N = "┻";
    final static String MAP3E = "┣";
    final static String MAP3S = "┳";
    final static String MAP3W = "┫";

    final static String MAPNE = "┓";
    final static String MAPSE = "┛";
    final static String MAPSW = "┗";
    final static String MAPNW = "┏";

    final static String MAPLNV = "┃";
    final static String MAPLNH = "━";

    final static String MAPSEARCHED = "✓";
    final static String MAPPORTAL = "@";
    final static String MAPMINI = "M";
    final static String MAPBOSS = "B";
    final static String MAPHERO = "#";


    //endregion

    //region Progress Bar Drawing

    static final String PPBAR = "▓";

    //endregion

    //endregion

    //region Important Variables============================================================================

    //region Those Annonying Little Guys That You Shouldn't Have  To Import

    static Random rand = new Random();

    //endregion

    //endregion

    //Inventory Objects
/*
    //region Items==========================================================================================

    //region Item Constructors
    //final static Item X = new Item("X", X_DESC, 0, 0);

    //final static Item STAR_BIT = new Item("Star Bit", null, 50, 1); //PP
    //final static Item ARCANE_CORE = new Item("Arcane Core", null, 100, 1); //PP
    //final static Item JOULE_JEWEL = new Item("Joule Jewel", null, 3, 2); //AP
    //final static Item CRAZY_DIAMOND = new Item("Crazy Diamond", null, 7, 2); //AP

    //final static Item WATER_STONE = new Item("Water Stone", null, 0, 3); //Buffs Health
    //final static Item EARTH_STONE = new Item("Earth Stone", null, 0, 4); //Buffs Defense
    //final static Item FIRE_STONE = new Item("Fire Stone", null, 0, 5); //Buffs Attack
    //final static Item WIND_STONE = new Item("Wind Stone", null, 0, 6); //Buffs Speed


    //endregion

    //endregion

    //region Armors=========================================================================================

    //region Armor Descriptions

    //endregion

    //region Armor Constructors
    //final static Armor X = new Armor("X", X_DESC, 0, 0, 0, 0, 0,new int[] {});

    final static Armor SILK_ROBE =          new Armor("Silk Robe", null,        new int[] {0, 2, 0, 0}, 0, new int[] {1});
    final static Armor PERMAFROST_ROBE =    new Armor("Permafrost Robe", null,  new int[] {15, 6, 4, 3}, 1, new int[] {1});
    final static Armor IRIDESCENT_ROBE =    new Armor("Iridescent Robe", null,  new int[] {10, 8, 10, 6}, 2, new int[] {1});
    final static Armor GOLDEN_ROBE =        new Armor("Golden Robe", null,      new int[] {20, 15, 2, 2}, 0, new int[] {1});
    final static Armor XERO_CLOAK =         new Armor("Xero Cloak", null,       new int[] {30, 25, 26, 10}, 3, new int[] {1});

    //final static Armor steelShield = new Armor(null);
    //final static Armor wulfrumShield = new Armor(null);
    //final static Armor goldenShield = new Armor(null);
    //final static Armor starShield = new Armor(null);
    //final static Armor xeroShield = new Armor(null);

    //final static Armor redHat = new Armor(null);
    //final static Armor leatherHat = new Armor(null);
    //final static Armor goldenHat = new Armor(null);
    //final static Armor glitteringHat = new Armor(null);
    //final static Armor xeroHat = new Armor(null);

    //final static Armor jadeCuffs = new Armor(null);
    //final static Armor emeraldCuffs = new Armor(null);
    //final static Armor goldenCuffs = new Armor(null);
    //final static Armor shimmeringCuffs = new Armor(null);
    //final static Armor xeroCuffs = new Armor(null);

    //endregion

    //endregion

    //region Weapons========================================================================================

    //region Weapon Descriptions

    //endregion

    //region Weapon Constructors
    //final static Weapon X = new Weapon("X", X_DESC, new int[] {}, 0, new int[] {});

    final static Weapon SHARP_BLADE =       new Weapon("Sharp Blade", null,     new int[] {0, 0, 8, 0}, 0, new int[] {1});
    final static Weapon ICE_BLADE =         new Weapon("Ice Blade", null,       new int[] {0, 0, 0, 0}, 1, new int[] {1});
    final static Weapon GOLDEN_BLADE =      new Weapon("Golden Blade", null,    new int[] {0, 0, 0, 0}, 0, new int[] {1});
    final static Weapon RADIANT_BLADE =     new Weapon("Radiant Blade", null,   new int[] {0, 0, 0, 0}, 0, new int[] {1});
    final static Weapon XERO_MURASAMA =     new Weapon("Xero Murasama", null,   new int[] {0, 0, 0, 0}, 0, new int[] {1});

    //final static Weapon shotgun = new Weapon(null);
    //final static Weapon doubleShotgun = new Weapon(null);
    //final static Weapon elephantGun = new Weapon(null);
    //final static Weapon encrustedRifle = new Weapon(null);
    //final static Weapon xeroRailcannon = new Weapon(null);

    //final static Weapon topazStaff = new Weapon(null);
    //final static Weapon nightStaff = new Weapon(null);
    //final static Weapon terraStaff = new Weapon(null);
    //final static Weapon rainbowStaff = new Weapon(null);
    //final static Weapon xeroScepter = new Weapon(null);

    //final static Weapon leadSpear = new Weapon(null);
    //final static Weapon burningSpear = new Weapon(null);
    //final static Weapon serratedSpear = new Weapon(null);
    //final static Weapon bedazzeledSpear = new Weapon(null);
    //final static Weapon xeroHalberd = new Weapon(null);

    //endregion

    //endregion

    //region Charms=========================================================================================

    //region Charm Descriptions

    //endregion

    //region Charm Constructors
    //final static Charm X = new Charm("X", X_DESC, new int[] {}, 0, new int[] {});

    final static Charm HEART_NECKLACE =     new Charm("Heart Necklace",    null, new int[] {20, 2, 0, 0},   0, new int[] {0}); // Health up, minor Defense up
    final static Charm MAGIC_BRACELET =     new Charm("Magic Bracelet",    null, new int[] {-10, 0, 0, -2}, 1, new int[] {0}); // One extra AP per turn, Health and Speed down
    final static Charm MERCURY_ANKLET =     new Charm("Mercury Anklet",    null, new int[] {0, 0, 0, 5},    0, new int[] {0}); // Speed up
    final static Charm SPIRIT_WARD =        new Charm("Spirit Ward",       null, new int[] {0, 8, 0, 2},    2, new int[] {0}); // Defense up, incoming dmg/Health = %PP gained
    final static Charm SPIKE_RING =         new Charm("Spike Ring",        null, new int[] {0, 0, 6, 0},    3, new int[] {0}); // Attack up, 20% thorns
    final static Charm LEATHER_PADDING =    new Charm("Leather Padding",   null, new int[] {10, 2, 3, 1},   0, new int[] {0}); // minor All Stats up

    final static Charm BARBED_CIRCLET =     new Charm("Barbed Circlet",    null, new int[] {0, -5, 12, 2},  3, new int[] {0}); // Attack up, Defense down, minor Speed up, 30% Thorns
    final static Charm HOUR_GLASS =         new Charm("Hour Glass",        null, new int[] {0, -10, 0, 20}, 0, new int[] {0}); // Speed up, Defense down
    final static Charm TRANSMUTOR =         new Charm("Transmutor",        null, new int[] {0, 0, 0, 0},    4, new int[] {0}); // One fewer AP per turn - AP converted into 30% PP
    final static Charm LIQUID_LUCK =        new Charm("Liquid Luck",       null, new int[] {0, 0, 0, 0},    0, new int[] {0}); // Allows crits
    final static Charm WEIGHTED_BRACES =    new Charm("X",                 X_DESC, new int[] {0, 0, 0, 0}, 0, new int[] {});
    final static Charm THORN_CLOAK =        new Charm("X",                 X_DESC, new int[] {0, 0, 0, 0}, 0, new int[] {});

    final static Charm ICON_OF_XERO =       new Charm("X",                 X_DESC, new int[] {0, 0, 0, 0}, 0, new int[] {});
    final static Charm MASK_OF_XERO =       new Charm("X",                 X_DESC, new int[] {0, 0, 0, 0}, 0, new int[] {});
    //endregion

    //endregion
*/
    //Attacks, Spells, Conditions

    //region Attacks========================================================================================

    //endregion

    //region Spells=========================================================================================

    //endregion

    //region Conditions=====================================================================================

    //region Condition Descriptions

    //Debuffs
    static final String BLEEDING_INF = " is bleeding! Incoming healing is reduced!";
    static final String SHREDDED_INF = "'s skin was shredded! Incoming healing compromised!!";
    static final String DIZZY_INF = " feels dizzy! Defense reduced!";
    static final String ARMOR_CRUNCH_INF = " is exposed! Defense compromised!!";
    static final String OOZED_INF = " is enmired in ooze! Speed reduced!";
    static final String FROZEN_INF = " is covered in frost! Speed compromised!!";
    static final String FAINT_INF = " feels faint! Attack reduced!";
    static final String WITHER_INF = " 's muscles have withered! Attack compromised!!";
    static final String HEXED_INF = " is Hexed! All stats reduced!";
    static final String CURSED_INF = " is Cursed! All stats compromised!!";
    static final String POISONED_INF = " is poisoned! Damage over time!";
    static final String BURNING_INF = " is on fire! Massive damage over time!!";
    static final String BRIMSTONE_FLAMES_INF = " is engulfed in ancient flame! Ungodly damage over time!!!";

    //Buffs
    static final String WET_DESC = " feels calm as a brook! Health increased!";
    static final String STONED_DESC = " feels sturdy as a mountain! Defense increased!";
    static final String SEETHING_DESC = " feels powerful as a fire! Attack increased!";
    static final String WINDED_DESC = " feels light as a feather! Speed increased!";

    //endregion

    //region Conditions
    //static final Condition X = new Condition("X", null, 0, 0, 0, 0, X_INF, true);

    //Debuffs
    //static final Condition BLEEDING = new Condition("Bleeding", null, 0, 0, 0, 0, BLEEDING_INF, true, true);
    //static final Condition POISONED = new Condition("Poisoned", null, 0, 0, 0, 0, POISONED_INF, true, true);

    //Buffs

    //endregion

    //region Condition Functions



    //endregion

    //endregion

    //Entities

    //region Monsters=======================================================================================

    //region Monster Attack Descriptions

    final static String BITE_DESC = " bit ";
    final static String PECK_DESC = " pecked at ";
    final static String PUNCH_DESC = " punched ";
    final static String CLUB_DESC = " used its club to bludgeon ";
    final static String SCRATCH_DESC = " scratched at ";
    final static String SLIMED_DESC = " oozed on ";
    final static String POISONED_DESC = " injected poison into ";

    //endregion

    //region Monster Attacks

    //Attacks

    final static Attack BITE =      new Attack("Bite", BITE_DESC,           1.00, 0);
    final static Attack PECK =      new Attack("Peck", PECK_DESC,           1.00, 0);
    final static Attack PUNCH =     new Attack("Punch", PUNCH_DESC,         0.80, 0);
    final static Attack CLUB =      new Attack("Club", CLUB_DESC,           1.20, 0);
    final static Attack SCRATCH =   new Attack("Scratch", SCRATCH_DESC,     0.50, 0);
    final static Attack SLIMED =    new Attack("Slime", SLIMED_DESC,        1.00, 0);
    final static Attack POISON =    new Attack("Poison", POISONED_DESC,     0.20, 0);

    //Spells

    //endregion

    //region Monster Descriptions

    final static String SLIME_DESC = "An oozing pile of \"sentient\" goo that dissolves anything it touches\ntastes like bananas";
    final static String GOBLIN_DESC = "A disheveled, green humanoid with a long nose, pointed chin, hunched back, and a thirst for\nviolence and gold";
    final static String CROW_DESC = "A black-feathered bird with a glossy sheen and an appetite for shiny objects\nWatch your eyes!";
    final static String SNEERTHORN_DESC = "An angry, overgrown bramble with a sharp exterior\nand harsh political opinions";
    final static String MITE_DESC = "A massive flea that is not quite sure what its doing here\nIt loves haircuts";
    final static String BOSS1_DESC = "Rats get bigger the longer they live, and this one is the size of a wagon!\nIt could be well over 100 years old";

    //endregion

    //region Monster Constructors
    // final static Monster X = new Monster("X", X_DESC, new int[] {}, new Attack[] {}, new Spell[] {}, 0)

    //region Floor 1 Monsters
    final static Monster SLIME =            new Monster("Slime", X_DESC,        new int[] {0, 0, 0, 0}, new Attack[] {null, null}, new Spell[] {}, 0);
    final static Monster GOBLIN =           new Monster("Goblin", X_DESC,       new int[] {0, 0, 0, 0}, new Attack[] {null, null}, new Spell[] {}, 0);
    final static Monster CROW =             new Monster("Crow", X_DESC,         new int[] {0, 0, 0, 0}, new Attack[] {null, null}, new Spell[] {}, 0);
    final static Monster SNEERTHORN =       new Monster("Sneerthorn", X_DESC,   new int[] {0, 0, 0, 0}, new Attack[] {null, null}, new Spell[] {}, 0);
    final static Monster MITE =             new Monster("Mite", X_DESC,         new int[] {0, 0, 0, 0}, new Attack[] {null, null}, new Spell[] {}, 0);
    final static Monster BOSS1RAT =         new Monster("Giga Rat", X_DESC,     new int[] {0, 0, 0, 0}, new Attack[] {null, null}, new Spell[] {}, 0);

    final static Monster[] MONSTER_INDEX_F1 = {SLIME, GOBLIN, CROW, SNEERTHORN, MITE, BOSS1RAT};
    final static int MONSTER_COUNT_F1 = 20;

    //endregion

    //region Floor 2 Monsters

    Entity zombie;
    Entity snatcher;
    Entity ghost;
    Entity butcherer;
    Entity jack;

    Entity boss2Jonkler;

    final static int MONSTER_COUNT_F2 = 35;

    //endregion

    //region Floor 3 Monsters

    Entity beholder;
    Entity painElemental;
    Entity ogre;
    Entity possessedArmor;
    Entity witch;

    Entity bossFinalXero;

    final static int MONSTER_COUNT_F3 = 70;

    //endregion

    final static Monster[][] MONSTER_INDEX = {MONSTER_INDEX_F1,{},{}};
    final static int[] MONSTER_COUNT = {MONSTER_COUNT_F1, 0, 0};
    static byte monsterPPmeter = 0;

    //endregion

    //endregion

    //region Stats/Inventory================================================================================

    static ArrayList<Item> itemInventory = new ArrayList<Item>(List.of(Item.NewInst(0), Item.NewInst(0), Item.NewInst(0), Item.NewInst(3)));
    static ArrayList<Armor> armorInventory = new ArrayList<Armor>(0);
    static ArrayList<Weapon> weaponInventory = new ArrayList<Weapon>(0);
    static ArrayList<Charm> charmInventory = new ArrayList<Charm>(0);
    static ArrayList<? extends NameObject>[] INVENTORY_ARRAY = new ArrayList[] {itemInventory, armorInventory, weaponInventory, charmInventory};
    static int partyGold = 0;

    static int[] location = {0, 2, 0};

    static int monsterCountF1 = MONSTER_COUNT_F1;
    static int monsterCountF2 = MONSTER_COUNT_F2;
    static int monsterCountF3 = MONSTER_COUNT_F3;
    final static int[] MONSTER_COUNT_EFF = {monsterCountF1, monsterCountF2, monsterCountF3};

    static byte ppMeter = 0;

    static boolean shopkeepFound = false;
    static byte floorsFound = 0;

    static Hero[] partyArray = {Hero.GetNew(0,0), Hero.GetNew(0,1), Hero.GetNew(0,2), Hero.GetNew(0,3)};

    //endregion

    //Gameplay

    //region Map============================================================================================

    //CONSTRUCTORS

    //region Floor Plans

    //0b00000000,
    //0> north, 1> east, 2> south, 3> west, 4> checked, 5> portal, 6> miniboss, 7> boss

    static byte[][] ROOM_TABLE_F1 = {
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00100001, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b01000000, (byte) 0b11110000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000}
    };

    static byte[][] ROOM_TABLE_F2 = {
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000}
    };

    static byte[][] ROOM_TABLE_F3 = {
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000001, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000},
            {(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000}
    };

    static final byte[][][] ROOM_TABLE = {ROOM_TABLE_F1, ROOM_TABLE_F2, ROOM_TABLE_F3};

    //endregion

    //region Treasure Indexes

    //0,

    static final int[][] TREASURE_INDEX_F1 = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
    };

    static final int[][] TREASURE_INDEX_F2 = {
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0}
    };

    static final int[][] TREASURE_INDEX_F3 = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    static final int [][][] TREASURE_INDEX = {TREASURE_INDEX_F1, TREASURE_INDEX_F2, TREASURE_INDEX_F3};

    //endregion

    //METHODS

    //region Map Movement/Searching

    //Returns boolean based on room info (HELPER FUNCTION)
    //0>North 1>east 2>south 3>west 4>searched 5>portal 6>miniboss 7>boss
    public static boolean CheckRoom(int cond, byte room) {

        if ((room & (1 << cond)) != 0){return true;}else{return false;}

    }

    //Asks the player which door to exit through
    public static void PromptMenuLeaveRoom() {

        byte currRoom = ROOM_TABLE[location[2]][location[1]][location[0]];
        ArrayList<String> directionList = new ArrayList<String>();

        if (CheckRoom(0, currRoom)) {
            directionList.add("North");
        }
        if (CheckRoom(1, currRoom)) {
            directionList.add("East");
        }
        if (CheckRoom(2, currRoom)) {
            directionList.add("South");
        }
        if (CheckRoom(3, currRoom)) {
            directionList.add("West");
        }

        int answer = Text.PrintMenu(directionList.toArray(new String[0]), true);

        switch (directionList.get(answer)) {
            case "North":
                location[1] += 1;
                break;
            case "East":
                location[0] += 1;
                break;
            case "South":
                location[1] -= 1;
                break;
            case "West":
                location[0] -= 1;
                break;
        }

        if (answer != (directionList.size() - 1)) {

            System.out.println("The party moved through the " + directionList.get(answer).toLowerCase() + " door.\n");

        }
        else {

            System.out.println("The party remained in the room.\n");

        }

        System.out.println("The party is in room (" + location[0] + ", " + location[1] + ")");
        Text.Prompt();

        BattleCheck();

        return;

    }

    //Returns the party to the entrance of the temple
    public static void MagicMirror() {

        System.out.println("Are you sure?");
        Text.PromptYN();

        if (Text.PromptYN() == true) {
            location[0] = location[2] + 2;
            location[1] = 0;
            System.out.println("The party gazes into the mirror and is instantly transported to the entrance of the" + XERO + " Temple." + RESET);
            Text.Prompt();
        }

        return;

    }

    //Searches the room for treasure
    public static void SearchRoom() {

        Text.EMPTY_FUNCTION();

    }

    //endregion

    //region Map Printing

    //Prints map of the current floor
    public static void PrintMap() {

        byte[][] floor = ROOM_TABLE[location[2]];

        PrintMapNS(floor[0], 1);
        for (int i = 0; i < floor.length; i++) {

            PrintMapEW(floor[i]);
            if (i == (floor.length - 1)) {
                PrintMapNS(floor[i], -1);
            }
            else {
                PrintMapNS(floor[i], 0);
            }

        }

        PrintMapLegend();

        Text.Prompt();

    }

    //Prints the map's north and south doors (HELPER FUNCTION)
    public static void PrintMapNS(byte[] row, int special) {

        if (special == 0) {

            System.out.print(MAP3E);
            for (int i = 0; i < row.length; i++) {

                System.out.print(MAPLNH);
                if (CheckRoom(5, row[i]) == true) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(MAPLNH);
                }
                System.out.print(MAPLNH);
                if (i != (row.length - 1)) {
                    System.out.print(MAP4CROSS);
                }
                else {
                    System.out.println(MAP3W);
                }

            }

        }
        else if (special == 1) {

            System.out.print(MAPNW);
            for (int i = 0; i < row.length; i++) {

                System.out.print(MAPLNH + MAPLNH + MAPLNH);
                if (i != (row.length - 1)) {
                    System.out.print(MAP3S);
                }
                else {
                    System.out.println(MAPNE);
                }

            }

        }
        else {

            System.out.print(MAPSW);
            for (int i = 0; i < row.length; i++) {

                System.out.print(MAPLNH);
                if (CheckRoom(5, row[i])) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(MAPLNH);
                }
                System.out.print(MAPLNH);
                if (i == (row.length - 1)) {
                    System.out.println(MAPSE + "\n");
                }
                else {
                    System.out.print(MAP3N);
                }

            }

        }

    }

    //Prints the map's east and west doors (HELPER FUNCTION)
    public static void PrintMapEW(byte[] row) {

        System.out.print(MAPLNV);
        for (int i = 0; i < row.length; i++) {

            System.out.print(" ");
            if (CheckRoom(3, row[i])) {
                System.out.print(MAPSEARCHED);
            }
            else if (CheckRoom(2, row[i])) {
                System.out.print(MAPPORTAL);
            }
            else if (CheckRoom(1, row[i])) {
                System.out.print(MAPMINI);
            }
            else if (CheckRoom(0, row[i])) {
                System.out.print(MAPBOSS);
            }
            else {
                System.out.print(" ");
            }
            System.out.print(" ");
            if (CheckRoom(6, row[i])) {
                System.out.print(" ");
            }
            else {
                System.out.print(MAPLNV);
            }

        }

        System.out.println("");

    }

    //Prints the map legend (HELPER FUNCTION)
    public static void PrintMapLegend() {

        Text.EMPTY_FUNCTION();

    }

    //endregion

    //endregion

    //region Battle System==================================================================================

    //Checks if a battle should happen based on random number generation
    public static void BattleCheck() {

        if (rand.nextInt(MONSTER_COUNT[location[2]]) < MONSTER_COUNT_EFF[location[2]]) {
            Battle();
        }
        return;

    }

    //Framework for battles. Loops until one side wins
    public static void Battle() {

    }

    //Prompts the user to choose an action for the hero
    public static void PrintBattleMenu(Hero currHero, ArrayList<Monster> monsterList) {

    }

    //Hero uses an Item (Battle)
    public static void UseItemBattle(Hero target) {

    }

    //Decides the order of turns in a battle cycle
    public static ArrayList<Entity> DecideTurnOrder(ArrayList<Monster> monsterList) {

        return null;

    }

    //Adds Power Points to a party's PP Meter
    public static void AddPP(int pp, boolean hero) {

        if (hero == true) {
            ppMeter += pp;
            if (ppMeter > 100) {
                ppMeter = 100;
            }
        }
        else {
            monsterPPmeter += pp;
            if (monsterPPmeter > 100){
                monsterPPmeter = 100;
            }
        }

    }

    //endregion

    //region Sequences======================================================================================

    public static void SequenceIntro(){

        System.out.println("Having journeyed for days through tens of miles of treacherous terrain");
        System.out.println("the party finds itself face to face with an ancient temple.");
        System.out.println("Despite dark forests, barren deserts, burning crags, and deep mires");
        System.out.println("here before you lay the Temple of" + XERO + " Xero, the Blood Goddess" + RESET + ".\n");
        Text.Prompt();

        System.out.println("The wise old sage, Uncle Bob, leader and founder of your group, brought");
        System.out.println("you together for the purpose of fulfilling the" + GOLD + " Golden Prophecy " + RESET + "foretold");
        System.out.println("in ages past. The" + GOLD + " Prophecy " + RESET + "states that at the seventh toll of the");
        System.out.println(XERO + "Doomsday Clock" + RESET + ", four" + HERO + " Heroes " + RESET + "will rise to defeat the" + XERO + " Blood Goddess" + RESET + ".\n");
        Text.Prompt();

        System.out.println("This group of" + HERO + " Heroes " + RESET + "consists of:\n");
        System.out.println("Journey, the renowned sorceress and swordfighter, known for her ice magic and raw destructive power,");
        System.out.println("Alexander, the Captain of the Royal Guard with his impeccable musketeering and indomitable grit,");
        System.out.println("Uncle Bob, the wise sage and hermit of the" + GOLD + " Golden Scrolls " + RESET + "who possesses knowledge and spells beyond compare,");
        System.out.println("And Luna, the Witch Doctor of the Xenomite Caves with her life giving medicine and deadly poisons.\n");
        Text.Prompt();

        System.out.println("The brave" + HERO + " Heroes " + RESET + "prepare themselves for the worst, and march forward");
        System.out.println("into the" + XERO + " Blood Temple" + RESET + ".\n");
        Text.Prompt();
        return;

    }

    public static void SequenceTutorial(){

        System.out.println(STAR3 + " GAMEPLAY TUTORIAL " + STAR3 + "\n");
        System.out.println("This small game is not JUST a choose your own adventure, but also includes");
        System.out.println("a turn-based RPG battle system and a dungeon exploration system");
        Text.Prompt();

        System.out.println("As for the battle system:\n");
        System.out.println("A battle occurs when the" + HERO + " Hero " + RESET + "party and a" + XERO + " Monster " + RESET + "party meet.\n");
        System.out.println("All characters," + HERO + " Heroes " + RESET + "and" + XERO + " Monsters " + RESET + "alike, have four basic stats:\n");
        System.out.println(HEART + " Health (HP) - If you run out, you die;");
        System.out.println(SHARP + " Attack (ATK) - Dictates how much health is deducted from your target's HP when fighting;");
        System.out.println(SAFE + " Defense (DEF) - Reduces the amount of incoming damage;");
        System.out.println(SPIRAL + " Speed (SPD) - Determines the order of who acts first in a Battle Cycle.");
        Text.Prompt();

        System.out.println("There are also four different kinds of actions in a battle:\n");
        System.out.println(" - 1. Attacking deals damage to a target in the opposing party;");
        System.out.println(" - 2. Casting a Spell can do a variety of things depending on what is cast, but it takes energy to perform;");
        System.out.println(" - 3. Using an Item expends an object from the party's inventory;");
        System.out.println(" - 4. Guarding causes the user to gain temporary defense.\n");

        System.out.println("When a character's turn comes, they can make an amount of actions based on their Move Points (AP).");
        System.out.println("Every turn, each character is allotted 3 AP. Different actions take different amounts of AP.");
        System.out.println("AP rolls over between turns, so if a character does nothing one turn, it can do twice as much the next turn (Max 10 AP).");
        System.out.println("One \"Battle Cycle\" completes every time all characters have a turn.");
        Text.Prompt();

        System.out.println("Both parties in a battle have a Power Point (PP) meter. Power Points are the energy necessary for");
        System.out.println("casting spells. A little PP can be gained from Attacking, A lot of PP can be gained from Guarding,");
        System.out.println("and no PP is gained from using an Item unless the item itself raises PP.\n");

        System.out.println("Each party shares a single PP meter. This means that characters with less to do in a turn are not complete");
        System.out.println("dead weight as they can guard to contribute PP to more active characters. This also means that only one or two");
        System.out.println("spells can be used per Cycle as each character does not draw from their own individual pool of PP.");
        Text.Prompt();

        System.out.println("Finally, all characters are subject to \"Conditions\". Conditions are statuses that last a few turns");
        System.out.println("and can cause a variety of effects. Some conditions reduce stats, some increase stats, and others");
        System.out.println("do something entirely unique. Conditions are usually inflicted by spells, but some normal attacks");
        System.out.println("have Conditions tied to them.");
        Text.Prompt();

        System.out.println("As for dungeon exploration:\n");
        System.out.println("The" + XERO + " Blood Temple " + RESET + "has three floors. The first floor has 25 rooms (5x5), the second");
        System.out.println("has 49 (7x7), and the final has 81 (9x9). Each floor has a" + XERO + " Boss Room " + RESET + "with a very difficult" + XERO + " Boss Monster " + RESET);
        System.out.println("inside. The" + XERO + " Boss Room " + RESET + "requires a" + XERO + " Boss Key " + RESET + "to enter, which is stashed in one of the rooms on the floor.");
        System.out.println("Once the" + XERO + " Boss Monster " + RESET + "is defeated, a stairwell leading to the next floor will appear at the entrance to the");
        System.out.println(XERO + "Temple" + RESET + "." + XERO + " Xero " + RESET + "herself resides in the final floor as its" + XERO + " Boss Monster" + RESET);
        Text.Prompt();

        System.out.println("Each room has up to four doors, North, South, East, and West. Not all rooms have");
        System.out.println("all four doors, however. Some have as few as only a single entrance. Each time a");
        System.out.println("room is entered, there is a chance for a battle to occur. After defeating a party");
        System.out.println("of" + XERO + " monsters" + RESET + ", the floor's" + XERO + " monster count " + RESET + "is reduced, lowering the chance of an encounter");
        System.out.println("until there are no" + XERO + " monsters " + RESET + "left.");
        Text.Prompt();

        System.out.println("Armor, weapons, charms, and items can be found in rooms after defeating any" + XERO + " monsters " + RESET);
        System.out.println("that are encountered. These objects will be of great use during your exploration, so");
        System.out.println("make sure to search every room you enter before leaving.\n");

        System.out.println("A map is available at all times, so make sure to use it frequently to keep your bearings.");
        Text.Prompt();
        return;

    }

    //endregion

    //Others

    //region Overworld Menu=================================================================================

    //This prompts the user to use any of the menu options for the overworld
    public static void PromptMenuOverworld() {

        switch (Text.PrintMenu(new String[] {"Party Info", "Inventory", "Check Map", "Leave Room", "Search Room"}, false)) {
            case 0:
                PromptMenuPartyInfo();
                break;
            case 1:
                PromptMenuInventory();
                break;
            case 2:
                PrintMap();
                break;
            case 3:
                PromptMenuLeaveRoom();
                break;
            case 4:
                SearchRoom();
                break;
        }

    }

    public static void PromptMenuPartyInfo() {

        for (int i = 0; i < partyArray.length; i++) {
            System.out.print(i + ". ");
            partyArray[i].PrintHP(true);
            System.out.println();
        }

        System.out.print("\nDescribe a hero?:"); Text.PromptYN();

        if (Text.PromptYN()) {
            int whichHero = Text.PrintMenu(Arrays.stream(partyArray).map(Hero::GetName).toArray(String[]::new), true);

            if (whichHero != partyArray.length) {
                partyArray[whichHero].DescribeHero();
            }
            else {
                return;
            }
        }
        else {
            return;
        }

    }

    //region Inventory

    public static void PromptMenuInventory() {

        System.out.println("Which Inventory?:\n");

        int whichInv = Text.PrintMenu(new String[] {"Items", "Weapons", "Armors", "Charms"}, true);

        if (whichInv == 4) {
            return;
        }
        else {
            int whichObject  = Text.PrintMenu(INVENTORY_ARRAY[whichInv].stream().map(NameObject::GetName).toArray(String[]::new), true);

            if (whichObject == INVENTORY_ARRAY[whichInv].size()) {
                return;
            }
            else {

                NameObject object = INVENTORY_ARRAY[whichInv].get(whichObject);

                if (object instanceof Equippable) {
                    int whichEquippable = Text.PrintMenu(new String[] {"Equip", "Description"}, true);

                    if (whichEquippable == 2) {
                        return;
                    }
                    else if (whichEquippable == 1) {
                        DescribeEquippable((Equippable) object);
                        return;
                    }
                    else {
                        EquipEquippable((Equippable) object);
                        return;
                    }

                }
                else {
                    DescribeItem((Item) object);
                }

            }
        }

    }

    public static void DescribeItem(Item item) {

        System.out.println(item.description);
        if (item.statistics[0] != 0) {
            System.out.println("HP: " + item.statistics[0]);
        }
        if (item.statistics[1] != 0) {
            System.out.println("AP: " + item.statistics[1]);
        }
        if (item.statistics[2] != 0) {
            System.out.println("PP: " + item.statistics[2]);
        }
        if (item.statistics[3] != 0) {
            System.out.println("Condition: ");
        }
        Text.Prompt();

    }

    public static void ConsumeItem(Item item) {
        Text.EMPTY_FUNCTION();
    }

    public static void DescribeEquippable(Equippable equippable) {
        Text.EMPTY_FUNCTION();
    }

    public static void EquipEquippable(Equippable equippable) {
        Text.EMPTY_FUNCTION();
    }

    //endregion

    //Check Map, Leave Room, and Search Room methods are in the Map region

    //endregion

    //endregion

    //region Main Method====================================================================================

    //Main
    public static void main(String[] args){

        /*
        //region Opening Text

        System.out.println("\n\nPress ENTER to advance the text when prompted with [NEXT]\n");
        Prompt();

        System.out.println("Skip Introduction?");
        PromptYN();

        if (ynValue == false) {

            SequenceIntro();

        }

        System.out.println("Skip Tutorial?");
        PromptYN();

        if (ynValue == false) {

            SequenceTutorial();

        }

        System.out.println("Are you prepared?");
        PromptYN();

        if (ynValue == true) {

            System.out.println("Very good. Fate waits for no man.");

        }
        else {

            System.out.println("How unfortunate. Fate waits for no man...");

        }

        Prompt();

        //endregion
          */

        //region Gameplay

        //region Startup

        //Introducing
        System.out.println("Our" + HERO + " Heroes " + RESET + "find themselves before the gaping maw of the" + XERO + " Blood Temple\n" + RESET);
        System.out.println("They enter");
        Text.Prompt();

        //endregion

        //region Gameplay loop

        while (true) {

            PromptMenuOverworld();

        }

        //endregion

        //endregion

    }

    //endregion

}
