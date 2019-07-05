import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int findDigits(int n) {
        int num=n;
        int k=10;
        int count=0;
        while(n!=n/10)
        {
            int rem=n%k;
            if(rem!=0)
            {
                if(num%rem==0)
                {
                    count++;
                }
                n=n/10;
            }
            else
            {
                n=n/10;
                
            }
        }
        
        return (count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
