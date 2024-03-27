package org.experis.festaferragnez;

import java.util.Scanner;

public class FestaFerragnez {
    public static void main(String[] args) {
        // inizializzo array invitati
        String[] partyList = {"dua lipa", "paris hilton", "manuel agnelli", "j-ax", "francesco totti", "ilary blasi",
                "bebe vio", "luis", "pardis zarei", "martina maccherone", "rachel zeilic"};
        // inizializzo variabile username
        String userName ;
        // istanzio new scanner
        Scanner scan = new Scanner(System.in);

        // inizializzo variabile boolean
        boolean isInvited = false;
        // chiedo nome all'utente
        System.out.println("inserisci il tuo nome");
        userName = scan.nextLine();
        // ciclo  e verifico la corrispondenza e poi rispondo
        for (int i = 0; i < partyList.length; i++) {
            if(partyList[i].equalsIgnoreCase(userName)) {
                isInvited = true;
                break;
            }
        }

        if (isInvited) {
            System.out.println("Sei invitato alla festa!");
        } else {
            System.out.println("Mi dispiace, non sei sulla lista degli invitati.");
        }

        scan.close();
    }
}
