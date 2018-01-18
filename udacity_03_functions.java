package com.company;
import java.util.Random;

public class udacity_03_functions {

    public static void main (String[] args) {
    //absoluteValue(-2.5);
    //calculateTip(30);
    //nametagText("Michal");
    //printTemperature(45);
    //generic_number_0_6();
    monopollyRoll();
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


    /**
     * Konwertuje stopnie fahrenheit na celcjusza
     * @param fahr TTemperatura w stopniach fahrenheita
     * @return temperatura w stopniach celcjusza
     */
    private static double fahrenheitToCelcius(double fahr) {
        return (fahr - 32)*5/9;
    }


    /**
     * Drukuje temperature w stopnaich fahrenheita i celcjusza
     * @param fahr_degree Temperatura w stopniach fahrenheita
     */
    private static void printTemperature (double fahr_degree) {
        System.out.println("F: "+fahr_degree);
        System.out.println("C: "+fahrenheitToCelcius(fahr_degree));
    }

    private static int generic_number_0_6()
    {
        /**
         * Generuje losowa liczbe z zakresu 1-6
         * @return zwraca losową liczbę z zakresu 0-6
         */
        Random a = new Random();
        int b = a.nextInt(6)+1;
        //System.out.print("Generyczna liczba z zakresu 1-6: "+b);
        return b;
    }

    private static void monopollyRoll()
    /**
     * Generuje wynik rzutu dwiema koscmi
     * JEsli dublet, rzucamy jeszcze raz
     * Drukuje sume wrzystkich rzutów
     */
    {
        int pierwsza_liczba = generic_number_0_6();
        int druga_liczba = generic_number_0_6();

        System.out.println("Pierwsza liczba to: "+pierwsza_liczba);
        System.out.println("Fruga liczba to: "+druga_liczba);

        if (pierwsza_liczba == druga_liczba) {
            System.out.println("Liczby sa rowne. Rzucamy jeszcze raz");
            int trzecia_liczba = generic_number_0_6();
            int czwarta_liczba = generic_number_0_6();
            System.out.println("Trzecia liczba to: "+trzecia_liczba);
            System.out.println("Czwarta liczba to: "+czwarta_liczba);
            System.out.println("Suma czterech liczb to: "+(pierwsza_liczba+druga_liczba+trzecia_liczba+czwarta_liczba));
        } else {
            System.out.println("Liczby są różne. Ich suma to: "+(pierwsza_liczba+druga_liczba));
        }
    }
}
