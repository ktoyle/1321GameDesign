




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
            System.out.println("you failed to run");
        }
        if (number >= 5) {
            chance = "success";
            System.out.println("you were successful in escaping");
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
public int stored2=0;
public float mult=1.2f;
public int health;
        public int expcost = 100;
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

        public void Store() {
            Scanner scan= new Scanner(System.in);
            int choice;
            System.out.print("");
            choice=scan.nextInt();
switch(choice) {

    case 1:
    System.out.print("");
    int stored = 0;
    stored = scan.nextInt();
    int exp = super.exp();
    exp = exp - stored;

    stored2 += stored;
    newexp(exp);
    break;

    default: break;
}
        }
        public  void upgrade() {
            int exp= super.exp();
            System.out.print("You have " + exp);
        }

        public void upgrade(int choice) {

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

        }

        public String choice(int num){
            if(num==0){
            System.out.println("You have entered a battle. ");}
          else  if(num==1){
                System.out.println("You have entered a boss battle. ");
            }
            Scanner scan=new Scanner(System.in);
            String choice;
            if(num==0){
                System.out.println("Would you like to attack, defend, or run");
                choice=scan.nextLine();
            }
           else  if(num==1){
                System.out.println("Would you like to attack or defend");
                choice=scan.nextLine();
            }
            System.out.println("Would you like to attack, defend, or run");
            choice=scan.nextLine();
            while (!choice.equals("attack")&&!choice.equals("defend")&&!choice.equals("run")){
                System.out.println("That is not a valid choice enter attack,defend, or run ");
                choice=scan.nextLine();
            }
            return choice;
        }
      
        public String action(Player player, Enemies enemy , String choice,String Enemychoice,int num){
            String run="fail";
            if (choice.equals("attack")&&Enemychoice.equals(("attack"))){
                enemy.newHealth(player.attack());
                player.newhealth(enemy.attack());
                System.out.println("You did "+player.attack()+" damage");
                System.out.println("The enemy did "+enemy.attack()+" damage");
            }

          else if (choice.equals("defend")&&Enemychoice.equals("attack")){
player.defend(enemy.attack());
                System.out.println("You defended and took "+player.def()+" damage");
            }
            else if (choice.equals("attack")&&Enemychoice.equals("defend")){
                enemy.defend(player.attack());
                System.out.println("The enemy defended and took "+enemy.def()+" damage");
            }
          else if(choice.equals("run")){
              if(num==0) {
                  run = player.run();
              }
              if(num==1){
                  while(choice.equals("run")){
                  System.out.print("You cant run from the boss either attack or defend");
                  run="fail";
                  Scanner scan=new Scanner(System.in);
                  choice=scan.nextLine();

                      if (choice.equals("attack")&&Enemychoice.equals(("attack"))){
                          enemy.newHealth(player.attack());
                          player.newhealth(enemy.attack());
                          System.out.println("You did "+player.attack()+" damage");
                          System.out.println("The enemy did "+enemy.attack()+" damage");
                      }

                      else if (choice.equals("defend")&&Enemychoice.equals("attack")){
                          player.defend(enemy.attack());
                          System.out.println("You defended and took "+player.def()+" damage");
                      }
                      else if (choice.equals("attack")&&Enemychoice.equals("defend")) {
                          enemy.defend(player.attack());
                          System.out.println("The enemy defended and took " + enemy.def() + " damage");
                      }
                              else if(choice.equals("defend")&&Enemychoice.equals("defend")){
                              System.out.println("You both defended");
                              }

                  }
              }
            }
          else if(choice.equals("defend")&&Enemychoice.equals("defend")){
                System.out.println("You both defended");

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
            player.newexp(exp);
            return exp;
}



}


