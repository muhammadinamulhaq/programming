#include<stdio.h>

int main()
{
int i,a[100],n,k;

printf("Enter the number of values : ");
scanf("%d",&n);
printf("Enter the numbers : ");

for(i=0;i<n;i++)
{
    scanf("%d",&a[i]);
}

printf("Enter the number to be found  : ");
scanf("%d",&k);

for(i=0;i<n;i++)
{
    if(k==a[i]){
        printf("\n\nThe Key is present\n\n");
        printf("The index or position is %d",i);
        break;
    }else{
        printf("\nNot Found");
        break;
    }
}

return 0;
}
