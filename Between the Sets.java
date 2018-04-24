import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }
    
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }
    
    
    static int getTotalX(int[] a, int[] b,int n) 
    {
    
        int m=lcm(a);
    
        int count=0;
         for(int j=1;m*j<=100;j++)
        {
            if(divides(b,m*j)==1)
            {
                count++;
               // System.out.println(j);
            }
            
         }
        return count;
        
            
    }
    
    static int divides(int b[],int m)
    {
        for(int l=0;l<b.length;l++)
        {
            if(b[l]%m==0)
            {}
            else
            {
                return -1;
            }
            
        }
        return 1;
        
    }
    
    

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b,n);
        System.out.println(total);
        in.close();
    }
}
