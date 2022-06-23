public class Game {

    //Gets the Item in that specific location
    public static Item search(Location name) {
        return name.getItem();
    }

    //Gets the monster in that specific location
    public static Monsters searchMonsters(Location name) {
        return name.getMonster();
    }

    //Gets the armor in that specific location
    public static Armor searchArmor(Location name) {
        return (Armor) name.getItem();
    }

    //Gets the weapon in that specific location
    public static Weapons searchWeapon(Location name) {
        return (Weapons) name.getItem();
    }

    //Gets the armor in that specific location
    public static String equipArmor(Armor armor) {
        return "You have equipped " + armor.getName();
    }

    //Equips the weapon in that specific location
    public static String equipWeapon(Weapons weapon) {
        return "You have equipped " + weapon.getName();
    }
}
