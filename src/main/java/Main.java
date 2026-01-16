import search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int index = BinarySearch.search(arr, target);
        System.out.println(index != -1 ? "The target position is " + index : "Target Not Found");
    }
}
