package org.experis.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        // faccio ciclio da 100 iterazioni

        for (int i = 1; i <= 100; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + "fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + "fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + "buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
