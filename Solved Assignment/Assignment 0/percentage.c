#include <stdio.h>

int main() {
    float sub1=90, sub2=75, sub3=86, sub4=67, sub5=88;
    float total, percentage;

   
   
   
    total = sub1 + sub2 + sub3 + sub4 + sub5;

   
    percentage = (total / 500) * 100;

   
    printf("\nTotal Marks = %.2f\n", total);
    printf("Percentage = %.2f%%\n", percentage);

    return 0;
}

