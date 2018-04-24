import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int l=s.length();
        int col= (int)Math.ceil(Math.sqrt(l));
        int row=(int)Math.floor(Math.sqrt(l));
        
        for(int i=0;i<col;i++)
        {
            for(int j=i;j<l;j=j+col)
            {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            
        }

        
        
        
        
    }
}
