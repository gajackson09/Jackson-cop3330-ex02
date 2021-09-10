/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program prompts for an input string and displays output that shows the input string and the number of characters the string contains
import java.util.Scanner;
public class ex02{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
        //asks user for an input string
        System.out.print("What is the input string? ");
        String inputstring = input.nextLine();
        int count = 0;

       //a loop that counts the total number of characters - excluding spaces 
        for(int i = 0; i < inputstring.length(); i++) {
            if(inputstring.charAt(i) != ' ')
            count++;
        }//end of for loop
       
        //printing output 
        System.out.println("\n"+inputstring+" has "+count+" chatacters.");
      
   }//end of main
}//end of class