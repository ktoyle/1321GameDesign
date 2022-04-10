import java.util.Scanner;
public class Printer {
    //printer class for group project

    //default constructor
    Printer(){
        System.out.println("");
    }

    public static void Welcome(){ //prints welcome screen
        System.out.println("Welcome to Relinquished");
        System.out.println("\nIn this game, you are an adventurer. You are lost in the woods and must find your way out." +
                "EXP is the currency in this game. You can choose to spend EXP or save up. " +
                "\n However, be careful how you spend your EXP. You might earn more by saving as prices rise the farther you go."+
                "\nYou must choose a path to follow...." +
                "\n[Left]       [Center]       [Right]\n"  +
                "\nType h to see the controls...");
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
        System.out.println("s - store xp");
        System.out.println("For Combat type: ");
        System.out.println("attack - to attack");
        System.out.println("defend - to defend");
        System.out.println("run - to run\n");


    }

    }
