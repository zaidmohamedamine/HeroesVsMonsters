package com.company;

import java.util.Scanner;

public class Partie {

    Scanner sc;
    Personnage perso;
    De de;

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void messageDaccueil(){
        System.out.println(ANSI_YELLOW + "Bienvenue dans la forêt de Shorewood, forêt enchantée du pays de Stormwall." + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Dans cette forêt, se livre un combat acharné entre les héros d’une part et les monstres d’autre part" + ANSI_RESET);
        System.out.print(ANSI_BLUE + "Choisis ta race parmi 'humain' et 'nain' et pars vite à l'aventure :" + ANSI_RESET);
    }

    public String choixDeRace(){
        sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void creationPersonnage(String race){

        switch (race){
            case "humain" : perso = new Humain(De.plusieursLances(De.lancer(6), De.lancer(6), De.lancer(6), De.lancer(6)),
                    De.plusieursLances(De.lancer(6), De.lancer(6), De.lancer(6), De.lancer(6)));
                    break;
            case "nain" : perso = new Nain(De.plusieursLances(De.lancer(6), De.lancer(6), De.lancer(6), De.lancer(6)),
                    De.plusieursLances(De.lancer(6), De.lancer(6), De.lancer(6), De.lancer(6)));
                    break;
        }
    }
}
