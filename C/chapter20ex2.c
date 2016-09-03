// Example program #2 from Chapter 20 of Absolute Beginner's Guide
// to C. 3rd Ed.
// File chapter20ex2.c

/* This program rolls two dice and presents the total. It then asks
   the user to guess if the next total will be higher, lower, or equal
   It then rolls two more dice and tells the user how they did.*/

#include <stdio.h>
#include <string.h>
#include <time.h>
#include <ctype.h>

int main(void)
{
  int die1, die2;
  int total1, total2;
  time_t t;
  char ans;

  // Remember that this is needed to make sure the random number
  // generated is different

  srand(time(&t));

  // This would give you a number between 0 and 5, so the + 1
  // makes it 1 to 6

  die1 = (rand() % 5) + 1;
  die2 = (rand() % 5) + 1;
  total1 = dice1 + dice2;
  printf("First roll of the dice was %d and %d, " die1, die2);
  
