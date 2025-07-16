import java.util.Arrays;
import java.util.Random;

public class SortFillCopy {

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        // sort the array
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        // fill an array with values 5
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        // copy an array, creates a new instance and copies the elements
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

    }
    
    // create and return an array of random integers
    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            // random integers between 0 and 99 inclusive (excludes 100)
            array[i] = random.nextInt(100);
        }

        return array;
    }
}