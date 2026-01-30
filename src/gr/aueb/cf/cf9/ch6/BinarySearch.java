package gr.aueb.cf.cf9.ch6;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7};
        int value = 5;
        int low = 0;
        int high = arr.length - 1;
        int element = 0;

        element = binarySearch(arr, value, low,high);

        System.out.printf("Ο αριθμός %d βρίσκετε στη θέση %d του πίνακα %n", value, element);
    }

    public static int binarySearch(int[] arr, int value, int low, int high) {
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if (value > arr[mid]) return binarySearch(arr, value, mid + 1, high);
        else return binarySearch(arr, value, low, mid - 1); //else if (value < arr[mid])
    }
}
