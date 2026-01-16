package search;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (arr[mid] == target) break;
            if (arr[mid] < target) left = mid + 1;
            if (arr[mid] > target) right = mid - 1;
            mid = (left + right) / 2;
        }

        if (arr[mid] == target) return mid;
        else return -1;
    }
}
