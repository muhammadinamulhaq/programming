/* BASIC PAY TOTAL SALARY WITH EMP ID */
#include <stdio.h>
#include <string.h>
int main()
{
    int n,i=0;
    long A[50],B[50];
    char C[50];
    long basic,da,hra;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%s",C);
        scanf("%ld",&A[i]);
        scanf("%ld",&basic);
        scanf("%ld",&da);
        scanf("%ld",&hra);
        B[i]=basic+((da*basic)/100)+hra;
    }
    for(i=0;i<n;i++)
    {
        printf("%ld\n",A[i]);
        printf("%ld\n",B[i]);
    }
    return 0;
}
