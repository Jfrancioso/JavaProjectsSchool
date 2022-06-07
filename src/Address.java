import java.util.Scanner;

/*
Summary Info: The program will ask 3 seperate outputs from the user that will be displayed each underneath
eachother. First will be full name, Second will be street address and
the third and final will be city, state, and zip. After all questions have been answered,
it will look like the following example below:
Joe Snuffy
123 Lane Avenue
Candy hts, Ohio, 44123 
Programmer: Francioso, Joseph
Date due:09/22/2016
Date completed:09/22/2016
*/

public class Address {
public static void main(String[] args){	

	String fullName;

//Create scanner to obtain user input
Scanner scanner1 = new Scanner(System.in);

//obtain user input
System.out.print("Enter your Full Name: ");
fullName = scanner1.nextLine();

	String streetName;

//obtain user input
System.out.print("Enter your Street address: ");
streetName = scanner1.nextLine();

	String cityStateZip;

//obtain user input
System.out.print("Enter your city, state, and zip: ");
cityStateZip = scanner1.nextLine();

//output information
System.out.print( fullName + '\n' + streetName + '\n' + cityStateZip );
}
}