/* Absolut Beginner's Guide to C, 3rd Ed.
 Chapter 4 Example 2--Chapter4ex1.c */
#include <stdio.h>

int main(void)
{
	/* Here is some more code to practice printf(), Escape
	 Sequences, and Conversion Characters */
	printf("Quamtity\tCost\tTotal\n");
	printf("%d\t\t$%.2f\t$%.2f\n", 3, 9.99, 29.97);
	printf("Too many spaces          \b\b\b\b\b\b\b\b\b can be fixed ");
	printf("with the \\%c Escape character\n", 'b');
	printf("\n\a\n\a\n\a\nSkip a few lines and beep ");
	printf("a few beeps.\n");
	printf("%s %c.", "You are kicking butt learning", 'C');
	printf("\n You just finished chapter %d. \nYou have finished ", 4);
	printf("%.1f%c of the book.\n", 12.500, '%');
	printf("\n\nOne third equals %.2f or ", 0.333333);
	printf("%.3f or %.4f or ", 0.333333, 0.333333);
	printf("%.5f or %.6f\n\n\n", 0.33333, 0.3333333);

	return 0;
}
