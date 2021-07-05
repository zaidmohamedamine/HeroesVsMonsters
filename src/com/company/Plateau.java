package com.company;

import java.util.ArrayList;

public class Plateau {

    public static ArrayList<Monstre> listeDeMonstres = new ArrayList<>();

    public void ajouterMonstre(Monstre monstre){
        listeDeMonstres.add(monstre);
    }

    public void supprimerMonstre(Monstre monstre){
        listeDeMonstres.remove(monstre);
    }

    public String[][] creationPlateau(){
        String[][] plateau = new String[15][15];

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                plateau[i][j] = "[ ]";
            }
        }
        return plateau;
    }

    public void afficherPlateau(String[][] plateau){


        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                System.out.print(plateau[i][j]);
            }
            System.out.println();
        }
    }

    public Monstre generationMonstres(){

        int random = (int)(Math.random() * ((2) + 1));
        return switch (random) {
            case 0 -> (Loup) new Loup();
            case 1 -> (Orque) new Orque();
            case 2 -> (Dragonnet) new Dragonnet();
            default -> null;
        };
    }

    public void placementMonstres(ArrayList<Monstre> listeDeMonstres, String[][] plateau){

        for (int i = 2; i < plateau.length-2; i++) {
            for (int j = 2; j < plateau.length-2; j++) {
                if(plateau[i][j].equals("[ ]") && plateau[i+1][j].equals("[ ]") && plateau[i+2][j].equals("[ ]")
                            && plateau[i-1][j].equals("[ ]") && plateau[i-2][j].equals("[ ]")
                            && plateau[i][j+1].equals("[ ]") && plateau[i][j+2].equals("[ ]")
                            && plateau[i][j-1].equals("[ ]") && plateau[i][j-2].equals("[ ]")){

                    plateau[i][j] = listeDeMonstres.get(i).getClass().getSimpleName();
                }
            }
            System.out.println();
        }
    }
}
