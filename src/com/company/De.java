package com.company;

public class De {
    private final static int minimum = 1;
    private static int maximum;

    public static int lancer(int nbFaces){
        return minimum + (int) (Math.random() * (nbFaces - minimum+1));
    }

    public static int plusieursLances(int lance1, int lance2, int lance3, int lance4){
        int plusPetit = Math.min(Math.min(Math.min(lance1,lance2),lance3),lance4);

        return lance1 + lance2 + lance3 + lance4 - plusPetit;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
