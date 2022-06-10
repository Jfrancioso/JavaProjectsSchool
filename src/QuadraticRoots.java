/*
Summary info: The program will prompt the user to enter for a,b,c of the 
quadratic equation. It will then output results based on the discriminant.
If discriminant is positive, it will display two roots. If negative, it will display
"The equation has no real roots". If it is 0, display one root.
Programmer name: Francioso, Joseph
Date due: 11/17/2016
Due Date: 11/17/2016
*/



import java.util.Scanner;
public class QuadraticRoots
{
    public static void main(String[] args) 
      {
        double a, b, c;
        double root1, root2, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a:");
        a = s.nextDouble();
        System.out.print("Enter b:");
        b = s.nextDouble();
        System.out.print("Enter c:");
        c = s.nextDouble();
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            System.out.println("Roots are real and unequal");
            root1 = ( - b + Math.sqrt(d))/(2*a);
            root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else if(d == 0)
        {
            System.out.println("Roots are real and equal");
            root1 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("Root:"+root1);
        }
        else
        {
            System.out.println("The equation has no real roots");
        }
    }
}