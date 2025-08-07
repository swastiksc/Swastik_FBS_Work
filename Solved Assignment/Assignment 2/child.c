#include<stdio.h>
void abc();
void main()
{
	abc();
}
void abc()
{
	int age=101;
	int child,teenager,adult,senior;
	if(age<12)
	printf("child");
	else if(age<19)
	printf("teenager");
	else if(age<59)
	printf("adult");
	else if(age<100)
	printf("senior");
	else
	printf("wrong choice");
}
