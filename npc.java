
import java.util.Random;
class NPC {
    private int healthpoints;
    private int attack;
    private int exp;
    private int defense;

    public NPC(int attack, int healthpoints, int defense) {
        this.attack = attack;
        this.healthpoints = healthpoints;
        this.defense = defense;
        exp = 1000;
    }


    public int newHealth(int attack) {
        healthpoints = healthpoints - attack;
        return healthpoints;
    }

    public int defend(int attack) {
        attack = (defense - attack);
        if (attack < 0) {
            attack = 0;
        }
        healthpoints = healthpoints - attack;
        return healthpoints;
    }

    public String run() {
        String chance = "";
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        if (number < 5) {
            chance = "fail";
        }
        if (number >= 5) {
            chance = "success";
        }
        return chance;
    }

    public int attack() {
        return attack;
    }

    public int healthpoints() {
        return healthpoints;
    }

    public int exp() {
        return exp;
    }

    public int defense() {
        return defense;
    }

    public int newexp(int exp) {
        this.exp = exp;
        return exp;
    }

    public int newattack(int attack) {
        this.attack = attack + this.attack;
        return this.attack;
    }


    public int newhealth(int health) {
        healthpoints = health + healthpoints;
        return healthpoints;
    }

    public int newdefense(int defense) {
        this.defense = defense + this.defense;
        return this.defense;
    }
}

    class Player extends NPC {

        public int expcost = 100;

        public Player(int attack, int healthpoints, int defense) {
            super(attack, healthpoints, defense);

        }


        public int newExpAmout() {
            expcost = (int) (expcost * 1.2);
            return expcost;
        }

        public void upgrade() {
            int exp= super.exp();
            System.out.print("You have " + exp);
        }

        public int upgrade(int choice) {
            int exp = super.exp();
            switch (choice) {
                case 1:
                    if (exp < expcost) {
                        break;
                    }
                    exp = exp - expcost;
                    int attack = 1;

                    newExpAmout();
                    newexp(exp);
                    super.newattack(attack);
                    break;
                case 2:

                    if (exp < expcost) {

                        break;
                    }
                    exp = exp - expcost;
                    int defense = 1;
                    newExpAmout();
                    newexp(exp);
                    super.newdefense(defense);
                    break;

                case 3:
                    if (exp < expcost) {
                        break;
                    }
                    exp = exp - expcost;
                    int healthpoints = 1;
                    newExpAmout();
                    newexp(exp);
                    super.newhealth(healthpoints);
                    break;
                default:
                    break;
            }
            return choice;
        }
    }

    class Enemies extends NPC {
        public Enemies(int attack, int healthpoints, int defense) {
            super(attack, healthpoints, defense);
        }


    }
