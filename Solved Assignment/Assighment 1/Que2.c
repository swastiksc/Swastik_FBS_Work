#include<stdio.h>
void main()
{
 int no=123;
 int r1,r2,r3,rev;
 int q1;
   r1=no%10;
   q1=no/10;
   r2=q1%10;
   r3=q1/10;
   rev=r1*100+r2*10+r3;
   if(rev==no)
     {
      printf("no is palindrome %d",no);
     }
     else
     {
        printf("no is not palindrome %d",no);
     }
}