package com.mukilan.Assignmentprograms;

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("defalut access specifier is executed..."); 
     } 
} 

public class DefaultAccessSpecifier {

	public static void main(String[] args) {
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}
