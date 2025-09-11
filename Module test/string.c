#include<stdio.h>
void main()
{
	char str[50];
	int i;
	printf("enter the string ");
	scanf("%s",str);
	printf("user entered string= %s\n",str);
	for(i=0;str[i]!='\0';i++)
	if(str[i]=='a')
	{
		str[i]='@';
	}
	printf("Modified string= %s",str);
}














