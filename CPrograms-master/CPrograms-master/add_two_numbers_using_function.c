#include<stdio.h>

int add(int,int);

int main()
{
int x,y;

printf("Enter two numbers for addition : ");
scanf("%d%d",&x,&y);

add(x,y);

return 0;
}

int add(int a,int b)
{
int c;

c=a+b;

printf("Sum is %d",c);

return c;
}
