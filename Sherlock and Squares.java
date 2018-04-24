import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int p=(int)Math.floor(Math.sqrt(a));
            int q= (int)Math.ceil(Math.sqrt(b));
         
   //           System.out.println(p +" "+" "+ q);
            
         //   p= (int)Math.floor(p);
        //    q= (int)Math.ceil(q);
           
     //       System.out.println(p +" "+" "+ q+ " "+ p*p +" "+ " "+q*q+" "+ a +" "+ b);
            
             int diff=0;
            if(p*p==a&&q*q==b)
            {
                diff=q-p+1;
            }
            else if(p*p==a&&q*q>b)
            {
                diff=q-p;
            }
           else if(p*p<a&&q*q==b)
            {
              diff=q-p;
            }
             else if(p*p<a&&q*q>b)
            {
            diff=q-p-1;
            }
            
          
          
            System.out.println(diff);
            
        }
    }
}