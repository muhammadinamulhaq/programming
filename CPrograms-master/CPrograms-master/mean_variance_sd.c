#include<stdio.h>
#include<math.h>

int main()
{

int i,n;
float a[100],sum=0,mean;
float std,var=0;

printf("Enter the count of numbers for mean, variance, standard deviation : ");
scanf("%d",&n);
printf("Enter values to find mean, standard deviation and variance : ");

for(i=0;i<n;i++)
{
    scanf("%f",&a[i]);
}

for(i=0;i<n;i++)
{
    sum=sum+a[i];
}

mean=sum/n;

printf("Mean is : %f",mean);

for(i=0;i<n;i++)
{
    var+=(a[i]-mean)*(a[i]-mean);
}

var/=n;

printf("\nVariance is : %f",var);

std=sqrt(var);

printf("\nStandard Deviation is : %f",std);

return 0;
}
