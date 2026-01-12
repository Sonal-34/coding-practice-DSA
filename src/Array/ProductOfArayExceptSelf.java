package Array;
import java.util.Arrays;
public class ProductOfArayExceptSelf {
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4};

        ProductOfArayExceptSelf obj = new ProductOfArayExceptSelf();
        int[] result = obj.productExceptSelf(nums);

        System.out.println("Product of array except self:");
        System.out.println(Arrays.toString(result));
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans,1);

        //calculate prefix and stored in ans
        for(int i=1;i<n;i++)
        {
            ans[i] = ans[i-1] * nums[i-1];
        }

        //calculate suffix and update ans
        int suffix = nums[n-1];
        for (int i = n - 2; i >= 0; i--)
        {
            ans[i] = ans[i] * suffix; // prefix * suffix
            suffix *= nums[i];
        }
        return ans;
    }
}
