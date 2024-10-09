import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

//        set all values in array with our own initial values before processing
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

//        full copy of array
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

//        sort the arrays

      /*   arrays dot sort passing fourth array. and I'll print
        out third array first using arrays dot too
        string. and then fourth array. And running this code.
                You can see that fourth array is sorted, but the
        array I copied the data from, third array,
                is still in its original state. An array copy creates a
        new array,
                a new instance of an array, and copies the array
        elements over to the new array.
                For primitives, the values get copied. For objects,
        the object references get copied.
                Performing operations on the copied array, like sort
        and fill, don't impact the original array.*/
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.print(Arrays.toString(fourthArray));

//        partial copy of array
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

//        copy plus additional elements
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

//        arrays binary search
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Mark is found in the list");
        }
    }

    //    method that returns an array of random integers
    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}