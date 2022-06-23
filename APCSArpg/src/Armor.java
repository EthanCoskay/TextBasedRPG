public class Armor extends Item {
    private int protection;

    //Armor Constructor allows for armor to be made and gets values for the name and protection
    public Armor(String name, int protection) {
        super(name);
        this.protection = protection;
    }

    //Gets the protection value
    public int getProtection() {
        return protection;
    }
}