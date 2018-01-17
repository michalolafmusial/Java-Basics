package com.company;

public class udacity_03_functions {

    public static void main (String[] args) {
    absoluteValue(-2.5);
    calculateTip(30);
    nametagText("Michal");
    printTemperature(45);
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
     // Funkcja zwraca double, przyjmuje double o nazwie cost
        double napiwek = 0.15*cost;
        System.out.println("Napiwek to: "+napiwek);

        return napiwek;
    }

    private static String nametagText(String name) {
    // Funkcja przyjmuje string (o nazwie name) i zwraca string
        String tekst = "Hello, my name is "+name;
        System.out.println(tekst);
        return tekst;
    }

    private static double fahrenheitToCelcius(double fahr) {
    // Funkcja przyjmuje temperature w stopniach fahrenheita (fahr) i
        // zwraca w calcjusza (fahrenheitToCelcius)
        return (fahr - 32)*5/9;
    }

    private static void printTemperature (double fahr_degree) {
        // Funkcja nic nie zwraca, drukuje stopnie w fahranheita (parametr fahr_degree)
        // i w celcjusza wykorzystujac poprzednia funkcje fahrenheitToCelcius

        System.out.println("F: "+fahr_degree);
        System.out.println("C: "+fahrenheitToCelcius(fahr_degree));
    }
}
