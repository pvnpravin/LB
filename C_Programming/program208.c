#include<stdio.h>
#include<fcntl.h>

int main()
{
   int fd = 0, iRet = 0;
   char fileName[20];
   char Data[50] = {"\0"}; 

   printf("Enter the Name of File : \n");
   scanf("%s", fileName);

   fd = open(fileName, O_RDWR);

   if(fd == -1)
   {
    printf("Unable to open");
    return -1;
   }

   iRet = read(fd, Data, 7);

   printf("%d bytes get successfully Read \n", iRet);

   printf("Data from file \n");

   write(1, Data, iRet);
   
   printf("\n");

   close(fd);

    return 0;
}