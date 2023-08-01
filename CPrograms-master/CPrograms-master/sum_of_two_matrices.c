#include<stdio.h>

int main()
{
int i,j,a[3][3],b[3][3],c[3][3];

printf("It's A program to check sum of two Matrices\n");
printf("Enter Matrix A : \n");

for(i=0;i<=2;i++)
{
    for(j=0;j<=2;j++){
        scanf("%d",&a[i][j]);
    }
}

printf("Enter Matrix B : \n");

for(i=0;i<=2;i++)
{
    for(j=0;j<=2;j++){
        scanf("%d",&b[i][j]);
    }
}

for(i=0;i<=2;i++)
{
    for(j=0;j<=2;j++){
        c[i][j]=a[i][j]+b[i][j];
    }
}

for(i=0;i<=2;i++)
{
    for(j=0;j<=2;j++){
        printf("%d ",c[i][j]);
    }
    printf("\n");
}

return 0;
}
