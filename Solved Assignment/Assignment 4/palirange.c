#include<stdio.h>
void main()
{
	int k;
	for(k=1;k<=1000;k++)
	{
	
	int no=k;
	int count=0;
	int temp=no;
	
	
	while(no>0)
	{
		count++;
		no=no/10;
	}
	
	
	no=temp;
	int sum=0,remainder;
	int res,i;
	while(no!=0)
	{
		res=1;
		
		remainder=no%10;
		for(i=1;i<=count;i++)
		sum=sum*10+remainder;
		no=no/10;	
	}
	if(original==sum)
	printf("%d is prime",temp);
}
}
