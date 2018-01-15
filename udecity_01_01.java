package com.company;

import com.sun.jdi.connect.Connector;

public class udecity_01_01 {
    public static void main(String[] args){
    udecity_01_01.DOB();
    udecity_01_01.dwa();
    udecity_01_01.farenheit();
    }


    public static void DOB () {
        int DAY_OF_BIRTH =29;
        String MONTH_OF_BIRTH = "January";

        System.out.println ("Michal's DOB is: "+DAY_OF_BIRTH +" "+MONTH_OF_BIRTH);
    }

    public static void dwa() {
        String firstName = "Michal";
        String lastName = "Musial";
        String fullName = firstName + " " + lastName;

        System.out.println("Hello, my name is "+fullName+".");
        System.out.println("There are " + (firstName.length()+lastName.length()) + " letters in my name");
    }

    public static  void  farenheit() {
        double fahrenheit = 50.5;
        double celcius = (fahrenheit - 32)*5/9;

        System.out.println(celcius);
    }
}
