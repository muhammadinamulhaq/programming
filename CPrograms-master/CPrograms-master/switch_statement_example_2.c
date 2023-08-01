#include<stdio.h>
#include<math.h>
#include<conio.h>
#include<stdlib.h>

int main()
{

int choice;
double a,x,b,y;
double c;

while(1)
{
    printf("\n\nGiven Three Equations\n");
    printf("1. (ax+b)/(ax-b) \n2. 2.5logx-cos30+(x^2-y^2)+sqrt(2xy) \n3. x^5+10x^4+8x^3+4x+2 \n4. Exit\n");
    printf("\nEnter values of a,b,x,y respectively : ");
    scanf("%lf%lf%lf%lf",&a,&b,&x,&y);
    printf("Choose an equation from the above three equations : ");
    scanf("%d",&choice);

switch(choice)
{
    case 1:
        c=((a*x+b)/(a*x-b));
        printf("Answer is %lf",c);
        break;

    case 2:
        c=(2.5*(log(x))-cos(30)+(x*x-y*y)+sqrt(2*x*y));
        printf("Answer is %lf",c);
        break;

    case 3:
        c=(pow(x,5))+(10*(pow(x,4)))+(8*(pow(x,3)))+(4*(x))+2;
        printf("Answer is %lf",c);
        break;

    case 4: exit(0);

    default: printf("Invalid Choice");
}
}

return 0;

}
