#include <stdio.h>

int main() {
    int num1, num2;
    char operator;
    printf("enter the no");
    scanf("%d%d",&num1,&num2);

  

    printf("Enter operator (+, -, *, /, %%): ");
    scanf(" %c", &operator);  
   
            printf("Result: %d\n", num1 + num2);
           
            printf("Result: %d\n", num1 - num2);
           
            printf("Result: %d\n", num1 * num2);
           
            if (num2 != 0)
                printf("Result: %d\n", num1 / num2);
            else
                printf("Error: Division by zero is not allowed.\n");
           
            if (num2 != 0)
                printf("Result: %d\n", num1 % num2);
            else
                printf("Error: Modulo by zero is not allowed.\n");
            
       
            printf("Invalid operator.\n");
    }



