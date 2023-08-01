#include<stdio.h>
int main()
{
int i=1,x;

while(i<=5)
{
printf("Enter a number: \n");
scanf("%d",&x);
if(x>5){
    break;
}
i++;
}

i==6?printf("ends normally"):printf("applied break");

return 0;

}
