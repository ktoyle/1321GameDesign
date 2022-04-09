
 class Combat {
    public String battle(Player player,Enemies enemies){
       String battle="";

        player.health(player);
        while(!battle.equals("win") && !battle.equals("lose")){
            String choice;
            String choice2;
            String choice3;
            choice=player.choice();
            choice2= enemies.decison();
           choice3= player.action(player,enemies,choice,choice2);


            if(player.healthpoints()<=0){
                battle="lose";
                System.out.print("You lost game over");
            }
           else if(enemies.healthpoints()<=0){
                battle="win";
                enemies.battlewon(player);
                System.out.print("You won and earned "+ enemies.battlewon(player));
            }
            else if (choice3.equals("success")){

                break;
            }
           else if(player.healthpoints()>0&& enemies.healthpoints()>0){
                System.out.print("You have "+ player.healthpoints()+" left");
                System.out.print("The enemy has " + enemies.healthpoints()+" left");
            }

        }


        return battle;
    }

}
