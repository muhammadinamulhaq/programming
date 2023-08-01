#include<stdio.h>
#include<math.h>
#define pi 3.14

int main()
{
float r,ans;

printf("Enter radius to find area of circle : ");
scanf("%f",&r);
ans = pi*r*r;
printf("%f",ans);

return 0;
}
