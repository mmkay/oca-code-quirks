package pl.mmkay.oca;

public class Level10WhatWillBeTheOutput {
    {
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    public static void main(String args[]) {
        new Level10WhatWillBeTheOutput();
    }
}
