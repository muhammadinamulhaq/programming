#include<stdio.h>

int main()
{
int i,n;
float a[100],mean,sum=0;

printf("Enter the number of students (100 max.): ");
scanf("%d",&n);
printf("Enter marks of the students of %d students : ",n);

for(i=0;i<n;i++)
{
    scanf("%f",&a[i]);
}

for(i=0;i<n;i++)
{
    sum=sum+a[i];
}

mean=sum/n;
printf("Mean is %f\n",mean);
printf("Marks above mean are : ");

for(i=0;i<n;i++)
{
    if(a[i]>mean){
        printf("%f\t",a[i]);
    }
}

return 0;
}
