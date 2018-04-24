#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int i,j,k,l,n,count=0,count1=0;
    char A[1000000];
    scanf("%d",&n);
    for(i=0;i<n;i++)
        {
        scanf("%c",&A[i]);
    }
     for(i=0;i<n;i++)
        {
        if(A[i]=='U')
            {
            count++;
        }
         if(A[i]=='D')
            {
            count--;
        }
         if(count==0&&A[i+1]=='D')
     {
             count1++;
         }
         
    }
    printf("%d",count1);
    return 0;
}
