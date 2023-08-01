#include<stdio.h>

int main()
{
long long num;
int count=0;

printf("Enter any number : ");
scanf("%lld",&num);

while(num>0){
    num /= 10;
    count++;
}

printf("%d",count);

return 0;
}
