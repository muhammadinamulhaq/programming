#include<stdio.h>
#include<conio.h>

int main()
{
int i,num,mult=1;

printf("Enter a number to know it's digits multiplication : ");
scanf("%d",&num);

while(num!=0)
{
mult=mult*(num%10);
num/=10;
}

printf("Multiplication of the digits is %d",mult);

return 0;
}
