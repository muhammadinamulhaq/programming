/* Biggest of all */
#include <stdio.h>
#include <stdbool.h>
int main()
{
    int A[100],n,i,x,y,j;
    bool f=false;
    printf("Enter the number of inputs to be taken:");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("Enter the %d value:",i+1);
        scanf("%d",&A[i]);
    }
    A[n]=A[n-1];
    for(i=0;i<n;i++)
    {
        x=A[i];
        for(j=i+1;j<=n;j++)
        {
            y=A[j];
            if(x>=y)
            {
                f=true;
                j++;
            }
            else
            {
                f=false;
                break;
            }
        }
        if(f)
        {
            printf("The largest of all is %d",A[i]);
            break;
        }
    }
    return 0;
}
