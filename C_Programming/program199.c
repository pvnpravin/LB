#include<stdio.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char fileName[20];

    printf("Enter File Name that you want to create : \n");
    scanf("%s", fileName);

    fd =creat(fileName, 0777);

    if(fd == -1)
    {
        printf("Unable to create file \n");
    }
    else
    {
        printf("File Successfully Cteated with fd : %d \n", fd);
    }
    
    return 0;
}