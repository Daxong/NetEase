public class KMP {
    public static int[] prefixArray(String pattern)
    {
        int[] prefix = new int[pattern.length()];
        prefix[0] = -1;//首位注定是-1
        int k = -1;
        int j =0;
        while( j < pattern.length()-1)
        {
            if (k == -1 || pattern.charAt(j) == pattern.charAt(k))
            {
                ++k;
                ++j;
                prefix[j] = k;

            }
            else
            {
                k = prefix[k];
            }
        }
        return  prefix;
    }

    public static int search(String mataStr, String pattern)
    {
        int i = 0;
        int j = 0;
        int sLen = mataStr.length();
        int pLen = pattern.length();
        while(i < sLen && j < pLen)
        {
            i++;
            j++;
            if( j == -1 || mataStr.charAt(i) == pattern.charAt(j) )
            {
                i++;
                j++;
            }
            else
            {
                j = prefixArray(pattern)[j];
            }
        }
        if (j == pLen)
        {
            return i - j;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {
        String str = "AAAA";

        for (int i : prefixArray(str))
        {
            System.out.println(i);
        }
    }
}
