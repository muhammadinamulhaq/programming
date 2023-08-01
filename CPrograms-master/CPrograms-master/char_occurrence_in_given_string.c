#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>

int main()
{
int count=0,i;
char a[20],n;

printf("Enter a string : ");
gets(a);
strcpy(a,strlwr(a));
printf("Enter a character that you want to check the occurrence : ");
scanf("%c",&n);

for(i=0;a[i]!='\0';i++)
{
    if(a[i]==n)
    {
        count+=1;
    }
}

printf("\n'%c' occur %d times in the given string",n,count);

return 0;
}
