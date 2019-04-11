import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flippingBits function below.
    static long flippingBits(long n) {
        
        String x="";
        while(n>0)
        {
            long a=n%2;
            x=a+x;
            n=n/2;
        }
        
        int len=x.length();
        int rem=32-len;
        for(int i=0;i<rem;i++)
        {
            x='0'+x;
        }
        
        char ch[]=x.toCharArray();
        for(int i=0;i<32;i++)
        {
            if(ch[i]=='1')
            {
                ch[i]='0';
            }
            else
            {
                ch[i]='1';
            }
        }
        
        x=new String(ch);
        long decimal=Long.parseLong(x,2);
        return decimal;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
