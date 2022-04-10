import java.util.Scanner;

public class reservoir{

    public int turnCount;
    public  float playerCurrentExp;
    public float currentPrice;
    public  float interestRate;
    public float inflationRate;

    public reservoir() {

        turnCount = 0;
        playerCurrentExp = 1;
        currentPrice = 4;
        interestRate = .5f;
        inflationRate = .3f;

    }
    public static int scanner(){
        Scanner sc = new Scanner(System.in);
        int choice=0;
        choice=sc.nextInt();

        return choice;
    }

    public int currentTurn(turncount t, Player player){

        Scanner sc = new Scanner(System.in);

Enemies enemy1=new Enemies(3,3,3);

        String choice;

       int turnsPassed = 0;
       Combat com=new Combat();
        String cont="";

        while(turnsPassed < 10&& !cont.equals("lose")&&!cont.equals("win")){

            com.battle(player,enemy1,0);

            System.out.println("Where do you want to go");

            choice = sc.nextLine();
            System.out.print(turnsPassed);
            if (choice.equals("f")){

                System.out.println("You went forward");


            }
            else if (choice.equals("l")){
                System.out.println("You went left");

            }

            else if (choice.equals("r")){
                System.out.println("You went right");


            }
            else if (choice.equals("u")){


                player.upgrade();
                int num=scanner();

                player.upgrade(num);
                continue;
            }
            else if (choice.equals("s")){

               player.Store();
               continue;

            }
            else if (choice.equals("h")){

               helpMenu.help();
          }
           
            else{
               System.out.println("Invalid input-Please try again");
               turnsPassed--;
           }

            turnsPassed++;
player.multiply();
if(!cont.equals("lose")){
    if(a==3){
       cont=com.battle(player,enemy1,1);
    }

            }

        }

        t.setTurn(turnsPassed);

        return t.getTurn();



    }
    public int level2(turncount t, Player player){

        Scanner sc = new Scanner(System.in);



        String choice;

        int turnsPassed = 5;



        while(turnsPassed < 10){



            System.out.println("Where do you want to go");

            choice = sc.nextLine();
System.out.print(a);
            if (choice.equals("f")){

                System.out.println("You went forward");


            }
            else if (choice.equals("l")){
                System.out.println("You went left");

            }

            else if (choice.equals("r")){
                System.out.println("You went right");


            }
            else if (choice.equals("u")){


                player.upgrade();
                int num=scanner();

                player.upgrade(num);
            }
            else if (choice.equals("h")){

               helpMenu.help();
          }
              
              else{
               System.out.println("Invalid input-Please try again");
               turnsPassed--;
           }
            
            
            System.out.println("Here");
            turnsPassed++;

        }

        t.setTurn(turnsPassed);

        return t.getTurn();



    }}




   /* public  float exp(){



        int z = reservoir.currentTurn(0)  ;


        for (int i = 0; i < z; i++ ){


            playerCurrentExp = (playerCurrentExp + (playerCurrentExp * interestRate));
        }




        return playerCurrentExp ;

    }

    public float price(){



        int z = reservoir.currentTurn(0)  ;


        for (int i = 0; i < z; i++ ){

            if (turnCount % 4 == 0){
                currentPrice = (currentPrice + (currentPrice * inflationRate));
            }
        }

        return currentPrice;

    }


}*/
