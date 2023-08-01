#include<stdio.h>

int main()
{
int i,sum=0,n;

printf("Enter a number : ");
scanf("%d",&n);

for(i=1;i<=n;i++){
        printf("%d\n",sum);
        sum=sum+i;
}

return 0;
}
