package String;

public class RemoveAllOccurances {
    public static void main(String[] args) {
    String str = "daabcbaabcbc";
    String part = "abc";
    System.out.println(removeAllOccurances(str, part));
    }
    public static String removeAllOccurances(String str, String part) {
        int n = part.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<str.length();i++) {
            char c = str.charAt(i);
            sb.append(c);
            //chcking for last part
            if(sb.length() >= n)
            {
                String lastPart = sb.substring(sb.length() - n);
                if(lastPart.equals(part))
                {
                    sb.delete(sb.length() - n, sb.length());
                }

            }

        }
        return sb.toString();
    }
}
