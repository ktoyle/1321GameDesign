import java.util.Scanner;
public class Printer {
    //printer class for group project

    //default constructor
    Printer(){
        System.out.println("");
    }

    public static void Welcome(){ //prints welcome screen
        System.out.println("Welcome to Relinquished");
        System.out.println("\n[------------[R]------------]");
        System.out.println("\nIn this game, you are an adventurer. " +
                "\nYou are travelling to a far away kingdom. However, on the way, you entered " +
                "\na deep, dark forest. At first, the path you followed was clear, but " +
                "\nnow you've come to a fork in the road with three different paths:" +
                "\n\n[Left]       [Center]       [Right]" +
                "\n\nYou must choose a path to follow...." +
                "\n" +
                "\nType s to start or m to see the menu");
        Scanner sc = new Scanner(System.in);
            String input = sc.next();
            while (input.equals("m")|| input.equals("s"))
            {if (input.equals("m")){
                Printer.Menu();
            }
            else if (input.equals("s"){
                Sysem.out.println(" ");}
            else {
                 System.out.println("That's not a valid input");}
        
        }

    }


    //prints out menu
    public static void Menu(){
            System.out.println("[Menu]" +
                    "\nUpgrade Shop (type u)" +
                    "\nControls (type c)");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.equals("c")) {
                helpMenu.help();
            }
    }

}

