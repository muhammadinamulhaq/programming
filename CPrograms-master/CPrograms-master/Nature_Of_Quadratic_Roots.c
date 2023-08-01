#include<stdio.h>
int main()
{
int a,b,c,D;

printf("Enter coefficients of the quadratic equation to check whether roots are real or imaginary.\n");

printf("\nCoefficient of x^2 = ");
scanf("%d",&a);

printf("\nCoefficient of x = ");
scanf("%d",&b);

printf("\nConstant = ");
scanf("%d",&c);

D=(b*b)-(4*a*c);

if(D>=0)
{
  if(D=0){
    printf("Roots are Real and Equal");
    }
  else{
    printf("Roots are Real and Unequal");
  }
}

if(D<0){
  printf("Roots are Imaginary");
}

return 0;
}
