package sort;

import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort(int[] arr) {
        boolean sorted = false;
        int edge = arr.length - 1;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < edge; i++) {
                if (arr[i+1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
            edge--;
        }

        return arr;
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0 ; i < arr.length - 1 ; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[min]) min = j;
            }

            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }

        return arr;
    }

    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 1, 6, 7, 8, 10, 1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
