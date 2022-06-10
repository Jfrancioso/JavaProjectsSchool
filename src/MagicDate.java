/*
Summary Info: Prompt the user to enter a month, and a day all in numeric form and then a two-digit year.
(three prompts to the user) Then the program will determine whether the month times the day equals the year,
if true, it will output a message stating that the date is magic, if false it will output stating the date
is not magic.
Programmer:Francioso, Joseph
DATE DUE: 10/20/2016
DATE COMPLETED: 10/20/2016
*/

import java.util.Scanner;
public class MagicDate {
public static void main(String[] args){

Scanner scanner1 = new Scanner(System.in);

int month, day, year;

//obtain user input
System.out.print("Enter a month in numeric form: ");
month = scanner1.nextInt();

//obtain user input
System.out.print("Enter a day in numeric form: ");
day = scanner1.nextInt();

//obtain user input
System.out.print("Enter a 2 digit-year: ");
year = scanner1.nextInt();
      
	if((month * day) == year)
	{
	System.out.println("The date is magic!");
	}
	else
	{
	System.out.println("The date is not magic!");
	}

    }

}
