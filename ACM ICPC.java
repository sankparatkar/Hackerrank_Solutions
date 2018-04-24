import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        
        for (int topic_i=0; topic_i < n; topic_i++)
        {
            topic[topic_i] = in.next();
        }
        int maxn=0;
        int maxt=0;
       
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                char temp1[]=topic[i].toCharArray();
                char temp2[]=topic[j].toCharArray();
                int temp[]=new int[m];
                for(int p=0;p<m;p++)
                {
                    int a=(int)temp1[p]-48;
                    int b=(int)temp2[p]-48;
                    temp[p]=a|b;
                }
                int count=0;
                for(int p=0;p<m;p++)
                { 
                    if(temp[p]==1)
                    {
                        count++;
                    }
                   
                }
               
                 if(count==maxn)
                {
                    maxt++;
             
                }
                 if(count>maxn)
                    {
                        maxn=count;
                        maxt=1;
                
                    }
               
            }
            
        }
        
        System.out.println(maxn);
        System.out.println(maxt);
        
    }
}
