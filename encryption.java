import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        
        String x="";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isWhitespace(i))
            {
                
            }
            {
                x+=s.charAt(i);
            }
        }
        
        int n=x.length();
        int fl=(int)Math.floor(Math.sqrt(n));
        int cl=(int)Math.ceil(Math.sqrt(n));
        if(fl*cl<n)
        {
            fl++;
        }
        char arr[][]=new char[fl][cl];
        int index=0;
        for(int i=0;i<fl;i++)
        {
            for(int k=0;k<cl;k++)
            {
                arr[i][k]='~';
            }
        }
        l:for(int i=0;i<fl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(index==n)
                {
                    break l;
                }
                arr[i][j]=x.charAt(index);
                index++;
            }
        }
        
        for(int j=0;j<cl;j++)
        {
            for(int i=0;i<fl;i++)
            {
                if(arr[i][j]!='~')
                ans+=arr[i][j];
            }
            ans+=" ";
        }
        
        return ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
