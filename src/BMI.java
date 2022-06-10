/*
Summary info: This program will be calculate the BMI(Body mass index) for 20years or older.
Program will prompt the user to enter the weight in pounds and height in inches and displays
the BMI. Weight and height are non-integers, real numbers.
Programmer: Joseph Francioso
Due date: 11/22/2016
Date completed: 11/22/2016
*/
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
public class BMI{
public static void main(String[] args){

NumberFormat formatter = new DecimalFormat("#0.0000"); 
Scanner scanner1 = new Scanner(System.in);

System.out.println("Enter your weight in pounds: ");
double weight = scanner1.nextDouble();

System.out.println("Enter your height in inches: ");
double height = scanner1.nextDouble();

double cW = weight * 0.45359237;
double cH = height * 0.0254;
double bodyMassIndex = cW/Math.pow(cH,2);

System.out.println("Your Body Mass Index is"+" "+formatter.format(bodyMassIndex)+".");
	if(bodyMassIndex < 18.5) {
	
	System.out.println("According to the BMI scale you are UNDERWEIGHT.");

} else if(bodyMassIndex <= 24.8 && bodyMassIndex >= 18.5 ) {
	
	System.out.println("According to the BMI scale you are NORMAL.");

} else if(bodyMassIndex <= 29.9 && bodyMassIndex >= 25.0 ) {
	
	System.out.println("According to the BMI scale you are OVERWEIGHT.");

} else if(bodyMassIndex >= 30.0) {
	
	System.out.println("According to the BMI scale you are OBESE.");
		}
	}
}