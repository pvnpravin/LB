#include<stdio.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char fileName[20];

    printf("Enter File Name that you want to Open : \n");
    scanf("%s", fileName);

    fd = open(fileName, O_RDWR);

    if(fd == -1)
    {
        printf("Unable to Open the file\n");
    }
    else
    {
        printf("File Successfully Open with fd : %d \n", fd);
    }
    
    return 0;
}