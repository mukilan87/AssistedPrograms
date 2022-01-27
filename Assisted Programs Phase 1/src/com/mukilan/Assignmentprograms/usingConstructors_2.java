package com.mukilan.Assignmentprograms;

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class usingConstructors_2 {
public static void main(String[] args) {

	Std std1=new Std(12,"Benny");
	Std std2=new Std(5,"Dayal");
	std1.display();
	std2.display();
		}
}

