package com.company;

public class Loup extends Monstre implements Cuir{

    private int cuir;

    public Loup() {
        super();
        this.force++;
    }

    @Override
    public int getCuir() {
        return this.cuir;
    }
}
