package com.mukilan.Assignmentprograms;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int firstnum=sc.nextInt();
		int secnum= sc.nextInt();
		System.out.println("Enter operator ");
		char op=sc.next().charAt(0);
		double Ans=0;

		switch(op){
		case '+': 
			Ans=firstnum+secnum;
		break;
		case '-':
			Ans=firstnum-secnum;
		break;
		case '*': 
			Ans=firstnum*secnum;
		break;
		case '/':
			Ans=firstnum/secnum;
		break;
		}
		System.out.println("Answer : " + Ans);
	}

}

