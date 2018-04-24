import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int height(int n)
    {
        int p,q,r,s,sum=1;
        for(int i=0;i<(n/2);i++)
        {
            sum=sum*2;
            sum=sum+1;
            
        }
        
        return sum;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int res=0;
            if(n%2==0)
            {
                res=height(n);
            }
            else
            {
                res=height(n-1)*2;
            }
            
            System.out.println(res);
            
        }
    }
}
