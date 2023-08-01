#include<stdio.h>

int main()
{
int i,j,n;

printf("Enter a number from which you want to print the natural numbers in reverse order : ");
scanf("%d",&n);

for(i=n;i>=1;i--){
    printf("%d",i);
}

return 0;
}
