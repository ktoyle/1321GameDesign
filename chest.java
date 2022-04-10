import java.util.Random;

class chest {

    public void Chest(Player player){
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        if (number < 5) {

        }
        if (number >= 5) {
            System.out.println("You found a chest it had 80 exp in it.");
            int exp=80;
            player.addexp(exp);
        }

    }
}
