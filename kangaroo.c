#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int x1; 
    int v1; 
    int x2; 
    int v2,p,i; 
    scanf("%d %d %d %d",&x1,&v1,&x2,&v2);
    
        if(v2<v1)
            {
                 p=(x2-x1)%(v1-v2); 
                for(i=0;i<p;i++)
                    {}
                if(p==0)
                    {
                printf("YES");        
                }
                 else
            {
            printf("NO");
            }
    
            
            
            }
        else
            {
            printf("NO");
            }
    
  
        
  
        
    
    return 0;
}
