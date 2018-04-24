#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n,i,j,k,l;
    int A[100];
    scanf("%d",&n);
    for(i=0;i<n;i++)
        {
        scanf("%d",&A[i]);
    }
    for(i=0;i<n;i++)
        {
    if(A[i]>37)
        {
            l=A[i]/5;
            if(5*(l+1)-A[i]<3)
            {
                A[i]=5*(l+1);
            }    
        
    }
        printf("%d\n",A[i]);
    }
    return 0;
}