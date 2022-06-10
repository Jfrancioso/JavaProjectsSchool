/*
Summary info: The program will prompt the user to enter the projected amount of total sales and then it will ask
to enter a profit margin as a percent, after it will output the projected total sales and then the profit margin
followed by the estimated gross profit of the two. Finally it will output 15% as a tax rate, the amount of tax paid,
and the estimated net profit that will be made from the sales amount.
Programmer: Francioso, Joseph
Date due: 13OCT2016
Date finished: 13OCT2016
*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class ProfitProjection
{
public static void main(String[] args)
{

//Create scanner to obtain scanner input
Scanner scanner1 = new Scanner(System.in);
NumberFormat formatter = new DecimalFormat("#0.00"); 

//obtain user input
System.out.print("Enter the projected amount of total sales: ");
double aTotal = scanner1.nextDouble();

//obtain user input
System.out.print("Enter the Profit margin as a percent: ");
double bMargin = scanner1.nextDouble();

//multiply the projected amount of total sales with the profit margin, tax paid using 15% tax rate, and net profit
double bTotalAmounts = bMargin / 100;
double aTotalAmounts = aTotal * bTotalAmounts;
double taxPaid = aTotalAmounts * 0.15;
double netProfit = aTotalAmounts - taxPaid;

System.out.println("Projected total sales: $" + formatter.format(aTotal) + "\n" + "Profit margin: " + formatter.format(bMargin) + "%\n" + "Estimated gross profit: $" + formatter.format(aTotalAmounts) + "\nTax rate: 15%\nAmount of tax paid: $" + formatter.format(taxPaid) + "\nEstimated net profit: $" + formatter.format(netProfit));

    }
}