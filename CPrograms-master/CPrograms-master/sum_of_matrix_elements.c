#include<stdio.h>

int main(void)
{
int i,j,a[3][3],sum=0;

printf("Enter an matrix of size 3 X 3 : ");

for(i=0;i<=2;i++){
    for(j=0;j<=2;j++)
    {
        scanf("%d",&a[i][j]);
    }
}

for(i=0;i<=2;i++)
{
    for(j=0;j<=2;j++)
    {
        sum=sum+a[i][j];
    }
}

printf("Sum of array elements is %d.",sum);

return 0;
}
