#include<stdio.h>


int main(void)
{
int i,n;

printf("Enter a number for which you want to print the multiplication table till 10 : ");
scanf("%d",&n);

for(i=1;i<=10;i++){
    printf("%d * %d = %d\n",n,i,n*i);
}

return 0;
}
