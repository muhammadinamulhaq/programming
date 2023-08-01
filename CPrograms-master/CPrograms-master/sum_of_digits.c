#include<stdio.h>
#include<conio.h>

int main()
{
int i, num, last_digit, sum=0;

printf("Enter a number : ");

scanf("%d",&num);

while(num!=0)
{
    last_digit=num%10;
    sum=sum+last_digit;
    num=num/10;
}

printf("Sum of digits is %d",sum);

return 0;
}
