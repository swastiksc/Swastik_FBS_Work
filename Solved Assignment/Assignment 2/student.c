#include<stdio.h>
void main()
{
	double price=400;
	char isstudent='n';
	double totalprice;
	double discount=0;
	if(isstudent=='y')
	{
		if(price>500)
		{
		
		discount=price*0.20;
		totalprice=price-discount;
	}
		else
		{
			discount=price*0.10;
		totalprice=price-discount;
	}
		
	}
	else
	{
		if(price>600)
		{
		
				discount=price*0.20;
		totalprice=price-discount;
	}
		else
		totalprice=price;
		
	}
	if(discount==0)
		printf("the final price of customer is%lf",	totalprice);
	
	else	
	printf("the final price of customer with %lf discount is%lf",discount,	totalprice);
	
}
