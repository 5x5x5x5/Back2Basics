/* Example program form the Absolute Beginner's Guide to C, 3rd ed.
File name: variables.*/

/* This sample program lists three kids and their school supply needs,
as well as the cost to buy said supplies.*/

#include <stdio.h>

int main(void)
{
	// Set up the variables, as well as define a few

	char firstInitial, middleInitial;
	int number_of_pencils;
	int number_of_notebooks;
	float pencils = 0.23;
	float notebooks = 2.89;
	float lunchbox = 4.99;

	// The information on the first student
	firstInitial = 'J';
	middleInitial = 'R';

	number_of_pencils = 7;
	number_of_notebooks = 4;

	printf("%c%c needs %d pencils, %d notebooks, and 1 lunchbox\n",
		firstInitial, middleInitial, number_of_pencils,
		number_of_notebooks);
	printf("The total cost is $%.2f\n\n", number_of_pencils*pencils
		+ number_of_notebooks*notebooks + lunchbox);

	// Info for second student
	firstInitial = 'A';
	middleInitial = 'J';

	number_of_pencils = 10;
	number_of_notebooks = 3;

	printf("%c%c needs %d pencils, %d notebooks, and 1 lunchbox\n",
		firstInitial, middleInitial, number_of_pencils,
		number_of_notebooks);
	printf("The total cost is %.2f\n\n", number_of_pencils*pencils
		+ number_of_notebooks*notebooks + lunchbox);

	// Info for second student
        firstInitial = 'M';
        middleInitial = 'J';

        number_of_pencils = 9;
        number_of_notebooks = 2;

        printf("%c%c needs %d pencils, %d notebooks, and 1 lunchbox\n",
                firstInitial, middleInitial, number_of_pencils,
                number_of_notebooks);
        printf("The total cost is %.2f\n\n", number_of_pencils*pencils
                + number_of_notebooks*notebooks + lunchbox);

	return 0;
}
