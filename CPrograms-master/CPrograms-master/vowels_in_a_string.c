#include<stdio.h>
#include<stdlib.h>

int main()
{
int i,count=0;
char a[20],n[6]={'a','e','i','o','u'};

printf("Enter the string : ");
gets(a);
strcpy(a,strlwr(a));

for(i=0;a[i]!='\0';i++)
{
    if(a[i]==n[0])
        count+=1;
    if(a[i]==n[1])
        count+=1;
    if(a[i]==n[2])
        count+=1;
    if(a[i]==n[3])
        count+=1;
    if(a[i]==n[4])
        count+=1;
    if(a[i]==n[5])
        count+=1;
}

printf("There are %d vowels in %s string",count,a);

return 0;
}

