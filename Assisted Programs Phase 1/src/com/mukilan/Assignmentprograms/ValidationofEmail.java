package com.mukilan.Assignmentprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ValidationofEmail {
 
 
     public static boolean isValidEmail(String email) {
      String regex = "^(.+)@(.+)$";
    //initialize the Pattern object
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(email);
         return matcher.matches();

         
     }

     public static void main(String[] args) {
         List<String> emails = new ArrayList<String>();
         // valid email addresses
         emails.add("mukilan@yahoo.com");
         emails.add("mkhoney@example.com");
         emails.add("nithin@gmail.com");
         //invalid email addresses
         emails.add("mukil.gmail.com");
         emails.add("tnmk@.com");
         emails.add("superk@.google.com");

         for (String value : emails) {
             System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid email" : "invalid email"));
         }
         
         System.out.println("Enter any email address to check");
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid email" : "invalid email"));
         
     }
     
}