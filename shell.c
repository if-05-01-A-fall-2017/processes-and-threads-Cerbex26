#include <stdio.h>
#include <sys/types.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char* argv[])
{
    char* commands;
    char input[256];
    do
    {
        printf("Enter your commands below:\n");
        fgets(input, 256, stdin);
        commands = strtok(input, "&&");
        if(commands == 0)
        {
            printf("Please insert a command!");
        }
        else
        {
            while (commands != 0)
            {
                system(commands);
                commands = strtok(0, "&&");
            }
        }
    }while(strcmp(input,"exit"));
    return 0;
}