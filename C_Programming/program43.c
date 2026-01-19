// Input : 12 2  Output : true
// Input : 12 3  Output : true
// Input : 12 5  Output : false
// Input : 12 12  Output : true
// Input : 12 2  Output : true

#include<stdio.h>

int main()
{
    
    int iValue1 = 0, iValue2 = 0;

    printf("Enter First Number : ");
    scanf("%d", &iValue1);

    printf("Enter Second NUmber : ");
    scanf("%d", &iValue2);

    if((iValue1 % iValue2) == 0)
    {
        printf("It is Completely Divisible..\n");
    }
    else
    {
        printf("It is NOT Divisible..\n");
    }

    return 0;
}