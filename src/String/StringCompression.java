package String;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','a','b','b','c','c','c','c'};

        int newLength = compress(chars);

        System.out.println("Compressed Length: " + newLength);

        System.out.print("Compressed Array : ");
        for (int i = 0; i < newLength; i++)
        {
            System.out.print(chars[i]);
        }
    }
    public static int compress(char[] chars) {
        int i =0;
        int k = 0;

        while(i<chars.length)
        {
            char currentChar = chars[i];
            int count = 0;

            while(i<chars.length && chars[i] == currentChar)
            {
                i++;
                count++;
            }
            chars[k] = currentChar;
            k++;

            if(count > 1)
            {
                String c = String.valueOf(count);

                for(char digit : c.toCharArray())
                {
                    chars[k] = digit;
                    k++;
                }
            }

        }
        return k;

    }
}
