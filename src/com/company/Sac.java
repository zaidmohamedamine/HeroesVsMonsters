package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sac {

    List<Loot> inventaire = new ArrayList<>();

    public void ajouterDansInventaire(Loot loot) {
        inventaire.add(loot);
    }


}
