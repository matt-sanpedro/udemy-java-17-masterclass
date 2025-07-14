public class ObjectArrays {

    public static void main(String[] args) {
            int[] newArray = new int[10];

            Object[] objectArray = new Object[3];
            objectArray[0] = "Hello";
            objectArray[1] = new StringBuilder("World");
            objectArray[2] = newArray; 
    }

}