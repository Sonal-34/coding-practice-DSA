package Array;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args)
    {
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        int arr[] = {1,2,3};
        int k =3;
        System.out.println(obj.subarraySum(arr, k));

    }
    public static int subarraySum(int[] arr, int k)
    {
       int n = arr.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);
       int count = 0;
       int prefixSum = 0;
       for(int i = 0; i < n; i++)
       {
           prefixSum += arr[i];
           if(map.containsKey(prefixSum - k))
           {
               count += map.get(prefixSum - k);
           }
           map.put(prefixSum,map.getOrDefault(prefixSum,0) +1);
       }
       return count;
    }
}
