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



        String choice;

       int turnsPassed = 0;



        while(turnsPassed < 5){



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
                turnsPassed--;
            }
            else if (choice.equals("s")){

               player.Store();
               turnsPassed--;

            }

            turnsPassed++;
player.multiply();
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
            System.out.println("Here");
            turnsPassed++;

        }

        t.setTurn(turnsPassed);

        return t.getTurn();



    }}




   /* public  float exp(){



        int turnsPassed = reservoir.currentTurn(0)  ;


        for (int i = 0; i < turnsPassed; i++ ){


            playerCurrentExp = (playerCurrentExp + (playerCurrentExp * interestRate));
        }




        return playerCurrentExp ;

    }

    public float price(){



        int turnsPassed = reservoir.currentTurn(0)  ;


        for (int i = 0; i < turnsPassed; i++ ){

            if (turnCount % 4 == 0){
                currentPrice = (currentPrice + (currentPrice * inflationRate));
            }
        }

        return currentPrice;

    }


}*/
