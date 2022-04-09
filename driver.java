public class Driver{
  public static void main(String [] args){
    
    int choice;
 Player player = new Player(3,5,5);
Enemies enemy = new Enemies(2,5,5);
reservoir control= new reservoir();
 turncount T = new turncount();

control.currentTurn(T, player);
    
    
    
  }
}
