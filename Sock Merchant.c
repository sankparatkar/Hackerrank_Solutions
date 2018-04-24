#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n,i,A[100],temp; 
    scanf("%d",&n);
    for(i=0;i<100;i++)
        {
        A[i]=0;
    }
    for(i=0;i<n;i++)
        {
        scanf("%d",&temp);
        A[temp-1]++;
    }
    A[0]=A[0]/2;
    for(i=1;i<100;i++)
        {
        A[i]=A[i]/2;
        A[i]=A[i]+A[i-1];
        }
    printf("%d",A[99]);
    return 0;
}
