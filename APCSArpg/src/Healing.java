public class Healing extends Item {
    private int heal;

    //Constructs a health potion for the user holding the name and heal points
    public Healing(String name, int heal) {
        super(name);
        this.heal = heal;
    }

    //Gets the health point value
    public int getHeal() {
        return heal;
    }
}