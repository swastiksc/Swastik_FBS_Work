#include <stdio.h>

void main()
 {
    int no = 5;
    int fact = 1;
    int i = no;

    while (i > 0) {
        fact = fact * i;
        i--;
    }

    printf("Factorial of %d = %d\n", no, fact);
    
}