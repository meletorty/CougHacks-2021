// Author: Vika Crossland
// Date: 4/10/21
// CougHacks 2021 English Program

/* This program is an English questions simulator that provides engaging trivia for students 
   (target age range grades 3-5, but can be tailored for all grades as needed). It focuses on teaching 
   complex/new vocaublary. */
   
import java.util.*;
import java.io.*;
   
public class English {  
   
   // main method where intro will be printed
   public static void main(String[] args) throws IOException{
   
      // welcome student and ask how many rounds of the vocab game they'd like to play
      Scanner input = new Scanner(System.in);
      System.out.print("Welcome! How many rounds would you like to play? ");
      int numRounds = input.nextInt();
      vocabGenerator(numRounds);
      
   } 
   
   // method where words are generated
   public static void vocabGenerator(int numRounds) throws IOException {
   
      // open txt file to read from
      File myFile = new File("vocabWords.txt");
      Scanner scan = new Scanner(myFile);
      
      // separate line by colon and assign "definition" token to to index [1]
      // file has 32 words
      String[] words = new String[32];
      String[] definitions = new String[32];
      
      // loop through each line in the file
      for(int i = 0; i < 32; i++) {
         String line = scan.nextLine();
         String[] tokens = line.split(":");
         
         // assign word and definition to tokens
         words[i] = tokens[0];
         definitions[i] = tokens[1];
      }
   
      // choose random line where the word will print first and the definition after
      for(int j = 0; j < numRounds; j++) {
      
         Random generator = new Random();
         int randomIndex = generator.nextInt(words.length);
         String word = words[randomIndex];         
         System.out.print("\nYour word is... " + word);
         Scanner input = new Scanner(System.in);
         System.out.print(" (enter any key for definition)");
         
         // reveal definition when student is ready
         if(input.hasNext()) {
            System.out.println("\nDefinition: " + definitions[randomIndex] + "\n");
         }
      }
      
      // close scanner
      scan.close();
      // encouraging message to send them off
      System.out.println("\nThanks for playing! You did great!");
   }
}