package com.company;

public class Dragonnet extends Monstre implements Or, Cuir{

    private int or;
    private int cuir;

    public Dragonnet() {
        super();
    }

    @Override
    public int getOr() {
        return this.or;
    }

    @Override
    public int getCuir() {
        return this.cuir;
    }
}
