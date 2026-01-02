package Array;

public class MaxSubarraySum {
    public static void main(String[] args) {

        int nums[]={3,-4,5,4,-1};
        System.out.println(maxSubarraySum(nums));
    }
    public static int maxSubarraySum(int[] nums) {
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            maxsum=Math.max(maxsum,currsum);
            if(currsum<0)
            {
                currsum = 0;
            }
        }
        return maxsum;
    }
}
