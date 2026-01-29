#include<stdio.h>
#include<fcntl.h>

int main()
{
   int fd = 0, iRet = 0;
   char fileName[20];
   char Data[] = "India is My Country"; 

   printf("Enter the Name of File : \n");
   scanf("%s", fileName);

   fd = open(fileName, O_RDWR);

   if(fd == -1)
   {
    printf("Unable to open");
    return -1;
   }

   iRet = write(fd, Data, 11);

   printf("%d bytes get successfully written ", iRet);

   close(fd);

    return 0;
}