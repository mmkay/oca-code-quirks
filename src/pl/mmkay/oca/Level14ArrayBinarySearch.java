package pl.mmkay.oca;

import java.util.Arrays;

public class Level14ArrayBinarySearch {

    public static void main(String... chars) {
        int[] elements = {6, 9, 1, 7};
        Arrays.sort(elements);
        System.out.println(Arrays.binarySearch(elements, 6));
        System.out.println(Arrays.binarySearch(elements, 2));
    }
}
