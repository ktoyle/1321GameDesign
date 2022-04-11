
import java.util.Random;
import java.util.Scanner;

class NPC {
    private int healthpoints;
    private int attack;
    private int exp;
    private int defense;
private int defendamount;
    public NPC(int attack, int healthpoints, int defense) {
        this.attack = attack;
        this.healthpoints = healthpoints;
        this.defense = defense;
        exp = 0;
    }
    public NPC() {

    }
    public int originalhealth(int health){
        healthpoints=health;
        return healthpoints;
    }

    public int newHealth(int attack) {
        healthpoints = healthpoints - attack;
        return healthpoints;
    }
    public int defendamount(int attack){
        defendamount=attack;
        return defendamount;
    }
    public int def(){
        return defendamount;
    }

    public int defend(int attack) {
        attack = (defense - attack);
        if (attack < 0) {
            attack = 0;
        }
        defendamount(attack);
        healthpoints = healthpoints - attack;
        return healthpoints;
    }

    public String run() {
        String chance = "";
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        if (number < 5) {
            chance = "fail";
            System.out.println("You failed to run.");
        }
        if (number >= 5) {
            chance = "success";
            System.out.println("You were successful in escaping.");
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
public int addexp(int exp){
        this.exp=this.exp+exp;
        return this.exp;
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
public int stored2=0;
public float mult=1.2f;
public int health;
        public int expcost = 80;
        public Player() {
            super();


        }
        public Player(int attack, int healthpoints, int defense) {
            super(attack, healthpoints, defense);

        }


        public int newExpAmout() {
            expcost = (int) (expcost * 1.2);
            return expcost;
        }
        public int multiply() {
            stored2*=1.2;

            return stored2;
        }
        public int stored() {

            return stored2;
        }
        public void Store() {
            Scanner scan= new Scanner(System.in);
            int choice;
            System.out.println("Type 1 to go store exp and type 2 to get your exp out of storage:");
            choice=scan.nextInt();
switch(choice) {

    case 1:
    System.out.println("You currently have " + super.exp()+". How much exp would you like to store? ");
    int stored = 0;
    stored = scan.nextInt();

        if (stored >super.exp()) {
            System.out.println("You do not have enough exp to store.");
            break;
        }
    int exp = super.exp();
    exp = exp - stored;

    stored2 += stored;

    newexp(exp);
    break;
    case 2:
        System.out.println("You currently have " + stored() +" exp stored. How much exp would you like to take out? ");
        int takeOut=0;
        takeOut=scan.nextInt();
        if(takeOut>stored()){
            System.out.println("You do not have enough to take out.");
            break;
        }
        exp=takeOut;
        stored2=stored2-takeOut;
        super.addexp(exp);
        break;
    default: break;
}
        }
        public  void upgrade() {
            int exp= super.exp();
            System.out.println("You currently have " + exp+" exp and all items currently cost "+expcost+".");
            System.out.println("To upgrade strength type 1.\n"+ "To upgrade defense type 2.\n"+"To upgrade health type 3.\n "+ "Type any other number to leave.");
        }

        public void upgrade(int choice) {

            int exp = super.exp();
            switch (choice) {
                case 1:
                    if (exp < expcost) {
                        System.out.println("You do not have exp to purchase currently.");
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
                        System.out.println("You do not have exp to purchase currently.");
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
                        System.out.println("You do not have exp to purchase currently.");
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

        }

        public String choice(int num){

            if(num==0){
            System.out.println("You have entered a battle. ");}
          else  if(num==1){
                System.out.println("You have entered a boss battle. ");
            }
            Scanner scan=new Scanner(System.in);
            String choice="";
            if(num==0){
                System.out.println("Would you like to attack, defend, or run?");
                choice=scan.nextLine();
            }
           else  if(num==1){
                System.out.println("Would you like to attack or defend?");
                choice=scan.nextLine();
            }

            while (!choice.equals("attack")&&!choice.equals("defend")&&!choice.equals("run")){
                System.out.println("That is not a valid choice! Enter attack, defend, or run! ");
                choice=scan.nextLine();
            }
            return choice;
        }

        public String action(Player player, Enemies enemy , String choice,String Enemychoice,int num){
            String run="fail";
            if (choice.equals("attack")&&Enemychoice.equals(("attack"))){
                enemy.newHealth(player.attack());
                player.newHealth(enemy.attack());
                System.out.println("You did "+player.attack()+" damage.");
                System.out.println("The enemy did "+enemy.attack()+" damage.");
            }

          else if (choice.equals("defend")&&Enemychoice.equals("attack")){
player.defend(enemy.attack());
                System.out.println("You defended and took "+player.def()+" damage.\n");
            }
            else if (choice.equals("attack")&&Enemychoice.equals("defend")){
                enemy.defend(player.attack());
                System.out.println("The enemy defended and took "+enemy.def()+" damage.\n");
            }
          else if(choice.equals("run")){
              if(num==0) {
                  run = player.run();
              }
              if(num==1){
                  while(choice.equals("run")){
                  System.out.print("You cant run from the boss! Either attack or defend!");
                  run="fail";
                  Scanner scan=new Scanner(System.in);
                  choice=scan.nextLine();

                      if (choice.equals("attack")&&Enemychoice.equals(("attack"))){
                          enemy.newHealth(player.attack());
                          player.newHealth(enemy.attack());
                          System.out.println("You did "+player.attack()+" damage.");
                          System.out.println("The enemy did "+enemy.attack()+" damage.\n");
                      }

                      else if (choice.equals("defend")&&Enemychoice.equals("attack")){
                          player.defend(enemy.attack());
                          System.out.println("You defended and took "+player.def()+" damage.");
                      }
                      else if (choice.equals("attack")&&Enemychoice.equals("defend")) {
                          enemy.defend(player.attack());
                          System.out.println("The enemy defended and took " + enemy.def() + " damage.\n");
                      }
                              else if(choice.equals("defend")&&Enemychoice.equals("defend")){
                              System.out.println("You both defended.");
                              }

                  }
              }
            }
          else if(choice.equals("defend")&&Enemychoice.equals("defend")){
                System.out.println("You both defended.");

            }

          return run;
        }


        public int health (Player player){
            health=player.healthpoints();
            return health;
        }

        public void fullheal(Player player){
            player.originalhealth(health);

        }
    }

    class Enemies extends NPC {
        public Enemies(int attack, int healthpoints, int defense) {
            super(attack, healthpoints, defense);
        }
        public String decison(){
            Random rand = new Random();
            int number = rand.nextInt(10) + 1;
            String choice="";
            if (number < 5) {
              choice="attack";
            }
           else if (number >= 5) {
               choice= "defend";
            }
            return choice;
        }
public int battlewon(Player player){
            int exp=100;
            player.addexp(exp);
            return exp;
}



}



