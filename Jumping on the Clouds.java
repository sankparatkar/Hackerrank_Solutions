import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int jump=0;
        for(int i=0;i<n-1;)
        {
            if((i+2)<=(n-1)&&c[i+2]==0)
            {
                i=i+2;
                jump=jump+1;
            }
            else
            {
                i=i+1;
                jump=jump+1;
            }
        }
        System.out.println(jump);
    }
}
