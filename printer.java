import java.util.Scanner;
public class Printer {
    //printer class for group project

    //default constructor
    Printer(){
        System.out.println("");
    }

    public static void Welcome(){ //prints welcome screen
        System.out.println("Welcome to Relinquished");
        System.out.println("\nIn this game, you are an adventurer. You are lost in the woods and must find your way out.\n" +
                "EXP is the currency in this game. You can choose to spend exp or save up. " +
                "\nHowever, be careful how you spend your exp. You will earn more exp by saving. Prices in the upgrade shop will rise the farther you go." +
                "\n\nNow lets begin the journey!"  +
                "\nType h to see the controls:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.equals("h")){
            Printer.help();}
        else{System.out.println("That's not a valid input");}

    }

    public static void help(){

        System.out.println("Press: ");
        System.out.println("f - forward");
        System.out.println("r - right");
        System.out.println("l - left");
        System.out.println("h - help");
        System.out.println("u - enter shop");
        System.out.println("s - store xp\n");
        System.out.println("For Combat: ");
        System.out.println("attack - to attack");
        System.out.println("defend - to defend");
        System.out.println("run - to run\n");
        System.out.println("In this game there is an inflation system."+
                "\nThe cost to upgrade will continuously increase whether or not you choose to purchase an upgrade." +
                "\nFinding chest and defeating enemies might help combat this issue, however those are random " +
                "\nencounters and you might find yourself falling behind if luck is not on your side."+
                "\nThe best way to prevent this is by storing your exp. By doing this you can set exp aside, and  " +
                "\nthe amount you store will compound with interest until you choose to take it out, at which point it will be added " +
                "\nto the amount of exp you currently have.");
    }
}
