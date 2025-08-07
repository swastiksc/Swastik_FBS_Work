#include<stdio.h>
void main()
{
	int n=4,i,j;
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=4;j++)
		{
			if(i==1||i==4||j==1||j==4||i==j)
			printf("* ");
			else
				printf("  ");	
		}		
		printf("\n");
	}
}
