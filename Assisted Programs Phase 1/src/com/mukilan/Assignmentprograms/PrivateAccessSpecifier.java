package com.mukilan.Assignmentprograms;

class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("private access specifier is executed..."); 
    } 
} 

public class PrivateAccessSpecifier {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		priaccessspecifier  ref = new priaccessspecifier(); 
        //trying to access private method of another class 
        //ref.display();
	}
}

