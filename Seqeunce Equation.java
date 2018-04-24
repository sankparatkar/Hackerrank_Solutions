import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
   static  int linearSearch(int A[],int k)
   {
       int i;
        for(i=0;i<A.length;i++)
        {
            if(A[i]==k)
            {
                return i+1;
                
            }
            
        }
       
       
       return -1;
   }
    
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int p=linearSearch(a,i+1);

            int q=linearSearch(a,p);
            System.out.println(q);
            
            
        }
        
        
    }
}
