#include<stdio.h>
#include<stdlib.h>

float Average(int Arr[], int iSize)
{
    int iCnt = 0, iSum = 0;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        iSum = iSum + Arr[iCnt];
    }

    return (iSum / iSize); // issue not showing exact precision point like 33.33
}

int main()
{
    int iLength = 0, iCnt = 0;
    float fRet = 0.0f;    
    int *ptr = NULL;

    printf("Enter Number of Elements : ");
    scanf("%d", &iLength);

    ptr = (int *)malloc(iLength * sizeof(int));
    if(NULL == ptr)
    {
        printf("Unable to allocate Memory \n");
        return -1;
    }

    printf("Enter The Elements : \n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &ptr[iCnt]);
    }

    fRet = Average(ptr, iLength);

    printf("Average of all Elements : %f\n", fRet);
    free(ptr);

    return 0;
}