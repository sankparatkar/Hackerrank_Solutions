import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     static int flag=0;
    static void isKaprekar(String a,long temp)
    {
        if(temp<10)
        {
        if(temp==1||temp==9)
        {
            System.out.print(temp+" ");
                
        }
        }
        else
        {
        int n=a.length();
        //int flag=0;
        for(int i=1;i<n-1;i++)
        {
            String s1=a.substring(0,i);
            String s2=a.substring(i);
            Long temp1=Long.parseLong(s1);
            Long temp2=Long.parseLong(s2);
            
      //      System.out.println(temp1+" "+temp2);
            if(a.length()%2==0)
            {
            if((int)(temp1+temp2)==temp&&s1.length()==s2.length())
            {
                System.out.print(temp+" ");
                flag++;
                break;
            }
            }
            else
            {
             if((int)(temp1+temp2)==temp&&(s1.length()==s2.length()-1))
            {
                System.out.print(temp+" ");
                flag++;
                break;
            }   
            }
                
        }
    //    System.out.println();
    }
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        long p=sc.nextInt();
        long q=sc.nextInt();
       
       
        for(int i=0;i<(q-p)+1;i++)
        {
            long temp=p+i;
            Long temp1= (temp*temp);
            String str=temp1.toString();
            
            isKaprekar(str,temp);
           
            
        }
         if(flag==0)
            System.out.println("INVALID RANGE");
        
        
        
    }
}