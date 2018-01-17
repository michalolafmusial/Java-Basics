package com.company;

public class udacity_03_functions {

    public static void main (String[] args) {
    absoluteValue(-2.5);
    calculateTip(30);
    }


    private static double absoluteValue (double liczba) {
    /*
    Funkcja zwraca typ double, przyjmuje jako argument typ double o nazwie liczba
    */


        if (liczba < 0) {
            liczba = -liczba;
        }


        System.out.println("Wartosc bezwzgledna to: "+liczba);

        return liczba;

    }

    private static double calculateTip (double cost) {
        double napiwek = 0.15*cost;
        System.out.println("Napiwek to: "+napiwek);

        return napiwek;
    }
}
