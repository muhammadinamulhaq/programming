#include<stdio.h>
#include<stdbool.h>
int main()
{
int n;
bool A[2];
A[0] = true;
A[1] = false;
scanf("%d", &n);
printf("%d", A[n%2]);
return 0;
}
