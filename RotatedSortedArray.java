import java.util.Arrays;

public class RotatedSortedArray {

    public static int[] rotateArray(int[] arr, int pivot) {

        int[] rotated = new int[arr.length];
        int index = 0;

        for (int i = pivot; i < arr.length; i++) {
            rotated[index++] = arr[i];
        }

        for (int i = 0; i < pivot; i++) {
            rotated[index++] = arr[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 101, 102, 103, 104, 105, 106, 107 };
        int pivot = 3;

        int[] rotatedArray = rotateArray(sortedArray, pivot);

        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }
}
