import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

//        int returnedMin = findMin(returnedArray);
//        System.out.println("min = " + returnedMin);

//        reverse(returnedArray);
//        System.out.println("Final: " + Arrays.toString(returnedArray));

        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("After reverse " + Arrays.toString(returnedArray));
        System.out.println("reversedCopy " + Arrays.toString(reversedCopy));
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }


}
