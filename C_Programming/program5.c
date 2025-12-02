#include<stdio.h>

int main()
{
    int i = 0, j = 0, Ans = 0;

    printf("Enter 1st  Number : \n");
    scanf("%d", &i);

    printf("Enter 2nd  Number : \n");
    scanf("%d", &j);

    Ans = i+j;    // Business Logic

    printf("Addition is : %d\n",Ans);

    return 0;
}
