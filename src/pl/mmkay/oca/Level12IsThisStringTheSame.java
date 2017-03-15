package pl.mmkay.oca;

public class Level12IsThisStringTheSame {
    public static void main(String... args) {
        String firstOne = "hello";
        String secondOne = "hello";
        String thirdOne = new String("hello");


        System.out.println(firstOne == secondOne);
        System.out.println(secondOne == thirdOne);
        System.out.println(firstOne.equals(secondOne));
        System.out.println(firstOne.equals(thirdOne));

        // bonus level
        String fourthOne = "hel" + "lo";
        System.out.println(firstOne == fourthOne);
        System.out.println(thirdOne == fourthOne);
    }
}
