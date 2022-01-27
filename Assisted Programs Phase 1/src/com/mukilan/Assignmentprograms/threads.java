package com.mukilan.Assignmentprograms;

public class threads extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		threads mt = new  threads();
  		mt.start();
 	}
}

