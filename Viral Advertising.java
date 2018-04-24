import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 static   int res1(int n)
    {
        int a=n/2;
        a= (int)Math.floor(a);
        return a;
        
        
    }
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=5; 
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=res+res1(p);
            p=res1(p)*3;
        }
        System.out.println(res);
        
    
    }
}