package pl.mmkay.oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level13ListFromArray {
    public static void main(String... args) {
        String[] typicalAndHealthyPolishFamily = { "Partner 1", "Partner 2", "Cat 1", "Cat 2"};

        List<String> familyListInOldFlat = Arrays.asList(typicalAndHealthyPolishFamily);
        familyListInOldFlat.add("Dog 1");
//        familyListInOldFlat.set(2, "Dog 1");

        List<String> familyListInNewFlat = new ArrayList<>(familyListInOldFlat);
        familyListInNewFlat.add("Dog 1");
    }
}
