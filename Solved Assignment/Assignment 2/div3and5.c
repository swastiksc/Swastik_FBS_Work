#include<stdio.h>
void main()
{
	int no=8;
	if(no%3==0&&no%5==0)
	{
		printf("both");
	}
	else if(no%3==0&&no%5!=0)
	{
		printf("div by 3");
	}
	else if(no%3!=0&&no%5==0)
	{
		printf("div by 5");
	}
	else
	{
		printf("not div by 3 & 5");
	}
	
}
