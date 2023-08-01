#include<stdio.h>

void ctn(); // Character to Number in ASCII
void ntc(); // Number to Character in ASCII

int main(){
int i;

printf("Select a choice by entering a number \n1. Character to Number\n2. Number to Character");

scanf("%d",&i);

if(i == 1){
    ctn();
}else if(i == 2){
    ntc();
}

return 0;
}


void ctn(){
char c;

scanf("%c",&c);

}

void ntc(){
int c;

printf("Enter a number to know its ASCII equivalent in character : ");

scanf("%d",&c);

printf("%c",c);
}
