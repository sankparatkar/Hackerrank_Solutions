#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n,k,i,j,l,m,p,A[100],sum,count=0;  
    scanf("%d %d",&n,&k);
    for(i=0;i<n;i++)
        {
        scanf("%d",&A[i]);        
    }
    for(i=0;i<n;i++)
        {
        for(j=i+1;j<n;j++)
            {
            sum=A[i]+A[j];
            if(sum%k==0)
                {
                count=count+1;
            }
        }
    }
   // count=count/2;
    printf("%d",count);
    return 0;
}
