#include<stdio.h>
#include<conio.h>

struct date{
int d,m,y;
};

int main()
{
struct date today;

today.d=2;
today.m=11;
today.y=2020;

printf("Today's date is %d/%d/%d",today);

getch();

return 0;
}
