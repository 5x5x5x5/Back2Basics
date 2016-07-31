/* Example program using header file from Chapter 7 of Absolute
 Beginner's Guide to C, 3rd ed.
 File name: headers.c */

/* This is a sample program that lists three kids and their monster
fighting supply needs, as well as cost to buy supplies */

#include <stdio.h>
#include <string.h>
#include "headers.h"

int main(void)
{
	int age;
	char childname[14] = "Thomasina";

	printf("\n%s have %d kids.\n", FAMILY, KIDS);

	age = 11;
	printf("The oldest, %s, is %d.\n", childname, age);

	strcpy(childname, "Christopher");
	age = 6;
	printf("The middle boy, %s, is %d.\n", childname, age);

	age = 3;
	strcpy(childname, "Banjo");
	printf("The youngest, %s, is %d.\n", childname, age);

	return 0;
}
