///////////////////////////////////////////////////////////////////
//
//  Required Header Files
//
///////////////////////////////////////////////////////////////////

#include<stdio.h>                         // For input output
#include<stdbool.h>                       // For bool dataType

///////////////////////////////////////////////////////////////////
//
//  Function Name : CheckEvenOdd
//  Description :   It is used to check even odd
//  Input :         Integer
//  Output :        Boolean
//  Auther :        Pravin
//  Date :          10/10/2025
//
///////////////////////////////////////////////////////////////////
bool CheckEvenOdd(int iNo)
{
    int iRem = 0;

    iRem = iNo % 2;

    if(iRem == 0)
    {return true;}
    else
    {return false;}
}

///////////////////////////////////////////////////////////////////
//
//   Entry Point function of the Application
//
///////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    bRet =  CheckEvenOdd(iValue);

    if(bRet == true)
    {printf("%d is Even Number \n",iValue);}
    else
    {printf("%d is Odd Number \n",iValue);}
    return 0;
}