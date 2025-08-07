#include <stdio.h>

int main() {
    int num, i = 2, isPrime = 1;

    printf("Enter a positive integer: ");
    scanf("%d", &num);

    if (num <= 1) {
        isPrime = 0;  
    } else {
        while (i <= num / 2) { 
            if (num % i == 0) {
                isPrime = 0;
                break;
            }
            i++;
        }
    }

    if (isPrime)
        printf("%d is a prime number.\n", num);
    else
        printf("%d is not a prime number.\n", num);

    return 0;
}  