package pl.mmkay.oca;

import java.util.ArrayList;
import java.util.List;

public class Level15WhatDidIJustRemove {
    public static void main(String... chars) {
        List<Integer> happyLottoNumbers = new ArrayList<>();
        happyLottoNumbers.add(1);
        happyLottoNumbers.add(Integer.valueOf(49));
        happyLottoNumbers.add(new Integer(7));

        happyLottoNumbers.remove(1);
        happyLottoNumbers.remove(new Integer(7));
        System.out.println(happyLottoNumbers);
    }
}
