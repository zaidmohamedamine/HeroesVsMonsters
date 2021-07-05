package com.company;

public class De {
    private final static int minimum = 1;
    private static int maximum;

    public static int lancer(int nbFaces, int nbLancer){

        if (nbLancer == 1){
            return minimum + (int) (Math.random() * (nbFaces - minimum+1));
        }
        int lance1 =  minimum + (int) (Math.random() * (nbFaces - minimum+1));
        int lance2 =  minimum + (int) (Math.random() * (nbFaces - minimum+1));
        int lance3 =  minimum + (int) (Math.random() * (nbFaces - minimum+1));
        int lance4 =  minimum + (int) (Math.random() * (nbFaces - minimum+1));

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
