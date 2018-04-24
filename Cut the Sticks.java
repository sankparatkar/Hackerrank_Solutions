import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        for(int j=0;j<n;j++)
        {   int temp=0;
            int count=0;
            int small=0;
        for(int i=0;i<n;i++)
        { 
            
            if(arr[i]<=0)
            {
                temp=temp+1;
                continue;
            }
            else if(temp==i)
            {
                small=arr[temp];
            }
            
           arr[i]=arr[i]-small ;
           count++;
            
        }
            if(count==0)
        {
                break;
           }
            else
            {
                System.out.println(count);
            }
            
            
        }
    }
}
