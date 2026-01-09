package Array;

import java.util.HashSet;

public class Longest_Substring {
    public static void main(String[] args) {
     String str = "abcabcbb";
     Longest_Substring ls = new Longest_Substring();
     int result = ls.lengthOfLongestSubstring(str);
        System.out.println("Length of Longest Substring: " + result);
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(s.length() == 1) return 1;

        HashSet<Character> set = new HashSet<>();
        int maxLen=0;
        int left=0;
        int right=0;
        while(right<n)
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                maxLen=Math.max(maxLen,right-left+1);
                right++;
            }
            else
            {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }

}
