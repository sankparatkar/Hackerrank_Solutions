import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    
   static int Calculate(int A[])
    {
       int count=0;
       int max=0;
        for(int i=0;i<A.length;i++)
        {
            if(count>=max)
            {
                max=count;
            }
            count=0;
            for(int j=i;j<A.length;j++)
            {
            if(Math.abs(A[i]-A[j])<=1)
            {
                count++;
            }
                else
                {
                    break;
                }
                 
               
             }
        }
       return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int res=Calculate(a);
        System.out.println(res);
    }
}
