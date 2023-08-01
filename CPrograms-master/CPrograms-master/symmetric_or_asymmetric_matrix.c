#include"stdio.h"

int main()
{
int i,j,a[3][3], found = 1;

printf("Enter the elements of matrix A (3x3) : ");

for(i=0;i<3;i++){
    for(j=0;j<3;j++){
    scanf("%d",&a[i][j]);
    }
}

for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        if(a[i][j]!=a[j][i]){
            found = 0;
            printf("\nA is not a Symmetric Matrix.");
            break;
    }
}
if(!found) break;
}
if(found) printf("\n\nA is a symmetric matrix");

return 0;
}
