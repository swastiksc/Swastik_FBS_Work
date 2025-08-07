#include <stdio.h>

void main() 
{
    int no=28;
    int i=1;
    int sum=0;
        
    while (i<no) 
    {
        if(no%i==0)
         {
            sum=sum+i;
        }
        i++;
    }
    if (sum==no)
        printf("%d is a perfect\n");
    else
        printf("%d is not a perfect\n");

}