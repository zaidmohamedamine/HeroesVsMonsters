package com.company;

public abstract class Monstre extends Personnage {

    public Monstre() {
        super();
        x = (int) (Math.random() * (14 + 1));
        y = (int) (Math.random() * (14 + 1));
    }


}
