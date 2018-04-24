#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main() {
    int n,i,j,k,l,p,d,m,sum,count;
    int A[100];
    scanf("%d", &n);
 
    for(int i = 0; i < n; i++)
    {
       scanf("%d",&A[i]);
    }
    scanf("%d %d", &d, &m);
    count=0;
    for(j=0;j<=(n-m);j++)
        { sum=0;
         p=j;
        for(k=0;k<m;k++)
            {
            
            sum=sum+A[p];
            p++;
        }
         
        if(sum==d)
            {
            count++;
        }
    }
    
      printf("%d\n", count);
    return 0;
}
