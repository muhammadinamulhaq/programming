/* A program to check whether a number is positive or not*/

#include<stdio.h>

int main()
{
int x;

printf("Enter a number to check whether it is positive or not: ");
scanf("%d",&x);

if(x>0)
{
    printf("Positive");
}

if(x<=0)
{
    printf("Non Positive");
}

return 0;
}
