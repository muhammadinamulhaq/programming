/* Checking three digit armstrong number*/
#include <stdio.h>
#include <math.h>
int main()
{
	int n,rem,n1,sum=0;
	printf("\nEnter the three digit number (100 to 999):");
	scanf("%d",&n);
	n1=n;
	
	do{
		rem=n%10;
		sum=sum+pow(rem,3);
		n=n/10;
	}
	while(n!=0);
	
	if(sum==n1)
	{
		printf("\nThe number is a armstrong number");
	}
	else
		printf("\nThe number is not a armstrong number");
	return 0;
}