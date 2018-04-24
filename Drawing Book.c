#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n,p,ptotal,pno;
    scanf("%d",&n);
    scanf("%d",&p);
        ptotal=(n/2)+1;
        pno=(p/2)+1;
    if(pno<=(ptotal-pno)||(ptotal-pno)<0)
        {
        printf("%d",pno-1);
    }
    else if((ptotal-pno)>=0)
        {
        printf("%d",(ptotal-pno));
    }
    
    return 0;
}
