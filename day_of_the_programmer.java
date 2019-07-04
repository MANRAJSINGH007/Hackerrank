import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int y){
        String s="";
        if(y<1918)
        {
            if(y%4!=0)
            {
               System.out.print("13.09."+y); 
            }
            else
            {
               System.out.print("12.09."+y);
            }
        }
        else if(y==1918)
        {
            System.out.print("26.09."+y);
        }
        else
        {
            if(y%400==0 || (y%100!=0 && y%4==0))
            {
               System.out.print("12.09."+y);
            }
            else
            {
                System.out.print("13.09."+y);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        solve(year);
    }
}
