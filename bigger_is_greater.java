import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String s) {
        
        int n=s.length();
        if(n==1)
        {
            return "no answer";
        }
        char ch[]=s.toCharArray();
        int i=2;
        int flag=0;
        String x="";
        String y="";
        String z="";
        l:for(i=2;i<=n;i++)
        {
            x=s.substring(n-i,n);
            char c2[]=x.toCharArray();
            Arrays.sort(c2);
            for(int h=c2.length-1;h>=0;h--)
            {
                if(c2[h]!=x.charAt(c2.length-h-1))
                {
                    flag=1;
                    break l;
                }
            }
            
        }
        if(i==n+1 && flag==0)
        {
            return "no answer";
        }
        
        else
        {
            int size=x.length();
            char dem[]=x.toCharArray();
            int min=10000;
            int index=0;
            char cc=x.charAt(0);
            int ascii=(int)cc-97;
            int d=1;
            for(d=1;d<x.length();d++)
            {
                if(x.charAt(d)>cc)
                {
                    int a=(int)x.charAt(d)-97;
                    if(a-ascii<min)
                    {
                        min=a-ascii;
                        index=d;
                    }
                }
            }
            dem[0]=dem[index];
            dem[index]=cc;// swapping is done
            Arrays.sort(dem,1,dem.length);
            String ans=new String(dem);
            ans=s.substring(0,n-i)+ans;
            return ans;
            
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close(); 
    }
}
