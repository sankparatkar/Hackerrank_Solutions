import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
        
            long res=0;
            if(x<=y)
            {
                res=res+x*b;
                if((x+z)<=y)
                    res=res+(x+z)*w;
                else
                    res=res+y*w;
            }
            else 
            {
                res=res+y*w;
                if((y+z)<=x)
                    res=res+(y+z)*b;
                else
                    res=res+x*b;
            }
        System.out.println(res);    
        }
        
        
    }
}
