#include <stdio.h>

// Function that prints numbers from *start to *end using pointers
void printNumbers(int* start, int* end) {
    int i;
    for (i = *start; i <= *end; i++) {
        printf("%d\n", i);
    }
}

int main() {
    int from = 1;
    int to = 10;

    // Pass addresses (pointers) to the function
    printNumbers(&from, &to);

    return 0;
}

