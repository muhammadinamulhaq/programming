#include<stdio.h>
int main()
{
    int i;
long long int n,
        rev=0;

scanf("%lli",&n);

for(i=1;n!=0;i++)
{
    rev=rev*10+(n%10);
    n=n/10;
}

printf("%lli",rev);
return 0;
}
