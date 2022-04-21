class Combat {
    public String battle(Player player,Enemies enemies,int num1){
        String battle="";

        player.health(player);
        while(!battle.equals("cont")&&!battle.equals("win") && !battle.equals("lose")){
            String choice;
            String choice2;
            String choice3="";

            choice=player.choice(num1);
            choice2= enemies.decison();


            if (num1==0) {
                choice3 = player.action(player, enemies, choice, choice2,num1);
            }
            else if (num1==1) {
                choice3 = player.action(player, enemies, choice, choice2,num1);
            }
            if(player.healthpoints()<=0){
                battle="lose";
                System.out.print("You lost. Game over...");
            }
            else if(enemies.healthpoints()<=0){
                if(num1==0){
                    battle="cont";
                }
                if(num1==1){
                    battle="win";}
                enemies.battlewon(player);
                System.out.println("You won and earned "+ enemies.battlewon(player)+ " exp!");
            }
            else if (choice3.equals("success")){

                break;
            }
            else if(player.healthpoints()>0&& enemies.healthpoints()>0){
                System.out.println("You have "+ player.healthpoints()+" health left.");
                System.out.println("The enemy has " + enemies.healthpoints()+" health left.\n");
            }

        }
        player.fullheal(player);

        return battle;
    }}
