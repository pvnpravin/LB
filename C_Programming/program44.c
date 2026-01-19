#include<stdio.h>
#include<stdbool.h>

bool CheckDivisible(int iNo1, int iNo2)
{
    if((iNo1 % iNo2) == 0)
    {
        return true;
    }    
    else
    {
        return false;
    }
}

int main()
{
    
    int iValue1 = 0, iValue2 = 0;
    bool bRet = false;

    printf("Enter First Number : ");
    scanf("%d", &iValue1);

    printf("Enter Second NUmber : ");
    scanf("%d", &iValue2);

    bRet = CheckDivisible(iValue1, iValue2);

    if(bRet == true)
    {
        printf("It is Completely Divisible..\n");
    }
    else
    {
        printf("It is NOT Divisible..\n");
    }

    return 0;
}