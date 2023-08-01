#include<stdio.h>
#include<conio.h>

int main()
{
int i;

char s[3][20];

for(i = 0; i < 3; i++){
    gets(s[i]);
}

for(i = 0; i < 3; i++){
    puts(s[i]);
}

return 0;
}
