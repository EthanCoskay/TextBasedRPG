public class Location {
    private String name;
    private Item item;
    private Monsters monster;
    private Location north;
    private Location east;
    private Location south;
    private Location west;

    //Constructs Location with only an item
    public Location(Item item) {
        this.item = item;
    }

    //Constructs Location with an item and monster
    public Location(Item item, Monsters monster) {
        this.item = item;
        this.monster = monster;
    }

    //Constructs Location with Item, a name, a monster, and the locations around it
    public Location(String name, Item item, Monsters monster, Location north, Location east, Location south, Location west) {
        this.name = name;
        this.item = item;
        this.monster = monster;
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    //Gets the name of the Location
    public String getName() {
        return name;
    }

    //Gets the item in the location
    public Item getItem() {
        return item;
    }

    //Gets the Monster in the location
    public Monsters getMonster() {
        return monster;
    }

    //Gets the location to the north
    public Location getNorth() {
        return north;
    }

    //Gets the location to the east
    public Location getEast() {
        return east;
    }

    //Gets the location to the south
    public Location getSouth() {
        return south;
    }

    //Gets the location to the west
    public Location getWest() {
        return west;
    }
}