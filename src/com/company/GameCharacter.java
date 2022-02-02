package com.company;

import jdk.jshell.spi.ExecutionControl;

public class GameCharacter {
    protected final Integer MaxStamina;
    public int Health;
    public String Strength;
    public int Stamina;

    public GameCharacter(Integer health, String strength, Integer stamina) {
        this.Health = health;
        this.Strength = strength;
        this.Stamina = stamina;
        this.MaxStamina = stamina;
    }

    protected void Fight(){

    }
    protected void Recharge(){

    }
}
