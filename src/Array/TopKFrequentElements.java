package Array;

import java.util.HashMap;
import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = findTopKFrequent(arr, k);

        System.out.println(Arrays.toString(result));
    }
    public static int[] findTopKFrequent(int[] arr, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        List<Integer>[] bucket = new List[arr.length + 1];
        for(int key : map.keySet())
        {
            int freq = map.get(key);
            if(bucket[freq] == null)
            {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> resultList =new ArrayList<>();
        for(int i=bucket.length-1;i>=0 && resultList.size() < k;i--)
        {
            if(bucket[i] != null)
            {
                resultList.addAll(bucket[i]);
            }
        }
        // Step 4: Convert list to array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
