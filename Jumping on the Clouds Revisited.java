import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
       int p=0;
        int res=100;
        for(;;)
        {
            int m=(p+k)%n;
            
             if(c[m]==1)
            {
                res=res-3;
            }
             else if(c[m]==0)
            {
                res=res-1;
            }
            if(m==0||res<=0)
            {
                break;
            }
            p=m;
      
        }
        System.out.println(res);
        
        
    }
}
