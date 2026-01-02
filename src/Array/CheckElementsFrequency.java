package Array;

import java.util.HashMap;

public class CheckElementsFrequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};

        findFrequency(arr);
    }

    public static void findFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Print frequencies
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
