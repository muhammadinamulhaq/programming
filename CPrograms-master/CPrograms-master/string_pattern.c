#include<stdio.h>
#include<conio.h>
int main()
{
int i;

char c[20];

scanf("%s",&c);

for(i = 0; c[i] != '\0'; i++){
printf(&c[i]);
printf("\n");
}

return 0;
}
