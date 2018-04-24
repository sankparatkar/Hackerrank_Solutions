import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        int i,j,k,l;
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int n= sc.nextInt();
        k= Integer.parseInt(a);
        l= Integer.parseInt(b);
        
        int count=0;
        for (i=k;i<=l;i++)
        {
            String reverse = new StringBuffer(String.valueOf(i)).reverse().toString(); 
            int p=Integer.parseInt(reverse);
            if(Math.abs(i-p)%n==0)
            {
                count++;
            }
        }
        
            System.out.println(count);
    }
}