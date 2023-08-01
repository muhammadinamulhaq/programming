#include<stdio.h>

void toh(int , char[], char[], char[]);

int main(void)
{
int i,n;
char A[4]="BEG",
     B[4]="AUX",
     C[4]="END";
printf("Enter the number of disks : ");
scanf("%d",&n);
toh(n,A,B,C);
return 0;
}

void toh(int n,char BEG[],char AUX[], char END[])
{
if(n>=1)
{
toh(n-1,BEG,END,AUX);
printf("%s to %s\n",BEG,END);
toh(n-1,AUX,BEG,END);
}
}
