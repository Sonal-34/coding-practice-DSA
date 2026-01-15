package String;

public class Valid_Anagaram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t)
    {
        int n = s.length();
        int m = s.length();
        int freq[] = new int[26];
        if(n != m)
        {
            return false;
        }

        for(int i =0; i < n; i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i =0; i < m; i++)
        {
            freq[t.charAt(i) - 'a']--;
        }
        for(int i =0; i < 26; i++)
        {
            if(freq[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}
