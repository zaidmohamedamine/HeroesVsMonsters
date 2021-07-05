package com.company;

public abstract class Hero extends Personnage{

    protected int or;
    protected int cuir;


    public Hero() {
        super();
        x = 0;
        y = 0;
    }

    public int getOr() {
        return or;
    }

    public void setOr(int or) {
        this.or = or;
    }

    public int getCuir() {
        return cuir;
    }

    public void setCuir(int cuir) {
        this.cuir = cuir;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
