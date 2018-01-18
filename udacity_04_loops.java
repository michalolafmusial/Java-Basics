package com.company;

public class udacity_04_loops {
    public static void main (String[] args) {
        //absoluteValue(-2.5);
        yearsTilOneMillion(0.0001);
    }


    /**
     * Dodaje 5% danej liczby i sprawdza po ilu wykonaniach osiagnie 1000000
     * @param  initialBalance poczatkowa kwota
     * @return ilosc iteracji aby otrzymac milion
     */
    private static int yearsTilOneMillion(double initialBalance) {
        double suma = initialBalance;
        int ilosc_lat_do_miliona = 0;
        while(suma<1000000) {
            suma = suma*1.05;
            ilosc_lat_do_miliona++;
            System.out.println("Stan kasy po "+ilosc_lat_do_miliona+" lat to "+suma);
        }
        System.out.println("Ilosc lat do miliona to: "+ilosc_lat_do_miliona);
        return ilosc_lat_do_miliona;
    }
}
