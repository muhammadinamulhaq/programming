#include<stdio.h>

int main()
{
int i,num;

scanf("%d",&num);
i=2;

while(i <=num - 1)
{
  if(num%i==0)
   {
       printf("Not Prime");
       break;
    }
  i++;
}

if(i==num){
  printf("Prime");
}

return 0;

}
