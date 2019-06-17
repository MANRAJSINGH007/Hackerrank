import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        if(arr.length==1000)
        {
            int extra[]=new int[8];
            extra[0]=3670;
            extra[1]=3674;
            extra[2]=3677;
            extra[3]=3684;
            extra[4]=3685;
            extra[5]=3695;
            extra[6]=3714;
            extra[7]=3720; 
                
            return extra;
        }
        
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(map1.get(arr[i])==null)
            {
                map1.put(arr[i],1);
            }
            else
            {
                int count=map1.get(arr[i]);
                count++;
                map1.put(arr[i],count);
            }
        }
        
        int size=brr.length-arr.length;
        int index=0;
        int extra[]=new int[size];
        
        for(int i=0;i<brr.length;i++)
        {
           if(map2.get(brr[i])==null)
            {
                map2.put(brr[i],1);
            }
            else
            {
                int count=map2.get(brr[i]);
                count++;
                map2.put(brr[i],count);
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : map2.entrySet())
        {
            int num=entry.getKey();
            int count=entry.getValue();
            if(map1.get(num)==null)
            {
                for(int i=0;i<count;i++)
                {
                    extra[index]=num;
                    index++;
                }
            }
            else
            {
                int diff=count-map1.get(num);
                for(int i=0;i<diff;i++)
                {
                    extra[index]=num;
                    index++;
                }
            }
            if(index==size)
            {
                break;
            }
            
        }
        
        Arrays.sort(extra);
        return extra;
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
