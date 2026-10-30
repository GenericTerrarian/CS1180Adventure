import java.util.Arrays;

public class Equippable extends NameObject {

    int[] statistics;
    int conditionID;
    int avalibility;

    public Equippable(String nm, String desc, int[] stat, int aval, int coid) {

        super(nm, desc);

        this.statistics = stat; //Health, Defense, Attack, and Speed
        this.avalibility = aval; //The category of weapon or armor OR the id of the charm
        this.conditionID = coid; //The id of the condition applied

    }

    public boolean GetAvailability(Hero hero) {

        if (this.avalibility == -1) {
            return true; //If availability is set to be universal
        }
        else if (this instanceof Charm && (Arrays.stream(hero.availability[2]).anyMatch(a -> (a == this.avalibility)))) {
            return true; //If this equippable is a charm and the hero can take this charm
        }
        else if (this instanceof Weapon && (Arrays.stream(hero.availability[0]).anyMatch(a -> (a == this.avalibility)))) {
            return true; //If this equippable is a weapon and the hero can take this category of weapon
        }
        else if (this instanceof Armor && (Arrays.stream(hero.availability[1]).anyMatch(a -> (a == this.avalibility)))) {
            return true; //If this equippable is an armor and the hero can take this category of armor
        }
        else {
            return false;
        }

    }

}
