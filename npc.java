
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
if (number <5){
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

 }
     class Enemies extends NPC {
         public Enemies(int attack, int healthpoints, int defense){
             this.attack=attack;
           this.healthpoints=healthpoints;
             this.defense=defense;
         }
        
     }
