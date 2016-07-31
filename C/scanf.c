/* scanf practice from The Absolute Beginner's Guide to C, 3rd ed.
   File name: scanf.c
*/

/* This is a simple program that asks users for some basic data and
prints it on screen in order to show what was entered.*/

#include <stdio.h>

int main(void)
{
// Set up the variable that scanf will fill

	char firstInitial;
	char lastInitial;
	int age;
	int favorite_number;

	printf("What letter does your name begin with?\n");
	scanf(" %c", &firstInitial);

	printf("What letter does your last name begin with?\n");
	scanf(" %c", &lastInitial);

	printf("How old is your leg?\n");
	scanf(" %d", &age);

	printf("What is your favorite color (integer value only)?\n");
	scanf(" %d", &favorite_number);

	printf("\nAm I supposed to believe that your intitials are %c.%c. and your leg is %d years old?", firstInitial, lastInitial, age);
	printf("\nAnd furthermore, you claim that the integer value of your favorite color is %d!\n", favorite_number);
	printf("\n\nPreposteros!\n");

	return 0;
}
