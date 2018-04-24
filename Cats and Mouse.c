#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int q,i,x,y,z; 
    scanf("%d",&q);
    for(i=0;i<q;i++)
        {
        scanf("%d %d %d",&x,&y,&z);
    /*    if((z>y)&&(y>x))
            {
            printf("\nCat B");
        }
        if((z>x)&&(x>y))
            {
            printf("\nCat A");
        }
        if((z<y)&&(y<x))
            {
            printf("\nCat B");
        }
        if((z<x)&&(x<y))
            {
            printf("\nCat A");
        }
        else */
            {
            if(abs(x-z)<abs(z-y))
                {
                printf("Cat A\n");
            }
             if(abs(x-z)>abs(z-y))
                {
                printf("Cat B\n");
            }
             if(abs(x-z)==abs(z-y))
                {
                printf("Mouse C\n");
            }


        }
    }
    return 0;
}
