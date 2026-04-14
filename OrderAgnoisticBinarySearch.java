public class OrderAgnoisticBinarySearch {
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

 public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};      // ascending
        int[] arr2 = {9, 7, 5, 3, 1};      // descending

        int target = 5;

        int result1 = search(arr1, target);
        int result2 = search(arr2, target);

        System.out.println("Index in ascending array: " + result1);
        System.out.println("Index in descending array: " + result2);
    }

}