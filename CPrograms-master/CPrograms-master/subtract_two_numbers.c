#include<stdio.h>

int sub(int,int);

int main()
{
int x,y,i;

printf("Enter two numbers : ");
scanf("%d%d",&x,&y);

if(x>y){
i = sub(x,y);
}else{
i = sub(y,x);
}

printf("%d",i);

return 0;
}

int sub(int a, int b)
{
int c;
c=a-b;
return c;
}
