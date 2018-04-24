import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        int A[]=new int[a];
        int B[]=new int[a];
        for (int p=0;p<a;p++)
        {
            A[p]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(A[i]==A[j])
                {
                    B[i]=B[i]+1;
                }
            }
        }
        int max=B[0];
        for(int k=0;k<a;k++)
        {
            if(B[k]>max)
            {
                max=B[k];
            }
        }
        int min=(a-max);
        System.out.println(min);
    
    }
}