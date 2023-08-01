#include<stdio.h>
#include<conio.h>

int main()
{
int x=4,y;

char c;

printf("%d\n",x);

printf("%d\n%d\n",&x,&y);

x=sizeof(0);

printf("%d",x);

return 0;
}
