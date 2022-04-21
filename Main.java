import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

try {

    Scanner sc = new Scanner(System.in);
    Player player = new Player(5, 10, 4);

    controls control = new controls();
    turncount T = new turncount();
    printer Printer = new printer();
    Printer.Welcome();
    int turn = control.currentTurn(T, player);
}catch (InputMismatchException IME){
    System.out.println("Loading...");
    System.out.println("Loading took too long- Please refresh (Press Run Again)");




  
  }
      
}
}
