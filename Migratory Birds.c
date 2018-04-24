#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n,i,temp;
    int max,maxno; 
    scanf("%d",&n);
   int A[5]={0,0,0,0,0};
    for(i=0;i<n;i++)
        {
        scanf("%d",&temp);
        A[temp-1]=A[temp-1]+1;
    }
    max=A[0];
    for(i=0;i<5;i++)
        {
        if(A[i]>max)
            {
            max=A[i];
            maxno=i+1;
        }
    }
    printf("%d",maxno);
    return 0;
}
