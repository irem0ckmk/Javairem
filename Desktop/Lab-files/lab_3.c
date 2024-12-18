#include <stdio.h>

int factorialFor(int number);
int factorialWhile(int number);
int factorialRecursive(int number);

int factorial(int number);
/*

int main(){
    int factorial_5 = factorial(5);
    
    printf("Factorial %d\n", factorial_5);
    
    return 0;
}

int factorial(int number){
    if (number < 0){
    return 0;
    }
    if (number == 0){
        return 1;

    }
    int result = 1;
    for (int i = 1; i<= number; i++){
        result = result * i;

    }
    return result; 
}
int factorialFor(int number);
int factorialWhile(int number);
int factorialRecursive(int number);
int main(){
    int factorial_5 = factorialWhile(5);
    printf("Factorial %d/n", factorial_5);
return 0;
}
int factorial(int number){
    if (number < 0){
        return 0;
    }
    if (number == 0){
        return 1;
    }
    int result = 1;
    while(number > 0){
        result = number * result;
        number -1;
    }
    }
    return result ;

int factorialWhile(int number){
if (number < 0){
        return 0;
    }
    if (number == 0){
        return 1;
    }
    int result = 0;
    for (int i = 1 ; i <= number; i++){
        result = result * i;
    }
    return result ;
}


 //base case
 int factorialRecursive(int number){
 if (number == 1 || number == 0);
 return 1;
 }
int factarialRecursive(int number){
    if (number == 1){
        return 1;
    }
    return number * factorialRecursive(number - 1);

}

int fibonacci(int number){
    
    
    int first = 1, second = 1, result = 0;
    if (number == 1 || number == 2) {
    
        return 1;
    }
    
    for (int i = 2; i < number; i++){
        result = first + second;
        first = second;
        second = result;
    }
    
    return result; 

}
*/
int fibonacciRecursive(int number){
    //base case
    if (number == 1 || number == 2){

    }
    return fibonacciRecursive(number -1) + fibonacciRecursive(number -2);
}


