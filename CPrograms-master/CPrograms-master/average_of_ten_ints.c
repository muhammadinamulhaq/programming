#include<stdio.h>
#include<conio.h>

int main()
{
int c=0,a[10];

printf("Enter 10 Numbers to find average : ");

for(int i = 0; i <= 9; i++){
scanf("%d",&a[i]);
}
for(int j = 0; j <= 9; j++){
    c=(c+a[j]);
}
c = c/10;

printf("Average is %d",c);

return 0;
}
