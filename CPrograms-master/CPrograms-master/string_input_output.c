#include<stdio.h>
#include<conio.h>
int main()
{
int i;
char s[3][20];
printf("Enter three names : ");

for(i = 0; i < 3; i++){
    scanf("%s",&s[i]);
}

for(i = 0; i < 3; i++){
    printf("%s ",&s[i]);
}

return 0;
}
