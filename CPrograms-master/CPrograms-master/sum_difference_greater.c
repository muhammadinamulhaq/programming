#include<stdio.h>
#include<math.h>

int main()
{
int a[100],i,sum1=0,sum2=0,n,diff;

printf("Enter the number of values : ");
scanf("%d",&n);
printf("Enter the numbers : ");

for(i=0;i<n;i++)
{
    scanf("%d",&a[i]);
}

for(i=0;i<n;i++)
{
    if(a[i]>0){
    sum1=sum1+a[i];
    }else{
    sum2=sum2+a[i];
    }
}

printf("\n\nSum of positive numbers is %d\n\nSum of Negative numbers is %d\n",sum1,sum2);

if(sum1>abs(sum2)){
    diff=sum1-abs(sum2);
}else{
    diff=abs(sum2)-sum1;
}
printf("\nDifference of the sums is %d\n",diff);

if(sum1>abs(sum2)){
    printf("\nGreater sum in magnitude is %d",sum1);
}else{
    printf("\nGreater sum in mag. is %d",abs(sum2));
}

return 0;
}
