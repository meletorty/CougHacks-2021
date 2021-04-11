// Author: Vika Crossland
// Date: 4/10/21
// CougHacks 2021 History/Geography Program

/* This program is a history/geography question generator. Questions are short answer
   and target grades 3-5. More questions would be added in the real thing and could be tailored
   to the grade level/difficulty desired. */
   
import java.util.*;

public class HistoryGeography {

   // main method 
   public static void main(String[] args) {
   
      // ask various trivia questions
      // if answer is correct, congratulate and move on to next
      // if answer is incorrect, give correct answer and move on to next
      System.out.println("Welcome! Press any key to start... ");
      Scanner scan = new Scanner(System.in);
      scan.nextLine();
      
      System.out.println("How many continents are there? ");
      String input = scan.nextLine();
      
      if(input.equals("7")) {
         System.out.println("Correct! Next question... \n\n");
      } else {
         System.out.println("Nice try, but that's incorrect. The correct answer is 7. \n\n");
      }
      
      System.out.println("Who was the first president? ");
      input = scan.nextLine();
      
      if(input.equals("George Washington") || input.equals("george washington")) {
         System.out.println("Correct! Next question... \n\n");
      } else {
         System.out.println("Not quite... The correct answer is George Washington. \n\n");
      }
      
      System.out.println("Which direction does the equator run? ");
      input = scan.nextLine();      
   
      if(input.equals("East to West") || input.equals("east to west")) {
         System.out.println("Correct! Next question... \n\n");
      } else {
         System.out.println("Good attempt, but the correct answer is east to west. \n\n");
      }
      
      System.out.println("Name one of the three main rock classes: ");
      input = scan.nextLine();      
   
      if(input.equals("sedimentary") || input.equals("metamorphic") || input.equals("igneous")) {
         System.out.println("Correct! Next question... \n\n");
      } else {
         System.out.println("Keep studying... The correct answer was sedimentary, metamorphic, or igneous. \n\n");
      }      
      
      // exit trivia with encouraging words
      System.out.println("Thanks for playing! You'll be a history/geography buff real soon!");
   }
}