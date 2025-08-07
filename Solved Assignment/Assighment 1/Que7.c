#include<stdio.h>
void main()
{
 double bs=8000;        //bs basic salary
 double da,ta,hra,ts;
  if(bs<5000)
  {
    da=bs*0.10;
    ta=bs*0.15;         //da,ta,hra salary amount offered ammount
    hra=bs*0.20;
  }
  else
  {
        da=bs*0.15;
  }
   ts=bs+da+ta+hra;     //ts total salary
   {
    printf("ts= %f",ts);
   }
}