package org.experis.cibi;

public class CibiPreferiti {
    public static void main(String[] args) {
        // inizializzo array
        String[] favouriteFoods = {"Pizza", "Carbonara", "Piadina", "Risotto", "Pesce", };
        // stampo lunghezza classifica
        System.out.println("La classifica è lunga:" + " " + favouriteFoods.length);
        // variabili
        int topPos = 0;
        int middlePosition = (favouriteFoods.length - 1) / 2;
        int bottomPosition = favouriteFoods.length -1;
        // stampo posizione top
        System.out.println("Cibo top è:" + " " + favouriteFoods[topPos]);
        // stampo posizione bottom
        System.out.println("Cibo non troppo preferito è:" + " " + favouriteFoods[middlePosition]);
        // stampo posizione mediana
        System.out.println("Cibo in posizione mediana è:" + " " + favouriteFoods[bottomPosition]);

    }
}
