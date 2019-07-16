import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String x) {
        Stack<Character> s=new Stack<Character>();
            char c[]=x.toCharArray();
            int flag=0;
            
            for(int i=0;i<c.length;i++)
            {
                if(c[i]=='(' || c[i]=='{' || c[i]=='[')
                {
                    s.push(c[i]);
                    
                }
                else
                {   
                    if(s.size()==0)
                    {
                      flag=1;
                      return "NO";
                        
                    }
                    
                    
                    if(c[i]==')')
                    {   
                        
                        char ch=s.pop();
                        if(ch=='(')
                        {
                            
                        }
                        else
                        {
                            flag=1;
                            return "NO";
                            
                        }
                    }
                    else if(c[i]=='}')
                    {   
                       
                        char ch=s.pop();
                        if(ch=='{')
                        {
                            
                        }
                        else
                        {
                            flag=1;
                            return "NO";
                            
                        }
                    }
                    else
                    {   
                        
                        char ch=s.pop();
                        if(ch=='[')
                        {
                            
                        }
                        else
                        {
                            flag=1;
                            return "NO";
                            
                        }
                    }
                }
                
            }
            if(s.size()>0)
            {
                flag=1;
                return "NO";
                
            }
            if(flag==0)
            {
                return "YES";
            }
            
            return "YES";
            
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
