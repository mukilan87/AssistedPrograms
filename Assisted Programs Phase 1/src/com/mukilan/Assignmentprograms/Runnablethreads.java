package com.mukilan.Assignmentprograms;

public class Runnablethreads implements Runnable{
	 
    public static int myCount = 0;
    public Runnablethreads(){
         
    }
    public void run() {
        while(Runnablethreads.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++Runnablethreads.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        Runnablethreads mrt = new Runnablethreads();
        Thread t = new Thread(mrt);
        t.start();
        while(Runnablethreads.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++Runnablethreads.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

