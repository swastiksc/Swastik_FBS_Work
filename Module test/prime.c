#include <stdio.h>

void main() 
{
    int start, end, i, j, isPrime,sum=0;
	printf("Enter the start of the range: ");
    scanf("%d",&start);
	printf("Enter the end of the range: ");
    scanf("%d",&end);
	i=start;
	while(i<=end) 
	{
        if(i>1) 
		{
			isPrime=1;
			j=2;
            while(j*j<=i) 
			{
                if(i%j==0) 
				{
                    isPrime=0;  
                    break;
                }
                j++;
            }
			if(isPrime) 
			{
                sum+=i;
            }
        }
        i++;
    }
	printf("Sum of prime numbers between %d and %d is: %d\n",start,end,sum);
}

