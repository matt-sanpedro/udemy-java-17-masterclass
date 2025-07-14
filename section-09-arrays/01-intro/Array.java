import java.util.Arrays;

 /*
    Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    An array is a collection of variables that are accessed with an index number.
    The index of the first element is 0, the second element is 1, and so on.
    The length of an array can be found using the .length property.
 */

public class Array {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
            myIntArray[0] = 100;
            System.out.println(myIntArray[0]);

        double[] myDoubleArray = new double[10];
            myDoubleArray[2] = 3.14;
            System.out.println(myDoubleArray[2]);

        int[] firstTen = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int arrayLength = firstTen.length;
            System.out.println("Last element: " + firstTen[arrayLength - 1]);

        int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1};

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++) {
            // System.out.println("Element " + i + ": " + newArray[i]);
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        // Enhanced for loop (for-each loop)
        for(int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println("\nArray utils toString: " + Arrays.toString(newArray));

        int[] anotherArray = new int[5];
        Object objectVariable = anotherArray;
        if (objectVariable instanceof int[]) {
            // anotherArray = (int[]) objectVariable;
            System.out.println("anotherArray is an int array of length: " + anotherArray.length);
        } else {
            System.out.println("objectVariable is not an int array");
        }

    }
    
}