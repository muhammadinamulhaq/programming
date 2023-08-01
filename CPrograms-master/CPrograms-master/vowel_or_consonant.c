#include<stdio.h>
int main()
{

char n;

printf("Enter a character ");
scanf("%c",&n);

if((n == 'a') || (n == 'e') || (n == 'i') || (n == 'o') || (n == 'u')){
    printf("\nVowel");
}else{
    printf("\nConsonant");
}
return 0;
}
