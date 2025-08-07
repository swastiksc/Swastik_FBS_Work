#include<stdio.h>
void main()
{
	int n=11,i,j;
	for(i=1;i<=11;i++)
	{
		for(j=1;j<=11;j++)
		{
			if(i==1||i==11||j==1||j==11||i==j)
			printf("* ");
			else
				printf("  ");	
		}		
		printf("\n");
	}
}
