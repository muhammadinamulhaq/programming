#include<stdio.h>

int main()
{
int x,y;
printf("Enter Two Numbers\n");
scanf("%d%d",&x,&y);

if(x>y)
{
    printf("Difference of %d and %d is %d",x,y,x-y);
}

else if(y>x)
{
    printf("Difference of %d and %d is %d",y,x,y-x);
}

return 0;
}
