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
                "\nType Start to start or Controls to see the controls...");
    }

    public void Controls(String input){ //prints controls
        if (input.equals("Controls")) {
            System.out.println("[Controls]" +
                    "\nThe controls for this game include:" +
                    "\nLeft " +
                    "\nStraight" +
                    "\nRight" +
                    "\nMenu");
        }
    }

    //prints out menu
    public void Menu(String input){ //must take in input from the Driver class
        if (input.equals("Menu")){
            System.out.println("[Menu]" +
                    "\nUpgrade Shop" +
                    "\nPlayer Stats" +
                    "\nControls" +
                    "\nRestart");
        }
    }

}
