package Array;
public class FindSecondLargest
{
    public static void main(String[] args) {
        int arr[] ={3,23,43,1,10,4,43};
        System.out.print("Second Largest Element of Array is: " + findSecondLargest(arr));
    }
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
