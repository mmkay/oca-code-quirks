package pl.mmkay.oca;

public class Level03WhatWillBeTheNumber {
    public Level03WhatWillBeTheNumber() {
        number = 1;
    }

    public static void main(String[] args) {
        System.out.println(new Level03WhatWillBeTheNumber().number);
    }

    private int number = 2;
    { number = 3; }
}
