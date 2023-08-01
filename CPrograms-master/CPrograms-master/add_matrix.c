/* Adding matrix of any order */
#include <stdio.h>
int main()
{
    int A[20][20],B[20][20],C[20][20];
    int m,n,i,j;
    printf("Enter number of rows: ");
    scanf("%d",&m);
    printf("\nEnter number of columns: ");
    scanf("%d",&n);
    printf("\nEnter elements for A matrix: ");
    for(i=0;i<m;i++)
    {
        printf("\nEnter %d row elements: \n",i+1);
        for(j=0;j<n;j++)
        {
            scanf("\n%d",&A[i][j]);
        }
    }

    printf("\nEnter elements for B matrix: ");
    for(i=0;i<m;i++)
    {
        printf("\nEnter %d row elements: \n",i+1);
        for(j=0;j<n;j++)
        {
            scanf("\n%d",&B[i][j]);
        }
    }

    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            C[i][j]=A[i][j]+B[i][j];
        }
    }

    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("Element at (%d,%d) is: ",i+1,j+1);
            printf("%d",C[i][j]);
            printf("\n");
        }
    }
    return 0;
}
