/* BINARY QUERIES */

#include <stdio.h>
int main()
{
    unsigned long int N,Q,i,j,X,L,R;
    scanf("%lu%lu",&N,&Q);
    int A[N+1],k;
    for(i=1;i<N+1;i++)
    {
        scanf("%d",&A[i]);
    }
    while(Q--)
    {
        scanf("%d",&k);
        if(k==1)
        {
            scanf("%lu",&X);
            A[X] = !A[X];
        }
        else
        {
            scanf("%lu%lu",&L,&R);
            if(A[R]==1)
                printf("ODD\n");
            else
                printf("EVEN\n");
        }
    }
    return 0;
}
