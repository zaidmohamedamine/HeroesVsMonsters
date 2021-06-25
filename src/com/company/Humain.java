package com.company;

public abstract class Humain extends Personnage implements Sac{

    public Humain(int end, int force) {
        super(end, force);
    }

    @Override
    public void ajouterDansInventaire() {

    }
}
