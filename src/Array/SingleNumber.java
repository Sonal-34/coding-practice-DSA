package Array;

public class SingleNumber
 {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2,3,4};
        int result=singleNumber(arr);
        System.out.println("Unique number from the array is: " + result);
    }
    public static int singleNumber(int[] arr)
    {
        int xorResult = 0;
        for(int i=0;i<arr.length;i++)
        {
            xorResult ^= arr[i];
        }
        return xorResult;

    }
}
