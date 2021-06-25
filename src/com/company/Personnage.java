package com.company;

public abstract class Personnage {
    //c'est ca qui fait un joueur nn ?
    protected int end;
    protected int force;
    protected int pV;

    public Personnage(int end, int force) {
        this.end = end;
        this.force = force;
    }

    public void frappe(){

    };

    public int getEnd() {
        return end;
    }

    public int getForce() {
        return force;
    }

    public int getpV() {
        System.out.println("");
        return pV;
    }
}
