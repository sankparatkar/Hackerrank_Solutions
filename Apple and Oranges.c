#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
{
    long int s,t,a,b,m,n,d,p;
    long int A[100000],B[100000],i,j,k,l,count1=0,count2=0;
    
    scanf("%ld %ld",&s,&t);
    scanf("%ld %ld",&a,&b);
    scanf("%ld %ld",&m,&n);
    for(i=0;i<m;i++)
        {
    scanf("%ld",&A[i]);
        }
    for(i=0;i<n;i++)
        {
    scanf("%ld",&B[i]);
        }
    for(i=0;i<m;i++)
        {
            if(A[i]>0)
                {
                p=a+A[i];
                if(p>=s&&p<=t)
                    {
                    count1++;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(B[i]<0)
                {
                p=b+B[i];
                if(p>=s&&p<=t)
                    {
                    count2++;
                }
            }
        }
    printf("%ld\n",count1);
    printf("%ld",count2);
    
    return 0;
}
