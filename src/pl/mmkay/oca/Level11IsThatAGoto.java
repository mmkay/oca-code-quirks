package pl.mmkay.oca;

public class Level11IsThatAGoto {
    public static void main(String... args) {
        int[][] twoDimensionArray = {{1,2,3,4}, {5,6}, {7,8,9}};
        OUTER_LOOP: for(int[] innerArray : twoDimensionArray) {
            INNER_LOOP: for(int i=0; i<innerArray.length; i++) {
                System.out.print(innerArray[i]);
                if (innerArray[i] == 5) {
                    break OUTER_LOOP;
                }
            }
            System.out.println();
        }
    }
}
