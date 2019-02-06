import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        
        int num=obstacles.length;
        int l=0;
        int r=n+1;
        int u=n+1;
        int d=0;
        int d_max1=n+2;
        int d_max2=n+2;
        int d_max3=n+2;
        int d_max4=n+2;
        
        for(int i=0;i<num;i++)
        {
           int ox=obstacles[i][0];
           int oy=obstacles[i][1];
           if(ox==r_q)
           {
               if(oy<c_q)
               {
                   if(oy<=l)
                   {
                       
                   }
                   else
                   {
                       l=oy;
                   }
               }
               if(oy>c_q)
               {
                   if(oy>=r)
                   {
                       
                   }
                   else
                   {
                       r=oy;
                   }
               }
               
           }
            
           if(oy==c_q)
           {
               if(ox<r_q)
               {
                   if(ox<=d)
                   {
                       
                   }
                   else
                   {
                       d=ox;
                   }
               }
               if(ox>r_q)
               {
                   if(ox>=u)
                   {
                       
                   }
                   else
                   {
                       u=ox;
                   }
               }
               
           }
           
           if(ox>r_q && oy>c_q)
           {
               int dif1=ox-r_q;
               int dif2=oy-c_q;
               if(dif1==dif2)
               {
                   if(dif1<d_max1)
                   {
                       d_max1=dif1;
                   }
               }
           }
            if(ox<r_q && oy>c_q)
           {
               int dif1=ox-r_q;
               int dif2=oy-c_q;
               dif1=-dif1;
               if(dif1==dif2)
               {
                   if(dif1<d_max2)
                   {
                       d_max2=dif1;
                   }
               }
           }
            if(ox>r_q && oy<c_q)
           {
               int dif1=ox-r_q;
               int dif2=oy-c_q;
               dif2=-dif2;
               if(dif1==dif2)
               {
                   if(dif1<d_max3)
                   {
                       d_max3=dif1;
                   }
               }
           }
            if(ox<r_q && oy<c_q)
           {
               int dif1=ox-r_q;
               int dif2=oy-c_q;
               dif1=-dif1;
               dif2=-dif2;
                
               if(dif1==dif2)
               {
                   if(dif1<d_max4)
                   {
                       d_max4=dif1;
                   }
               }
           }
            
            
        }
        
        int x=r_q;
        int y=c_q;
        int count=2*n-2;
        while(x<n && y<n)
        {
            x++;
            y++;
            count++;
        }
        x=r_q;
        y=c_q;
        while(x>1 && y>1)
        {
            x--;
            y--;
            count++;
        }
        x=r_q;
        y=c_q;
        while(x>1 && y<n)
        {
            x--;
            y++;
            count++;
        }
        x=r_q;
        y=c_q;
        while(x<n && y>1)
        {
            x++;
            y--;
            count++;
        }
        
        // counting the number of squares the queen attacks when board is empty.
        for(int i=0;i<num;i++)
        {
            int ox=obstacles[i][0];
            int oy=obstacles[i][1];
            if(ox==r_q)
            {
                
                if(oy<c_q)
                {
                    if(oy==l)
                    count-=oy;
                }
                else
                {
                    if(oy==r)
                    count-=n-oy+1;
                }
                
            }
            if(oy==c_q)
            {
                if(ox<r_q)
                {
                    if(ox==d)
                    count-=ox;
                }
                else
                {
                    if(ox==u)
                    count-=n-ox+1;
                }
                
            }
            if(ox>r_q && oy>c_q)
            {
                x=ox;
                y=oy;
                int d1=ox-r_q;
                int d2=oy-c_q;
                if(d1<0)
                {
                    d1=-d1;
                }
                if(d2<0)
                {
                    d2=-d2;
                }
                if(d1==d2)
                {
                    if(d1==d_max1)
                    {
                        int c1=1;
                        while(x<n && y<n)
                        {
                            x++;
                            y++;
                            c1++;
                        }
                        count-=c1; 
                    }
                    
                }
                
                
            }
            if(ox<r_q && oy<c_q)
            {
                x=ox;
                y=oy;
                int d1=ox-r_q;
                int d2=oy-c_q;
                if(d1<0)
                {
                    d1=-d1;
                }
                if(d2<0)
                {
                    d2=-d2;
                }
                if(d1==d2)
                {
                    if(d1==d_max4)
                    {
                        int c2=1;
                        while(x>1 && y>1)
                        {
                            x--;
                            y--;
                            c2++;
                        }
                        count-=c2;
                    }
                    
                }
                
            }
            if(ox>r_q && oy<c_q)
            {
                x=ox;
                y=oy;
                int d1=ox-r_q;
                int d2=oy-c_q;
                if(d1<0)
                {
                    d1=-d1;
                }
                if(d2<0)
                {
                    d2=-d2;
                }
                if(d1==d2)
                {
                    if(d1==d_max3)
                    {
                        int c2=1;
                        while(x<n && y>1)
                        {
                            x++;
                            y--;
                            c2++;
                        }
                        count-=c2;   
                    }
                    
                }
                
            }
            if(ox<r_q && oy>c_q)
            {
                x=ox;
                y=oy;
                int d1=ox-r_q;
                int d2=oy-c_q;
                if(d1<0)
                {
                    d1=-d1;
                }
                if(d2<0)
                {
                    d2=-d2;
                }
                if(d1==d2)
                {
                    if(d1==d_max2)
                    {
                        int c2=1;
                        while(x>1 && y<n)
                        {
                            x--;
                            y++;
                            c2++;
                        }
                        count-=c2; 
                    }
                    
                }
                
            }
            
            
        }
        
        return count;
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
