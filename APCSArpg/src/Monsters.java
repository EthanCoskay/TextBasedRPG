public class Monsters {

    private String name;
    private int health;
    private int damage;
    private String quip;

    //Constructs a monster with a name, health, damage value, and a quip
    public Monsters(String name, int health, int damage, String quip) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.quip = quip;
    }

    //Gets the name of the monster
    public String getName() {
        return name;
    }

    //Gets the health of the monster
    public int getHealth() {
        return health;
    }

    //Gets the damage value of the monster
    public int getDamage() {
        return damage;
    }

    //Gets the quip of the monster
    public String getQuip() {
        return quip;
    }
}