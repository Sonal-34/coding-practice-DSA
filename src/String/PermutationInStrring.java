package String;
import java.util.Arrays;

public class PermutationInStrring {
    public static void main(String[] args) {
        String s1="ab";
        String s2 = "eidbaooo";
        System.out.println(isPermutation(s1, s2));

    }
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int n1 = s1.length();

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        //building frequency for first window
        for(int i =0;i<s1.length();i++)
        {
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        //Compares
        if(Arrays.equals(freq1,freq2))
        {
            return true;
        }
        //Silde the window
        for(int i=n1;i<s2.length();i++)
        {
            //Add new character
            freq2[s2.charAt(i)-'a']++;
            //Remove old character
            freq2[s2.charAt(i-n1)-'a']--;
            // compares
            if(Arrays.equals(freq1,freq2))
            {
                return true;
            }
        }
        return false;

    }
}
