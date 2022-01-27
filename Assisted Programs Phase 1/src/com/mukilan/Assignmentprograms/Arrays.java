package com.mukilan.Assignmentprograms;

public class Arrays {

public static void main(String[] args) {

//using single-dimensional array
int a[]= {10,20,30,40,50};
for(int i=0;i<5;i++) {
System.out.println("Elements in array a: "+a[i]);
}
//using multidimensional array
int[][] b = {
            {1,2,3,4}, 
            {5,6,7} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}
