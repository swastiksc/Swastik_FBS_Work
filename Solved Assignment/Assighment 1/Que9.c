#include <stdio.h>

void main()
 {
    int no = 121;              
    int temp = no ;
    int rev = 0;

   
    while (no > 0) {
        int digit = no % 10;
        rev = rev * 10 + digit;
        no /= 10;
    }

  
    if (temp == rev )
     {
        printf("%d is a palindrome\n" , temp);
    } else {
        printf("%d is not a palindrome\n" , temp);
    }
}