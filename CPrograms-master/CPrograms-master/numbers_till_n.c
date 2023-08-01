#include<stdio.h>

int main()
{
int i,j,n;

printf("Enter a number till which you want to print the natural numbers : ");
scanf("%d",&n);

for(i=1;i<=n;i++)
{
    printf("%d\n",i);
}

return 0;
}
