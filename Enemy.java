package com.example.travistaylor.shootertargets;

/**
 * Created by G. McGee on 10/2/2016
 */
public class Enemy extends Player{  //inherits methods from the parent class Player
    int health;
    int speed;
    int damage;
    float[]color;

  public Enemy(){
        health=1;
        speed=0;
        damage=0;
    }

    public void changeHealth(int n){
        super.changeHealth(n);
    }

    public void changeDamage(int n){
        super.changeHealth(n);
    }

    public void changeSpeed(int n){
    	super.changeSpeed(n);
    }

    public int getHealth(){
       return health;
    }

    public int getDamage(){
        return damage;
    }

    public int getSpeed(){
        return speed;
    }
}

}
