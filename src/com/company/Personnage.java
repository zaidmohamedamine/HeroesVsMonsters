package com.company;

public abstract class Personnage {

    protected int end;
    protected int force;
    protected int pV;

    public Personnage(int end, int force) {
        this.end = end;
        this.force = force;
        if (end<5){
            this.pV = end - 1;
        }else if(end<10){
            this.pV = end;
        }else if(end<15){
            this.pV = end + 1;
        }else {
            this.pV = end + 2;
        }
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
        return pV;
    }
}
