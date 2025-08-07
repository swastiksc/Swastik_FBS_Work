#include<stdio.h>
void main()
{
	int a=14,b=12,c=13;
	if(a>b)
	{
		if(a>c)
		{
			printf("a is greater");	
		}	
		else
		{
			printf("c is greater");	
		}
	}
		
	else
	{
		if(b>c)
		{
			printf("b is greater");
		}
		else
		{
			printf("c is greater");
		}
	}
	
}
