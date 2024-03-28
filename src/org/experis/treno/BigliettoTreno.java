package org.experis.treno;

import java.util.Scanner;

public class BigliettoTreno {
    public static void main(String[] args) {
        // definisco variabili conosciute e non
        final double priceXKm = 0.21; // PRICE_PER_KM
        final int minUserAge = 18;
        final int maxUserAge = 65;
        double desireKm;
        int userAge;
        final int juniorDisc = 20;
        final int seniorDisc = 40;

        // scanner

        Scanner scan = new Scanner(System.in);
        // chiedo quanti km
        System.out.print("Quanti Km vuoi percorrere ?");
        // salvo valore in variabile
        desireKm = scan.nextInt(); // Integer.parseInt(scan.nextLine());
        // chiedo età passeggero
        System.out.print("Quanti anni hai ?");
        userAge = scan.nextInt(); // Integer.parseInt(scan.nextLine());
        // calcolo il prezzo del biglietto senza sconto
        double PriceWoDisc = priceXKm * desireKm;
        System.out.println(PriceWoDisc);
        // dichiaro variabile prezzo finale
        double endPrice;
        // calcolo il prezzo in base alla casistica di sconto

        if(userAge < minUserAge) {
            endPrice = PriceWoDisc - ((PriceWoDisc * (double) juniorDisc) / 100);
        } else if (userAge > maxUserAge) {
            endPrice = PriceWoDisc - ((PriceWoDisc * (double) seniorDisc) / 100);
        } else {
            endPrice = PriceWoDisc;
        }

        System.out.println("Il prezzo del tuo biglietto è:" + " " + endPrice);

        scan.close();
    }
}
