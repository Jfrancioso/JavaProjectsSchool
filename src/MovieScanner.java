import java.util.Scanner;
import java.io.File;
import java.lang.*;

public class MovieScanner {
   public static void main(String[] args) {
   
      // Create scanner object to read input from the user
      Scanner input = new Scanner(System.in);
      
      // Ask user to enter a word
      System.out.println("Please enter the word you are looking for: ");
      
      // Store the inputted word in a variable called inputWord
      String inputWord = input.nextLine();
      
      // Print out the word score
      System.out.println(wordScore(inputWord));
      
      // Ask user to enter text from a movie review
      System.out.println("\nPlease enter a one-line movie review: ");
      
      // Store the review in a variable called review
      String review = input.nextLine();

      // Declare and initialize an array which stores each word from the review as an element of the array by utilizing the split method on the review string
      String[] words = review.split(" ");
      
      // Declare and initialize variables to keep track of
      // Count variable keeps track of number of times the word appears in the file
      double count = 0;
      
      // Score variable keeps track of number associated with the line that the word appears in
      double score = 0;
      
      // Total variable used to sum up the scores
      double total = 0;
      
      // Average variable
      double average = 0;
      
      // Loop through words array and initialize each element to a word from the review
      for (int i=0; i<words.length; i++) {
         
         // Increment count
         count++;
         
         // Calculate the score of the word in question by invoking the wordScore method
         score = wordScore(words[i]);
         
         // Add the score to the total
         total += score;
      }
      
      // Calculate the average by dividing the total by the count
      average = (int)(total / count * 100) / 100.0;
      
      // Print out the average score of the scores
      System.out.println("\nThe average of the average scores is " + average);
   }
   
   // Method used to determine the score of a word
   public static double wordScore(String word) {
   
      // Declare and initialize variables to keep track of
      // Count variable keeps track of the number of times that the word appears in the file
      int count = 0;
      
      // Total variable keeps track of the total numeric score (sum of the numbers appearing at the beginning of each line that contains the word)
      double total = 0;
      
      // Score variable will be used to calculate average 
      double score = 0;
      
      // Create new file object to represent the file we are reading from
      File file = new File("/JavaStuff/Java Class/JavaProjectsSchool/src/movieReviews.txt");
      
      try {
         // Create scanner object to read info from the text file
         Scanner fInput = new Scanner(file);
       
         // Loop through and process the file
         while (fInput.hasNextLine()) {
            // Get the next line from the file
            String line = fInput.nextLine();
                        
            // If the line in question contains the word, do the following:
            if (line.contains(word)) {
               
               // Increment count by one
               count++;
               
               // Convert the first character in the line to a numeric value and add to the total
               total += Integer.parseInt(line.substring(0,1));
            }
         }
         
         // Calculate score by dividing total occurrences of the word by the count
         score = (int)(total / count * 100) / 100.0;
         
      // Leave this section unmodified (used for exception handling)
      } catch(Exception e) { }
      
      // Print the number of times the word appears
         System.out.println("The word \"" + word + "\" appears " + count + " times" + "\nThe average score is " + score);
      
      // Return the value stored in score
      return score;
   }
}

