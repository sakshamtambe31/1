#include<stdio.h>
int main(){
	int a=3,b=16,c=9;
	if(a>b&&a>c){
		printf("%d is the greatest number",a);
	}
	else if(b>a&&b>c){
		printf("%d is the greatest number",b);
	}
	else{
		printf("%d is the greatest number",c);
	}
	
}
