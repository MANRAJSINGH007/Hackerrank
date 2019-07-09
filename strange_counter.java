import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        
        long x=3;
        long sum=3;
        long prev=3;
        long start=1;
        long end=start+prev-1;
        
        int box_number=1;
        
        while(sum<t)
        {
            sum+=2*prev;
            start=start+prev;
            prev=2*prev;
            end=start+prev-1;
            box_number++;
            
        }
        return (end-t+1);
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
