import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.deepToString(array2));
        System.out.println(array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }
    }
}