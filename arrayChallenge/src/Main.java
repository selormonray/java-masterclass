import java.util.Arrays;
import java.util.Random;

//a program that sorts a list of integers in descending order

public class Main {
    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(20);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[]{7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));

    }

    //    creating an array of random gen integers
    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] randomArray = new int[len];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("---->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("---->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}