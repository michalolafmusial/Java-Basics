package com.company;

public class udacity_02 {
    public static void main(String[] args){
        udacity_02.video_game();
        udacity_02.winter();
        udacity_02.time_of_a_day();
        udacity_02.holiday();

    }

    public static void video_game (){
        boolean canSeePlayer = true;
        boolean playerPoweredUp = false;

        if(canSeePlayer){
            if(!playerPoweredUp) {
                System.out.println("Attack");
            } else {
                System.out.println("Run away");
            }
        } else {
            System.out.println("Wander");
        }
    }

    public static void winter(){
        boolean isSnowing = false;
        boolean isRaining = false;
        double temperature = 60.0;

        if (isSnowing || isRaining || temperature < 50){
            System.out.println("Let's stay home");
        } else {
            System.out.println("Let's go out!");
        }
    }

    public static void time_of_a_day(){
        int time = 6;
        String time_of_day;

        if (time >= 5 && time < 12){
            time_of_day = "morning";
        } else if (time >=12 && time < 20){
            time_of_day = "daytime";
        } else time_of_day = "night";

        System.out.println(time_of_day);
    }

    public static void holiday(){
        int weekday = 5;
        boolean holidays = true;
        if (holidays ||  weekday == 6 || weekday == 7) {
            System.out.println("Sleep in!");
        } else System.out.println("Wake up at 7:00");
    }
}

/*
SWITCH:

        int time = 18;
        String time_of_day;
        switch (time) {
        case (1):
        time_of_day="a";
        break;
        */