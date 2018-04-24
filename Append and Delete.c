import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
    
    int l=s.length();
    int m=t.length();
   char a[]=s.toCharArray();
   char b[]=t.toCharArray();
    int count=0;
    for(int i=0;i<l&&i<m;i++)
    {
        if(a[i]==b[i])
        {
            count++;
        }
        else
        {
            break;
        }
        
    }
    
    int diff=l+m-2*count;
    if((diff>k))
    System.out.println("No");
    else if(diff%2==k%2)
    System.out.println("Yes");
       else if((l+m-k)<0)
       System.out.println("Yes");
       else
       {
        System.out.println("No");   
       }

    }
    }
