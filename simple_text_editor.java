import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int q=sc.nextInt();
            Stack<String> stack=new Stack<String>();
            String s="";
            stack.push(s);
            for(int i=0;i<q;i++)
            {
                int n=sc.nextInt();
                if(n==1)
                {
                    String w=sc.next();
                    s=stack.peek()+w;
                    stack.push(s);
                }
                else if(n==2)
                {
                    int size=stack.peek().length();
                    int k=sc.nextInt();
                    if(k>=size)
                    {
                        s="";
                    }
                    else
                    {
                        s=stack.peek().substring(0,size-k);
                    }
                    stack.push(s);
                }
                else if(n==3)
                {
                    int k=sc.nextInt();
                    char ch=stack.peek().charAt(k-1);
                    System.out.println(ch);
                }
                else
                {
                    String x=stack.pop();
                }
            }
    }
}
