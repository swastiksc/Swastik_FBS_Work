#include<stdio.h>

void main() 
{
    int num = 372;       
    int i = num;
    int sum = 0, r;

    
    while (num != 0) {
        r= num % 10;
        sum += r*r*r; 
        num /= 10;
    }
        {
    if (sum == i)
        printf("%d is an Armstrong\n",i);
    else
        printf("%d is not an Armstrong\n",i);
        }
}