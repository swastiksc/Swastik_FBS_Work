#include<stdio.h>
void main()
{
	int s1=20;
	int s2=200;
	int s3=100;
	if(s1==s2&&s2==s3)
	{
		printf("equivalance");	
	}
	else if(s1==s2||s2==s3||s1==s3)
	{
		printf("isosales");	
	}
	else
	{
		printf("scalence");
	}
	
	
}
