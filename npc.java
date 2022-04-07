
import java.util.Random;
class NPC {
    public int healthpoints;
     public int attack;
     public int exp;
     public int defense;


     public int newHealth(int attack) {
         healthpoints = healthpoints - attack;
         return healthpoints;
     }
     public int defend(int attack){
         attack=(defense- attack);
         if(attack<0){
             attack=0;
         }
         healthpoints=healthpoints-attack;
         return healthpoints;
     }
public String run(){
     String chance="";
Random rand=new Random();
int number=rand.nextInt(10)+1;
if (number <5){
    chance="fail";
}
if (number >=5){
    chance= "success";
}
         return chance;
}
     public int attack (){
         return attack;
     }
     public int healthpoints (){
         return healthpoints;
     }
     public int exp (){
         return exp;
     }
     public int defense (){
         return defense;
     }

 }



 class Player extends NPC {
     public Player(int attack, int healthpoints, int defense){
       this.attack=attack;
           this.healthpoints=healthpoints;
             this.defense=defense;
     }
     public int newattack(int attack){
     this.attack= attack +this.attack;
         return this.attack;
     }
          public int newhealth(int health){
     healthpoints= health +healthpoints;
         return healthpoints;
     }
       public int newdefense(int defense){
     this.defense= defense +this.defense;
         return this.defense;
     }
 public int newExpAmout(){
      expcost= (int) (expcost*1.2);
         return expcost;
     }
     public void upgrade(){
  System.out.print("You have " +exp);
     }
     public int upgrade(int choice){
         int exp= this.exp;
switch (choice){
    case 1:
        if(exp<expcost){
            break;
        }
exp= exp-expcost;
        int attack=1;
        
        newExpAmout();
        newexp(exp);
        newattack(attack);
        break;
    case 2:

        if(exp<expcost){
            int defense=1;
            newExpAmout();
            newexp(exp);
            newdefense(defense);
            break;
        }
        exp= exp-expcost;
        int defense=1;
        newExpAmout();
        newexp(exp);
        newdefense(defense);
        break;
      
    case 3:
        if(exp<expcost){
            break;
        }
        exp= exp-expcost;
        int healthpoints=1;
        newExpAmout();
        newexp(exp);
        newhealth(healthpoints);
        break;
    default:break;
}
     class Enemies extends NPC {
         public Enemies(int attack, int healthpoints, int defense){
             this.attack=attack;
           this.healthpoints=healthpoints;
             this.defense=defense;
         }
        
     }
