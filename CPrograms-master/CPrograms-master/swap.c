#include<stdio.h>
#include<conio.h>

void swap(int, int);

int main()
{
int x,y;

printf("Enter two numbers : \n1. x = ");

scanf("%d",&x);

printf("2. y = ");

scanf("%d",&y);

swap(x,y);

return 0;
}

void swap(int a, int b)
{
int t;
t=a;
a=b;
b=t;
printf("Swapped numbers are x = %d, y = %d.",a,b);
}
