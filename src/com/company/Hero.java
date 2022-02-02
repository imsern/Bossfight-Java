package com.company;

import java.util.Random;

public class Hero extends GameCharacter {
    Random rand = new Random();
    public Hero(Integer health, String strength, Integer stamina) {
        super(health, strength, stamina);
    }

    public void Fight(GameCharacter target){
        if (Stamina <= 0) {
            Recharge();
        } else {
            if (!Strength.contains("-")) {
                var str = Integer.parseInt(Strength);
                target.Health -= str;
                System.out.println("Hero hits boss for: " + str);
            } else {
                String[] values;
                values = Strength.split("-");
                var min = Integer.parseInt(values[0]);
                var max = Integer.parseInt(values[1]);
                var randomStr = rand.nextInt(min, max);
                target.Health -= randomStr;
                System.out.println("Boss hits hero for: " + randomStr);
            }
            Stamina -= 10;
        }
    }
    protected void Recharge(){
        Stamina = MaxStamina;
        System.out.println("Hero had to recharge!");
    }
}
