// Step I

import java.util.*;
class Example{
	public static void myMethod(){
		System.out.println("Start myMethod");
		//
		//
		System.out.println("End myMethod");
	}
	public static void main(String args[]){
		System.out.println("Start main");
		myMethod();
		System.out.println("End main");
	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Step II

import java.util.*;
class Example{
	public static void myMethod(){
		int x=100;
		System.out.println("Start myMethod : "+x);
		x++;
		System.out.println("End myMethod : "+x);
	}
	public static void main(String args[]){
		int x=100;
		System.out.println("Start main : "+x);
		myMethod();
		System.out.println("End main : "+x);//?
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void inrement(){
		int x=100;
		x++;
	}
	public static void main(String args[]){
		int x=100;
		System.out.println("x : "+x);
		inrement();
		System.out.println("x : "+x);
	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Step III
import java.util.*;
class Example{
	public static void inrement(int x){
		System.out.println("x : "+x);
		x++;
		System.out.println("x : "+x);
	}
	public static void main(String args[]){
		int x=100;
		System.out.println("x : "+x);
		inrement(x);
		System.out.println("x : "+x);
	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Step IV

import java.util.*;
class Example{
	public static int inrement(int x){
		System.out.println("x : "+x);
		x++;
		System.out.println("x : "+x);
		return x;
	}
	public static void main(String args[]){
		int x=100;
		System.out.println("x : "+x);
		x=inrement(x);
		System.out.println("x : "+x);
	}	
}

