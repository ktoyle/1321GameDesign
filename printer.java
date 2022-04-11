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
                "EXP is the currency in this game. You can choose to spend EXP or save up. " +
                "\nHowever, be careful how you spend your EXP. You will earn more EXP by saving. Prices in the upgrade shop will rise the farther you go." +
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
        System.out.println("run - to run");
    }
    }

