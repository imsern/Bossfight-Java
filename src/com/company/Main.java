package com.company;


import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {


        var player = new Hero(100, "20", 40);
        var boss = new Boss(400, "0-30", 10);

        var GameOn = true;
        while (GameOn) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    boss.Fight(player);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                player.Fight(boss);

            if(player.Health <= 0){
                System.out.println("Boss wins!");
                GameOn = false;
            }
            else if(boss.Health <= 0){
                System.out.println("Hero wins!");
                GameOn = false;
            }
        }
    }
}
