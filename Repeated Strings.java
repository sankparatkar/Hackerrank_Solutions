import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long d= n/s.length();
        long r= n%s.length();
        char c[]=s.toCharArray();
        
        int tcount=0;
        int hcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(c[i]=='a')
            {
                if(i<r)
                {
                    hcount++;
                }
                tcount++;
            }
        }
        System.out.println(tcount*d+hcount);
        
    }
}
