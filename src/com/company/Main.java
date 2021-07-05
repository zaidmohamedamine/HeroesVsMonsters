package com.company;

public class Main {

    public static void main(String[] args) {
        Partie partie = new Partie();

        partie.messageDaccueil();

        partie.creationHero(partie.choixDeRace());

        Plateau plateau = new Plateau();

        plateau.afficherPlateau(plateau.creationPlateau());

        partie.creationListeMonstre();

        for (Monstre monstre: Plateau.listeDeMonstres) {
            System.out.println(monstre.getClass().getSimpleName());
        }

        plateau.placementMonstres(Plateau.listeDeMonstres, plateau.creationPlateau());

    }
}
