#include<stdio.h>

int main()
{
int BS;     // Basic Salary
float DA,HRA,GS; // 1. Dearness Allowance 2. House Rental Allowance 3. Gross Salary

printf("Enter The Basic Salary to calculate Gross Salary: ");
scanf("%d",&BS);

DA=0.4*BS;  // Calculating Dearness Allowance using Basic Salary
HRA=0.2*BS;  // Calculating House Rental Allowance using Basic Salary
GS=BS+DA+HRA;  // Gross Salary = Basic Salary + Dearness Allowance + House Rental Allowance

printf("\nGross Salary is %f",GS);

return 0;
}
