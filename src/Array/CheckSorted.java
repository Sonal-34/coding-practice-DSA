package Array;



public class CheckSorted {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,7,6};

        boolean result = isSorted(arr);

        if (result) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }

    // Function to check if array is sorted
    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            // compare current element with next element
            if (arr[i] > arr[i + 1]) {
                return false; // violation found
            }
        }

        return true; // no violation found
    }
}

