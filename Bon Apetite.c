#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
     int n,k,i,sum=0,sum1=0,A[100000],billc,billn;
    scanf("%d %d",&n,&k);
    for(i=0;i<n;i++)
        {
        scanf("%d",&A[i]);
    }
    scanf("%d",&billc);
    for(i=0;i<n;i++)
        {
        sum=sum+A[i];
    }
    sum1=sum-A[k];
    billn=billc-(sum1/2);
    if(billn==0)
        {
        printf("Bon Appetit");
    }
    else
        {
        printf("%d",billn);
    }
    return 0;
}