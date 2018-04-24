import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int year){
        int Days[]=new int[12];
            int i,result,day=0,month=0; 
    
  
    if((year>1918)&&(year%400==0||(year%4==0&&year%100!=0)))
        {
        
        Days[1]=29;
       
    }
        else if(year<1918&&(year%4==0))
        {
            Days[1]=29;
        }
    else
    { Days[1]=28; }
    Days[0]=31;
    Days[2]=31;
    Days[3]=30;
    Days[4]=31;
    Days[5]=30;
    Days[6]=31;
    Days[7]=31;
    Days[8]=30;
    Days[9]=31;
    Days[10]=30;
    Days[11]=31;

    if(year==1918)
        {
        Days[1]=15;
    }
    result=256;
    for(i=0;i<12;i++)
        {
    result=result-Days[i];
        if(result<28)
            {
            month = i+2;
            day=result;
            break;
        }
    }
   System.out.println(day+".0"+month+"."+year);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
         solve(year);
        
    }
}