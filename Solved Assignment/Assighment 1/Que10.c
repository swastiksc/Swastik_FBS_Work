#include <stdio.h>

void main()
 {
    int no=12345;
    int fd , ld , temp, sum;

    
    temp = no;
    ld = temp % 10;           
    while (temp >= 10) {
        temp = temp / 10;
    }
    fd = temp;

    sum = fd + ld ;
    printf("Sum of first and last digit = %d\n", sum);

}