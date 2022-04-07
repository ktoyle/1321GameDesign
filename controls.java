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

   public static int currentTurn(int a){

       Scanner sc = new Scanner(System.in);

    turncount T = new turncount();

       String choice;

        a = 0;



       while(a < 5){



           System.out.println("Where do you want to go");

           choice = sc.nextLine();

           if (choice.equals("f")){

               System.out.println("You went forward");


           }
           else if (choice.equals("l")){
               System.out.println("You went left");

           }

           else if (choice.equals("r")){
               System.out.println("You went right");


           }

           a++;
       }

       T.setTurn(a);

       return T.getTurn();




   }



       public  float exp(){



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


   }

