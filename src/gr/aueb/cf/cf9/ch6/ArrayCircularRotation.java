package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class ArrayCircularRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int offset = 0;
        int[] arr = { 12, 11, 13, 5, 6, 8, 23, 45, 55 };
        int[] shift;

        System.out.println("Please enter the number of places the elements will be moved: ");
        offset = scanner.nextInt();

        System.out.println("Before shifting: ");
        printArray(arr);

        System.out.println();

        System.out.println("After shifting right: ");
        shift = shiftRightBy(arr, offset);
        printArray(shift);

        System.out.println();

        System.out.println("After shifting left: ");
        shift = shiftLeftBy(arr, offset);
        printArray(shift);
    }

    public static int[] shiftRightBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
