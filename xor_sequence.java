import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the xorSequence function below.
    static long xorSequence(long l, long r) {
        
        long xor=0;
        long a=(l-1)%8;
        if(a==0 || a==1)
            xor=(l-1);
        else if(a==2 || a==3)
            xor=2;
        else if(a==4 || a==5)
            xor=(l+1);
        else
            xor=0;
        long b=(r)%8;
        if(b==0 || b==1)
            xor=xor^(r);
        else if(b==2 || b==3)
            xor=xor^2;
        else if(b==4 || b==5)
            xor=xor^(r+2);
        else
            xor=xor^0;
        
        return xor;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] lr = scanner.nextLine().split(" ");

            long l = Long.parseLong(lr[0]);

            long r = Long.parseLong(lr[1]);

            long result = xorSequence(l, r);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
