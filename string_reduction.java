import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stringReduction function below.
    public static int find_min(int m1,int m2,int m3, int m4,int m5)
    {
        int arr[]=new int[5];
        arr[0]=m1;
        arr[1]=m2;
        arr[2]=m3;
        arr[3]=m4;
        arr[4]=m5;
        Arrays.sort(arr);
        return arr[0];
    }
    static int func(String s, int n, HashMap<String,Integer> map)
    {
        
        if(map.containsKey(s))
        {
            return map.get(s);
        }
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        int m3=Integer.MAX_VALUE;
        int m4=Integer.MAX_VALUE;
        int m5=Integer.MAX_VALUE;
        int flag=0;
        for(int i=0;i<n-1;i++)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            if(c2-c1==1)
            {
                flag=1;
                String temp=s.substring(0,i)+Character.toString((char)(c1-1))+s.substring(i+2,n);
                m1=func(temp,n-1,map);
                temp=s.substring(0,i)+Character.toString((char)(c2+1))+s.substring(i+2,n);
                m2=func(temp,n-1,map);
            }
            if(c1-c2==1)
            {
                flag=1;
                String temp=s.substring(0,i)+Character.toString((char)(c1+1))+s.substring(i+2,n);
                m3=func(temp,n-1,map);
                temp=s.substring(0,i)+Character.toString((char)(c2-1))+s.substring(i+2,n);
                m4=func(temp,n-1,map);
            }
            if(c2-c1==2 || c1-c2==2)
            {
                flag=1;
                String temp=s.substring(0,i)+Character.toString((char)((c1+c2)/2))+s.substring(i+2,n);
                m5=func(temp,n-1,map);
            }
            
        }

        if(flag==0)
        {
            map.put(s,s.length());
            return s.length();
        }

        int min=find_min(m1,m2,m3,m4,m5);
        map.put(s,min);
        return min;
    }

    static int func2(String s)
    {
        int n=s.length();
        int m1=0;
        int m2=0;
        int m3=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            int index=(int)ch-97;
            if(index==0)
            {
                m1++;
            }
            if(index==1)
            {
                m2++;
            }
            if(index==2)
            {
                m3++;
            }
        }

        if(m1==0 || m2==0 || m3==0)
        {
            if(m1==0 && m2==0)
            {
                return m3;
            }
            if(m1==0 && m3==0)
            {
                return m2;
            }
            if(m2==0 && m3==0)
            {
                return m1;
            }
            
        }
        
        if(m1%2==0 && m2%2==0 && m3%2==0)
        {
            return 2;
        }
        if(m1%2==1 && m2%2==1 && m3%2==1)
        {
            return 2;
        }

        return 1;
    }
    static int stringReduction(String s) {

        // int n=s.length();
        // HashMap<String,Integer> map=new HashMap<String,Integer>();
        // return func(s,n,map);
        return func2(s);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            int result = stringReduction(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
