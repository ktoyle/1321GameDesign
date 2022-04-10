import java.util.Scanner;
public class Printer {
    //printer class for group project

    //default constructor
    Printer(){
        System.out.println("");
    }

    public void Welcome(){ //prints welcome screen
        System.out.println("Welcome to Relinquished");
        System.out.println("\n[------------[R]------------]");
        System.out.println("\nIn this game, you are an adventurer. " +
                "\nYou are travelling to a far away kingdom that is said to be made" +
                "\nof the purest gems of starlight. However, on the way, you entered " +
                "\na deep, dark forest. At first, the path you followed was clear, but " +
                "\nnow you've come to a fork in the road with three different paths:" +
                "\n[Left]       [Center]       [Right]" +
                "\nYou must choose a path to follow...." +
                "\n" +
                "\nType h to see the controls...");
        Scanner sc = new Scanner(System.in);
        String inpupt = sc.next();
        while (input.equals("h")){
            if (input.equals("h"){
            Printer.Controls();}
        else{System.out.println("That's not a valid input");}}
       
    }

    public void Controls(){ //prints controls
     
            System.out.println("[Controls]" +
                    "\nThe controls for this game include:" +
                    "\nLeft = l" +
                    "\nForward = f" +
                    "\nRight = r" +
                    "\nMenu = m");
             Scanner sc = new Scanner(System.in);
        String inpupt = sc.next();
             
            if (input.equals("m"){
            Printer.Menu();}
            else{System.out.println("That's not a valid input");}
                
                
    }

   public static void Menu(){ //prints out menu
     System.out.println("[Menu]" +
                    "\nUpgrade Shop (type u)" +
                    "\nControls (type c)");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.equals("c")) {
                helpMenu.help();
            }
            else if (input.equals("u")){
                
            }
       else{ System.out.println("That's not a valid input");
    }

}
