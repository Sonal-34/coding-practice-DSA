package Array;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FourSum {
    public static void main(String[] args) {
        FourSum fs = new FourSum();
        int nums[] = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> ans = fs.fourSum(nums, target);
        System.out.println("Quadruplets are: ");
        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        if(n < 4) return result;

        Arrays.sort(nums);
        for(int i=0;i<n-3;i++)
        {
            //skip duplicate i
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++)
            {
                //skip duplicate j
                if(j > i+1 && nums[j] == nums[j-1])
                    continue;
                long remainingTarget = target - nums[i] - nums[j];
                int left=j+1;
                int right=n-1;
                //Two pointer search
                while(left<right)
                {
                    long sum = nums[left] + nums[right];
                    if(sum < remainingTarget)
                    {
                        left++;
                    }
                    else if(sum > remainingTarget)
                    {
                        right--;
                    }
                    else
                    {
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        // skip duplicates for left & right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                }
            }
        }
return result;
    }
}
