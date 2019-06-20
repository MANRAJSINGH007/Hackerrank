import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int designerPdfViewer(int[] h, String word) {
        int len=word.length();
        char ch[]=new char[len];
        for(int i=0;i<len;i++)
        {
            ch[i]=word.charAt(i);
        }
        // converted into a character array.
        int b[]=new int[len];
        for(int i=0;i<len;i++)
        {
            b[i]=h[((int)ch[i])-97];
        }
        // calculate max value in the array b[].
        int max=b[0];
        for(int i=1;i<len;i++)
        {
            if(b[i]>max)
            {
                max=b[i];
            }
        }
        
        return (len*max);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
