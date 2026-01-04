package Array;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingRepeatedValues {
    public static void main(String[] args) {
         int arr[][]={
                 {1,2},
                 {2,4}
         };
         int result[]=findMissingRepeatedValues(arr);
         System.out.println("The repeated value is: " + result[0]);
        System.out.println("The missing value is: " + result[1]);
    }
    public static int[] findMissingRepeatedValues(int[][] arr) {
        HashSet<Integer> set =new HashSet<Integer>();
        int repeated =-1;
        int missing =-1;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(set.contains(arr[i][j]))
                {
                    repeated = arr[i][j];
                }
                else {
                    set.add(arr[i][j]);
                }
            }
        }
        //Finding missing value here
        for(int i=1;i<=n*n;i++)
        {
            if(!set.contains(i))
            {
                missing = i;
                break;
            }
        }
        return new int[]{repeated,missing};
    }
}
