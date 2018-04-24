#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    
    int i,j,k,l,m=0;
    int A[26];
    char word[11];
    for(i=0;i<26;i++)
        {
    scanf("%d",&A[i]);
    }
    scanf("%s",word);
    j=strlen(word);
    for(k=0;k<j;k++)
        {
       
         l=word[k]; 
        l=l-97;
        if(A[l]>m)
        m=A[l];
    }
    printf("%d",(m*j));
    
    return 0;
}
