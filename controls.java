import java.util.Scanner;

public class controls{

    public int turnCount;
    public  float playerCurrentExp;
    public float currentPrice;
    public  float interestRate;
    public float inflationRate;

    public controls() {

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
        Enemies normal= new Enemies(4,8,5);
        Enemies boss=new Enemies(8,15,6);
        chest chest=new chest();
        String choice="";

        int turn = 0;
        Combat com=new Combat();
        String cont="";

        while(turn < 10&& !cont.equals("lose")&&!cont.equals("win")) {

            do {
                System.out.println("You have 3 paths in front of you. Where do you want to go?");

                choice = sc.nextLine();

                if (choice.equals("f")) {

                    System.out.println("You went forward.");

                } else if (choice.equals("l")) {
                    System.out.println("You went left.");

                } else if (choice.equals("r")) {
                    System.out.println("You went right.");


                } else if (choice.equals("u")) {


                    player.upgrade();
                    int num = scanner();

                    player.upgrade(num);

                } else if (choice.equals("s")) {

                    player.Store();


                }
                else if(choice.equals("h")){
                    Printer.help();
                }
                if (!choice.equals("l")&&!choice.equals("u")&&!choice.equals("f")&&!choice.equals("r")&&!choice.equals("h")&&!choice.equals("s")){
                    System.out.println("That is not a valid input");
                }
            }

            while (!choice.equals("l")&&!choice.equals("u")&&!choice.equals("f")&&!choice.equals("r")&&!choice.equals("h")&&!choice.equals("s"));

            if (choice.equals("u")){



                continue;
            }
            else if (choice.equals("s")){


                continue;

            }
            else if(choice.equals("h")){
                continue;
            }
            turn++;
            chest.Chest(player);
            player.multiply();

            if(!cont.equals("lose")){
                if(turn==2){
                    cont=com.battle(player,normal,0);
                }

                else if(turn==4){
                    cont=com.battle(player,normal,0);
                }
                else if(turn==6){
                    cont=com.battle(player,normal,0);
                }
                else if(turn==8){
                    cont=com.battle(player,normal,0);
                }
                else if(turn==10){
                    cont=com.battle(player,boss,1);
                }

            }

        }

        t.setTurn(turn);

        return t.getTurn();



    }
    public int level2(turncount t, Player player){

        Scanner sc = new Scanner(System.in);



        String choice;

        int a = 5;



        while(a < 10){



            System.out.println("You have 3 paths in front of you. Where do you want to go? ");

            choice = sc.nextLine();

            if (choice.equals("f")){

                System.out.println("You went forward.");


            }
            else if (choice.equals("l")){
                System.out.println("You went left.");

            }

            else if (choice.equals("r")){
                System.out.println("You went right.");


            }
            else if (choice.equals("u")){


                player.upgrade();
                int num=scanner();

                player.upgrade(num);
            }

            System.out.println("Here");
            a++;

        }

        t.setTurn(a);

        return t.getTurn();
        
    }}

