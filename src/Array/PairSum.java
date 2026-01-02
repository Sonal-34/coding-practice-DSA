package Array;

public class PairSum {
    public static void main(String[] args) {
      int arr[]={2,7,11,15};
//      int target =9;
      int ans[] = pairSum(arr);
//        System.out.println(ans);
        if (ans[0] != -1) {
            System.out.println(ans[0] + " " + ans[1]);
        } else {
            System.out.println("No pair found");
        }
    }
    public static int[] pairSum(int[] arr) {
        //BRUTE FORCE APPROACH
//        int target =9;
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j = i+1; j<arr.length; j++)
//            {
//                if(arr[i]+arr[j] == target)
//                {
//                    return new int[]{arr[i], arr[j]};
//                }
//            }
//
//        }
//        return new int[]{-1,-1};
        //TWO POINTER APPROACH
        int i=0;
        int j=arr.length-1;
        int target = 26;
        while(i<j)
        {
            int sum  = arr[i] + arr[j];
            if(sum > target)
            {
                j--;
            }
            else if(sum < target)
            {
                i++;
            }
            else if(sum == target)
            {
                return new int[]{arr[i],arr[j]};
            }
        }
        return new int[]{-1,-1};

    }
}
