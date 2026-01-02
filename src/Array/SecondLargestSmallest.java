package Array;

public class SecondLargestSmallest {
    public static void main(String[] args)
    {
        int arr[] ={5,9,3,12,6,18,2,15};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE ;
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
               second_largest = largest;
               largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i] < largest)
            {
                second_largest = arr[i];
            }

            //smallest and second smallest
            if(arr[i] < smallest)
            {
                second_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < second_smallest && arr[i] < smallest)
            {
                second_smallest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second_largest);

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + second_smallest);
    }
}
