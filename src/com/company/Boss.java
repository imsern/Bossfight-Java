package com.company;

import java.util.Random;

public class Boss extends GameCharacter {
    Random rand = new Random();
    public Boss(Integer health, String strength, Integer stamina) {
        super(health, strength, stamina);
    }

    public void Fight(GameCharacter target){
        if(!(Stamina <= 0)){
            if(Strength.contains("-")){
                var values = Strength.split("-");
                var min = Integer.parseInt(values[0]);
                var max = Integer.parseInt(values[1]);
                var randomStr = rand.nextInt(min, max);
                target.Health -= randomStr;
                Stamina -= 10;
                System.out.println("Boss hits hero for: " + randomStr);
            } else{
                var str = Integer.parseInt(Strength);
                target.Health -= str;
                Stamina -= 10;
                System.out.println("Hero hits boss for: " + str);
            }
        } else{
            Recharge();
        }
    }
    protected void Recharge(){
        Stamina = MaxStamina;
        System.out.println("Boss had to recharge!");
    }
}
