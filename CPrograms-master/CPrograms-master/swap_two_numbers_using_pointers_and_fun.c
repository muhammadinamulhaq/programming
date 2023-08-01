// Program for swapping two numbers using pointers and functions.
#include<stdio.h>
#include<conio.h>

void swap(int*,int*);

int main()
{
int a,b;

printf("Enter Two numbers a and b resp. (They will be swapped): \na = ");

scanf("%d",&a);

printf("\nb = ");

scanf("%d",&b);

swap(&a,&b);

printf("Swapped Numbers are a=%d,b=%d",a,b);

return 0;
}

void swap(int *x,int *y)
{
int t;

t=*x;

*x=*y;

*y=t;
}
