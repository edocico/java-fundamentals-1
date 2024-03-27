package org.experis.cibi;

public class CibiPreferiti {
    public static void main(String[] args) {
        // inizializzo array
        String[] favouriteFoods = {"Pizza", "Carbonara", "Piadina", "Risotto", "Pesce", };
        // stampo lunghezza classifica
        System.out.println("La classifica è lunga:" + " " + favouriteFoods.length);
        // stampo posizione top
        System.out.println("Cibo top è:" + " " + favouriteFoods[0]);
        // stampo posizione bottom
        System.out.println("Cibo non troppo preferito è:" + " " + favouriteFoods[4]);
        // stampo posizione mediana
        System.out.println("Cibo in posizione mediana è:" + " " + favouriteFoods[2]);

    }
}
