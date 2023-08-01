#include<stdio.h>
#include<conio.h>

union item{
    int x;
    float y;
    char c;
};

int main()
{
    union item i1;

    i1.x = 5;
    printf("x = %d\n",i1.x);

    i1.y = 3.75;
    printf("y = %f\n",i1.y);

    i1.c='a';
    printf("c = %c",i1.c);

    return 0;
}
