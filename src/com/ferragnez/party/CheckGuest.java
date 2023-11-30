package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String guests[] = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il tuo nome");
        String namePerson = scanner.nextLine();

        boolean match = false;

        /*for (int i = 0; i < guests.length; i++) {
            if (guests[i].equals(namePerson))
            {
                match = true;

                break;

            }
        }*/
        //bonus
        int i = 0;
        while(i < guests.length) {
            if (guests[i].equals(namePerson)) {
                match = true;




            }
            i++;
        }


        if (match) {

            System.out.println("si perfetto puoi entrare");

        } else {
            System.out.println("mi dispiace non sei stato invitato");

        }


        scanner.close();

    }
}
