#include <stdio.h>
#include <math.h>
#include <string.h>
    int main() {

/*
char name[10];
printf("What is your name: ");
scanf("%9s", &name);
printf("Hello, %s", name);
*/
/*

int t;
for (t = 0; t <= 100; t+= 3 ) {
    printf("%d\n", t);
} 



int u;
for ( u = 0; u <= 100; u++) {
    if (u % 2 == 0){
        printf("%d\n", u);


    }
}

int a;
for ( a = 1; a <= 10; a++) {
    if (a == 5){
        break;
        
    }
    printf("%d\n", a);
     }
     
*/
     
     int a;
for ( a = 1; a <= 10; a++) {
    if (a == 5){
        continue;
        
    }
    printf("%d\n", a);
     }
     
     int num = 0;
     while (num <= 10) {
        printf("%d\n", num);
        num +=2;
     }
/*

int thresold_money = 100000;
int thresold_house = 5;
int how_much, real_estate;
printf("How much money do you have?");
scanf("%d", &how_much);
printf("How many house do you have in Kotekli?");
scanf("%d", &real_estate);
if (how_much > thresold_money && real_estate > thresold_house) {
    printf("You don't have to work all day long.");

}
else {
    printf("You have to work all day long.");
}



int horse_power;
printf("How many do you  have horse?");
scanf("%d", &horse_power);
if (horse_power >= 60 && horse_power < 75) {
    printf("Your horses have 200000 hoursepower.\n");
} else if (horse_power >= 75 && horse_power < 90) {
    printf("Your horses have 350000 hoursepower.\n");
} else if (horse_power >= 90 && horse_power < 110) {
    printf("Your horses have 1200000 hoursepower.\n");
} else if (horse_power >= 110 && horse_power < 200) {
    printf("Your horses have 1800000 hoursepower.\n");
} else if (horse_power >= 200) {
    printf("Your horses have  2000000 hoursepower.\n");
} else{ 
    printf("You should buy horse.");

}
*/


/*
char *students[] = {"Alice", "Bob", "Charlie"};
    int scores[] = {90, 85, 92};
    int num_students = sizeof(students) / sizeof(students[0]);
    for (int i = 0; i < num_students; i++) {
        printf("Student: %s, Score: %d\n", students[i], scores[i]);
    }
    

    
    int number1 = 1, number2;

    while (number1 <= 5) {
        number2 = 1;
        while (number2 <= 5) {
            printf("%d x %d = %d\t", number1, number2, number1 * number2);
            number2++;
        }
        printf("\n");
        number1++;
    }

*/


  return 0;

}