#include<stdio.h>

// Declaration of functions Greatest Common Divisor, Tower of Hanoi Problem, Fibonacci Series and Factorial of a number
int GCD(int, int);

void toh(int, char, char, char);

int fib(int);

int fact(int);

int main()
{

int a,b,n,i,x;

char A='a',
     B='b',
     C='c';

printf("1. Tower Of Hanoi\n 2. Fibonacci \n 3. Factorial \n 4. Greatest Common Divisor \n");

scanf("%d",&i);


if(i==1)

{
    scanf("%d",&n);
    toh(n,A,B,C);
}

if(i==2)

{

    scanf("%d",&n);

for(x=1;x<=n;x++)
    {
        printf("%d ",fib(x));
    }

}

if(i==3)

{
    scanf("%d",&n);
    printf("Factorial of %d is %d",n,fact(n));

}


if(i==4)

{
    scanf("%d%d",&a,&b);
    printf("%d",GCD(a,b));
}


return 0;

}



int fact(int n)
{
     if(n>=1)
     {
          return(n*fact(n-1));
     }
     if(n==0)
     {
          return 1;
     }
}

int fib(int n)
{
     if(n==1)
     {
          return 1;
     }
     if(n==2)
     {
          return 1;
     }
     if(n>=3)
     {
          return(fib(n-1)+fib(n-2));
     }

}


void toh(int n, char BEG, char AUX, char END)
{
     if(n>=1)
     {
          toh(n-1,BEG,END,AUX);
          printf("%c to %c\n",BEG,END);
          toh(n-1,AUX,BEG,END);
     }

}


int GCD(int x,int y)
{
     if(x==y)
     {
          return x;
     }
     else if(x%y==0)
     {
          return y;
     }
     else if(y%x==0)
     {
          return x;
     }
     else if(x>y)
     {
          return(GCD(x%y,y));
     }
     else
     {
          return(GCD(x,y%x));
     }

}
