package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int rev[] =reverse(arr);
        System.out.println(Arrays.toString(rev));
//        int start = 0;
//        int end = arr.length-1;
//
//       while(start < end)
//
//       {
//       int temp = arr[start];
//       arr[start] = arr[end];
//       arr[end] = temp;
//       start++;
//       end--;
//       }
//        for(int i=0; i<arr.length;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverse(int arr[])
    {
      int reversed[] = new int[arr.length];
      for(int i =0; i<arr.length; i++)
      {
          reversed[i] =arr[arr.length-1-i];
      }
      return reversed;
    }
}
