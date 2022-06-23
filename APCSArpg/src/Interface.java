import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Armor cruddyArmor = new Armor("Cruddy Armor", 5);
        Armor chainArmor = new Armor("Chain Armor", 15);
        Armor amazingArmor = new Armor("Amazing Armor", 25);

        Weapons stick = new Weapons("Stick", 10);
        Weapons rustSword = new Weapons("Rusty Sword", 15);
        Weapons richard = new Weapons("Bane of Richard", 25);

        Healing healthPot = new Healing("Health potion", 25);

        Monsters grunt = new Monsters("A Grunt", 10, 5, "Merp!");
        Monsters turk = new Monsters("Egge Man", 25, 10, "Heeeeeeyyyyyy!");
        Monsters sailor = new Monsters("Sailer the Sailor", 50, 15, "Time to Drown!");
        Monsters boss = new Monsters("Josh Ortez", 100, 35, "Your adventure ends here!");

        Location trees = new Location(rustSword);
        Location river = new Location(chainArmor, grunt);
        Location forest = new Location(stick);
        Location cave = new Location(healthPot, turk);
        Location castle = new Location(amazingArmor);
        Location rock = new Location(richard, sailor);
        Location shack = new Location(cruddyArmor);
        Location tower = new Location(healthPot);
        Location dungeon = new Location(healthPot, boss);

        river = new Location("river", chainArmor, grunt, null, null, trees, forest);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        cave = new Location("cave", healthPot, turk, trees, null, null, rock);
        rock = new Location("rock", richard, sailor, shack, cave, null, null);
        dungeon = new Location("dungeon", healthPot, boss, castle, null, null, null);
        tower = new Location("tower", healthPot, null, null, null, castle, null);
        castle = new Location("castle", amazingArmor, null, tower, shack, dungeon, null);
        forest = new Location("forest", stick, null, null, river, shack, null);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        tower = new Location("tower", healthPot, null, null, null, castle, null);
        dungeon = new Location("dungeon", healthPot, boss, castle, null, null, null);
        castle = new Location("castle", amazingArmor, null, tower, shack, dungeon, null);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        rock = new Location("rock", richard, sailor, shack, cave, null, null);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        cave = new Location("cave", healthPot, turk, trees, null, null, rock);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        cave = new Location("cave", healthPot, turk, trees, null, null, rock);
        river = new Location("river", chainArmor, grunt, null, null, trees, forest);
        forest = new Location("forest", stick, null, null, river, shack, null);
        rock = new Location("rock", richard, sailor, shack, cave, null, null);
        castle = new Location("castle", amazingArmor, null, tower, shack, dungeon, null);
        dungeon = new Location("dungeon", healthPot, boss, castle, null, null, null);
        castle = new Location("castle", amazingArmor, null, tower, shack, dungeon, null);
        tower = new Location("tower", healthPot, null, null, null, castle, null);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        forest = new Location("forest", stick, null, null, river, shack, null);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        forest = new Location("forest", stick, null, null, river, shack, null);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        forest = new Location("forest", stick, null, null, river, shack, null);
        river = new Location("river", chainArmor, grunt, null, null, trees, forest);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        rock = new Location("rock", richard, sailor, shack, cave, null, null);
        cave = new Location("cave", healthPot, turk, trees, null, null, rock);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        forest = new Location("forest", stick, null, null, river, shack, null);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        forest = new Location("forest", stick, null, null, river, shack, null);
        river = new Location("river", chainArmor, grunt, null, null, trees, forest);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        rock = new Location("rock", richard, sailor, shack, cave, null, null);
        cave = new Location("cave", healthPot, turk, trees, null, null, rock);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        rock = new Location("rock", richard, sailor, shack, cave, null, null);
        castle = new Location("castle", amazingArmor, null, tower, shack, dungeon, null);
        dungeon = new Location("dungeon", healthPot, boss, castle, null, null, null);
        castle = new Location("castle", amazingArmor, null, tower, shack, dungeon, null);
        tower = new Location("tower", healthPot, null, null, null, castle, null);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        forest = new Location("forest", stick, null, null, river, shack, null);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        forest = new Location("forest", stick, null, null, river, shack, null);
        river = new Location("river", chainArmor, grunt, null, null, trees, forest);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        rock = new Location("rock", richard, sailor, shack, cave, null, null);
        cave = new Location("cave", healthPot, turk, trees, null, null, rock);
        trees = new Location("bunch of trees", rustSword, null, river, null, cave, shack);
        shack = new Location("shack", cruddyArmor, null, forest, trees, rock, castle);
        rock = new Location("rock", richard, sailor, shack, cave, null, null);
        castle = new Location("castle", amazingArmor, null, tower, shack, dungeon, null);
        dungeon = new Location("dungeon", healthPot, boss, castle, null, null, null);
        castle = new Location("castle", amazingArmor, null, tower, shack, dungeon, null);
        tower = new Location("tower", healthPot, null, null, null, castle, null);


        Location hold = shack;

        Scanner in = new Scanner(System.in);

        Weapons weaponEquipped = new Weapons("Fists", 5);
        Armor armorEquipped = new Armor("Skin", 0);
        int health = 50;
        boolean beatGame = false;

        System.out.println("You are in a shack and around you are things that would be in a shack... I think.");

        while(health > 0 && !beatGame) {
            System.out.println("You are now at a " + hold.getName());
            boolean decide = false;
            while(decide != true) {
                System.out.print("Search the area y/n: ");
                String decision = in.next();
                if (decision.equals("y")) {
                    decide = true;
                    System.out.println();
                    System.out.println("You found " + Game.search(hold).getName() + "! Do you want to equip it? y/n");
                    decision = in.next();
                    boolean decideEquip = false;
                    while(decideEquip != true) {
                        if (decision.equals("y")) {
                            decideEquip = true;
                            if (Game.search(hold).getClass().getSimpleName().equals("Armor")) {
                                armorEquipped = Game.searchArmor(hold);
                                System.out.println(Game.equipArmor(Game.searchArmor(hold)));
                            } else if (Game.search(hold).getClass().getSimpleName().equals("Weapons")) {
                                weaponEquipped = Game.searchWeapon(hold);
                                System.out.println(Game.equipWeapon(Game.searchWeapon(hold)));
                            } else {
                                health += healthPot.getHeal();
                                if (health > 50) {
                                    int buffer = health - 50;
                                    health -= buffer;
                                }

                            }
                        } else if (decision.equals("n")) {
                            decideEquip = true;
                            continue;
                        } else {
                            System.out.println("Stop putting in gibberish and play the game!");
                        }
                    }
                    if(Game.searchMonsters(hold) != null) {
                        System.out.println(hold.getMonster().getName() + " approaches you!");
                        System.out.println(hold.getMonster().getQuip());
                        int monsterHealth = hold.getMonster().getHealth();
                        while(health > 0 && monsterHealth > 0) {
                            System.out.println("You attack " + hold.getMonster().getName());
                            System.out.println(hold.getMonster().getName() + " attacks you!");
                            if(armorEquipped.getProtection() < hold.getMonster().getDamage()) {
                                health -= (hold.getMonster().getDamage() - armorEquipped.getProtection());
                                if(health <= 0) {
                                    System.out.println("You died loser!");
                                }
                            }
                            monsterHealth -= weaponEquipped.getDamage();
                            if(hold.getMonster().getName().equals("Josh Ortez") && monsterHealth <= 0) {
                                System.out.println("You beat the game, congrats!");
                                beatGame = true;
                            }
                        }
                    }
                } else if(decision.equals("n")) {
                    decide = true;
                    continue;
                } else {
                    System.out.println("Come on just choose yes or no, is it that hard?");
                }
            }
            boolean change = false;
            while(change != true && health > 0 && !beatGame) {
                System.out.println("Where do you want to go? n/e/s/w");
                String direction = in.next();
                System.out.println();
                if (direction.equals("n")) {
                    if(hold.getNorth() != null) {
                        hold = hold.getNorth();
                        change = true;
                    } else {
                        System.out.println("This location is not available, go elsewhere.");
                    }
                } else if (direction.equals("e")) {
                    if(hold.getEast() != null) {
                        hold = hold.getEast();
                        change = true;
                    } else {
                        System.out.println("This location is not available, go elsewhere.");
                    }
                } else if (direction.equals("s")) {
                    if(hold.getSouth() != null) {
                        hold = hold.getSouth();
                        change = true;
                    } else {
                        System.out.println("This location is not available, go elsewhere.");
                    }
                } else if (direction.equals("w")) {
                    if(hold.getWest() != null) {
                        hold = hold.getWest();
                        change = true;
                    } else {
                        System.out.println("This location is not available, go elsewhere.");
                    }
                } else {
                    System.out.println("Type in a valid direction, otherwise, just don't play the game.");
                }
            }
        }
    }
}
