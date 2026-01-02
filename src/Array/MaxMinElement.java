package Array;

public class MaxMinElement {
    public static void main(String[] args) {
        int arr[]={3,5,1,9,4};
        int result[] =maxMin(arr);
        System.out.println("Minimum element: " + result[0]);
        System.out.println("Maximum element: " + result[1]);
    }
    public static int[] maxMin(int[] arr) {


        if(arr.length == 0)
        {
            System.out.println("Array is empty");
            return new int[]{-1,-1};
        }
        int curr_max =arr[0];
        int curr_min =arr[0];

        for(int i=1;i<arr.length;i++)
        {
             if(arr[i]>curr_max)
             {
                 curr_max = arr[i];
             }
             if(arr[i]<curr_min)
             {
                 curr_min = arr[i];
             }

        }
        return new int[]{curr_min,curr_max};


    }
}
