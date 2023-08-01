#include<stdio.h>
#include<conio.h>

int main()
{

long long n,last,first;

printf("Enter a number to print its first and last digit : ");
scanf("%lld",&n);

last = n % 10;

first=n;

while(first>=10)
{
    first/=10;
}

printf("First Digit : %lld\nLast Digit : %lld",first,last);

return 0;
}
