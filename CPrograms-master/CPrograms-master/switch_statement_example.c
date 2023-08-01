#include<stdio.h>

int main()
{
int choice,a,b,s;

printf("1. Addition \n2. Odd-Even \n3. Print n natural numbers \n");
printf("Choose your choice : ");
scanf("%d",&choice);

switch(choice)
{
case 1:
    printf("Enter two numbers for addition : ");
    scanf("%d%d",&a,&b);
    printf("Sum is %d",a+b);
    break;

case 2:
    printf("Enter a number : ");
    scanf("%d",&a);
 if(a%2==0)
    printf("Entered number is even");
 else
    printf("Entered number is odd");
    break;

case 3:
    printf("Enter a number : ");
    scanf("%d",&a);
    for(b=1;b<=a;b++)
        printf(" %d",b);
    break;
default:
    printf("Invalid Choice");
}

return 0;

}
