package wsu_hacks;

import java.io.*;
import java.util.*;

public class Math_Subroutine {

    public static void main(String[] args) {
        multiplicationTest(2);
        divisionTest();
        additionTest(3);
        subtractionTest(2);
        mainMenu();
    }
    
    private static void mainMenu(){
        
        Scanner k = new Scanner(System.in);
        int intType;
        int intRuns;
        
        System.out.println("Welcome to math mode!");
        System.out.println("Press enter to continue.");
        k.nextLine();
        while(true){
            System.out.println("What would you like to work on?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quit");
            
            try {
                intType = k.nextInt();
                k.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Sorry, that was not a valid number.");
                k.nextLine();
                continue;
            }
            
            if(intType==5){
                System.out.println("Thank you for playing!");
                return;
            }
            
            System.out.println("How many problems would you like to do?");
            
            try {
                intRuns = k.nextInt();
                k.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Sorry, that was not a valid number.");
                k.nextLine();
                continue;
            }
            for(int i=0; i<intRuns; i++){
                switch(intType){
                case 1:
                    additionTest(2);
                    continue;
                case 2:
                    subtractionTest(2);
                    continue;
                case 3:
                    multiplicationTest(2);
                    continue;
                case 4:
                    divisionTest();
                }
            }
        }
    }
    
    private static boolean additionTest(int intDigits){
        
        Random r = new Random();
        Scanner k = new Scanner(System.in);
        
        int intFirst = r.nextInt((int)Math.pow(10, intDigits));
        int intSecond = r.nextInt((int)Math.pow(10, intDigits));
        int intResponce;
        int intAnswer;
        boolean boolCorrect = false;
        
        System.out.println("What is " + intFirst + " plus " + intSecond + "?");
        try {
                intResponce = k.nextInt();
                k.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Sorry, that was not a valid number.");
                k.nextLine();
                intResponce=-1;
                boolCorrect = false;
            }
        
        intAnswer = intFirst + intSecond;
        if(intResponce==intAnswer){
            System.out.println("Yes! Keep up the great work!");
            boolCorrect = true;
        }else{
            System.out.println("Sorry, " + intFirst + " + " + intSecond + " = " + intAnswer + ".");
        }
        
        return boolCorrect;
    }
    
    private static boolean subtractionTest(int intDigits){
        
        Random r = new Random();
        Scanner k = new Scanner(System.in);
        
        int intFirst = r.nextInt((int)Math.pow(10, intDigits+1));
        int intSecond = r.nextInt((int)Math.pow(10, intDigits));
        int intResponce;
        int intAnswer;
        boolean boolCorrect = false;
        
        System.out.println("What is " + intFirst + " minus " + intSecond + "?");
        try {
                intResponce = k.nextInt();
                k.nextLine();
            }catch (InputMismatchException e){
                System.out.println("That was not a valid number.");
                intResponce=-1;
                boolCorrect = false;
            }
        
        
        intAnswer = intFirst - intSecond;
        if(intResponce==intAnswer){
            System.out.println("Yes! Keep up the great work!");
            boolCorrect = true;
        }else{
            System.out.println("Sorry, " + intFirst + " + " + intSecond + " = " + intAnswer + ".");
        }
        
        return boolCorrect;
    }
    
    private static boolean multiplicationTest(int intDigits){
        
        Random r = new Random();
        Scanner k = new Scanner(System.in);
        
        int intFirst = r.nextInt(10);
        int intSecond = r.nextInt((int)Math.pow(10,intDigits));
        int intResponce;
        boolean boolCorrect = false;
        
        System.out.println("What is " + intFirst + " times " + intSecond + "?");
        try {
                intResponce = k.nextInt();
                k.nextLine();
            }catch (InputMismatchException e){
                System.out.println("That was not a valid number.");
                k.nextLine();
                intResponce=-1;
                boolCorrect = false;
            }
        
        if(intResponce==intFirst*intSecond){
            System.out.println("Yes! Keep up the great work!");
            boolCorrect = true;
        }else{
            System.out.println("Sorry, " + intFirst + " * " + intSecond + " = " + intFirst*intSecond + ".");
        }
        
        return boolCorrect;
    }
    
    private static boolean divisionTest(){
        
        Random r = new Random();
        Scanner k = new Scanner(System.in);
        
        int intAnswer = r.nextInt(10);
        int intSecond = r.nextInt(9)+1;
        int intFirst = intAnswer*intSecond;
        int intResponce;
        boolean boolCorrect = false;
        
        System.out.println("What is " + intFirst + " divided by " + intSecond +"?");
        try {
                intResponce = k.nextInt();
                k.nextLine();
            }catch (InputMismatchException e){
                System.out.println("That was not a valid number.");
                k.nextLine();
                intResponce = -1;
                boolCorrect = false;
            }
        
        if(intResponce==intAnswer){
            System.out.println("Yes! Keep up the great work!");
            boolCorrect = true;
        }else{
            System.out.println("Sorry, " + intFirst + " / " + intSecond + " = " + intAnswer + ".");
        }
        
        return boolCorrect;
    }
    
    private static void timedMath(int intType){
        
        int intCorrect = 0;
        int intWrong = 0;
        int intTotal;
        long longTime;
        Scanner k = new Scanner(System.in);
        
        System.out.println("How many problems can you do in a minute?");
        System.out.println("Press enter to begin!");
        k.nextLine();
        longTime = System.currentTimeMillis() + 60000;
        
        while(longTime>System.currentTimeMillis()){
            switch(intType){
                case 1:
                    if(additionTest(3)){
                        intCorrect += 1;
                    }else{
                        intWrong +=1;
                    }
                    break;
                case 2:
                    if(subtractionTest(3)){
                        intCorrect += 1;
                    }else{
                        intWrong +=1;
                    }
                    break;
                case 3:
                    if(multiplicationTest(2)){
                        intCorrect += 1;
                    }else{
                        intWrong +=1;
                    }
                    break;
                case 4:
                    if(divisionTest()){
                        intCorrect += 1;
                    }else{
                        intWrong +=1;
                    }
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("Time is up!");
        intTotal = intCorrect + intWrong;
        System.out.println("You answered " + intTotal + " questions!");
        System.out.println("You got " + intCorrect + " questions right!");
        System.out.println("Can you do better?");
        System.out.println("Press enter to continue.");
        k.nextLine();
    }
}
