typedef struct task 
{
	int id;
	char des[50];
	char status[20];
}task;
void main()
{
	task t1[10];
	int i;
	for(i=0;i<3;i++)
	{
	printf("%d",&t1[i].id);
	printf("%s",&t1[i].des);
}
}
