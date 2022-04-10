import java.util.Scanner;
public class PRACTICE { public static void main(String[] args) {
 int choice;
 Player player = new Player(5,10,4);

controls control= new controls();
 turncount T = new turncount();
 Printer Printer=new Printer();
Printer.Welcome();
int turn=control.currentTurn(T, player);
}
                      }
