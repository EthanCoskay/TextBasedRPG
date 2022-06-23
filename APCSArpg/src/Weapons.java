public class Weapons extends Item {

    private int damage;

    //Constructs a weapon with a name and damage value
    public Weapons(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    //Gets the damage value of the weapon
    public int getDamage() {
        return damage;
    }
}