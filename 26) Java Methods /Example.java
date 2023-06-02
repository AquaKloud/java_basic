import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.println("Niroth Lakmal");
		System.out.println("No.500/10, ");
		System.out.println("Galle Rd, ");
		System.out.println("Panadura.");
		
		System.out.println("Niroth Lakmal");
		System.out.println("No.500/10, ");
		System.out.println("Galle Rd, ");
		System.out.println("Panadura.");


		System.out.println("Niroth Lakmal");
		System.out.println("No.500/10, ");
		System.out.println("Galle Rd, ");
		System.out.println("Panadura.");
	}	
}


import java.util.*;
class Example{
	//-------------------Start Method Declaration-------------------
	public static void printAddress(){
		System.out.println("Niroth Lakmal");
		System.out.println("No.500/10, ");
		System.out.println("Galle Rd, ");
		System.out.println("Panadura.");
	}
	//-------------------End Method Declaration---------------------

	//-------------------Start Main Method Declaration-------------------
	public static void main(String args[]){
		printAddress(); //Method Calling Statement
		//
		//
		//
		printAddress(); //Method Calling Statement

		//
		printAddress();
	}	
	//-------------------End Main Method Declaration-------------------
}


//------------------------------------CustomerDetail.java---------------------------
class CustomerDetail{
	public static void printAddress(){
		System.out.println("Niroth Lakmal");
		System.out.println("No.500/10, ");
		System.out.println("Galle Rd, ");
		System.out.println("Panadura.");
	}	
}

//------------------------------------Example.java---------------------------------
import java.util.*;
class Example{
	public static void main(String args[]){
		CustomerDetail.printAddress();
		//
		//
		//
		CustomerDetail.printAddress();

		//
		CustomerDetail.printAddress();
	}	
}


import java.util.*;
class Example{
	public static void printAddress(){
		System.out.println("Niroth Lakmal");
		System.out.println("No.500/10, ");
		System.out.println("Galle Rd, ");
		System.out.println("Panadura.");
	}		
	public static void main(String args[]){
		//printAddress();
	}	
}


import java.util.*;
class Example{
	public static void printTotal(){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt(); 
		System.out.print("Input number 2 : ");
		int num2=input.nextInt(); 
		int total;
		total=num1+num2;
		System.out.println(num1+" + "+num2 +" = "+total);
	}		
	public static void main(String args[]){
		printTotal();
	}	
}

////////////////////////////////////////////////////////////////////////////////////
// Parameterized Methods
import java.util.*;
class Example{
	public static void printTotal(int num1, int num2){
		int total;
		total=num1+num2;
		System.out.println(num1+" + "+num2 +" = "+total);
	}		
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt(); 
		System.out.print("Input number 2 : ");
		int num2=input.nextInt(); 
		printTotal(num1,num2);
		//
		printTotal(10,20);
		
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void printTotal(int num1, int num2){
		int total;
		total=num1+num2;
		System.out.println(num1+" + "+num2 +" = "+total);
	}		
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt(); 
		System.out.print("Input number 2 : ");
		int num2=input.nextInt(); 
		int total=printTotal(num1,num2);
		System.out.println("My Total : "+total);
		//
		//
		//
		total=printTotal(21,43);
		System.out.println("21 + 43  = "+total);
		
	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Return typed Methods

import java.util.*;
class Example{
	public static int findTotal(int num1, int num2){
		int total;
		total=num1+num2;
		return total;
	}		
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt(); 
		System.out.print("Input number 2 : ");
		int num2=input.nextInt(); 
		
		int total=findTotal(num1,num2);
		System.out.println("My Total : "+total);
		//
		//
		//
		total=findTotal(21,43);
		System.out.println("21 + 43  = "+total);
		
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			int fact=fact(i);
			System.out.println(i+" ! : "+fact);
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static int fact(int num){
		int f=1;
		while(num>0){
			f*=num--;
		}
		return f;
	}
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			int fact=fact(i);
			System.out.println(i+" ! : "+fact);
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); 
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt();
			System.out.println("Absolute value of "+rand+" : "+abs(rand));
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static int abs(int num){
		return num<0? -num:num;
	}
	public static void main(String args[]){
		Random r=new Random(); 
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt();
			System.out.println("Absolute value of "+rand+" : "+abs(rand));
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void main(String args[]){
		int total=455; //total marks
		int n=10 ; //no of students 
		char grade=findGrade(455, 10);
		System.out.println("Grade : "+grade); //Grade : C
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static char findGrade(int total, int n){
		double avg=(double)total/n;
		char grade;
		if(avg>=75){
			grade='A';
		}else if(avg>=65){
			grade='B';
		}else if(avg>=45){
			grade='C';
		}else if(avg>=25){
			grade='D';
		}else{
			grade='E';
		}
		return grade;
	}
	public static void main(String args[]){
		int total=455; //total marks
		int n=10 ; //no of students 
		char grade=findGrade(455, 10);
		System.out.println("Grade : "+grade); //Grade : C
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); 
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt();
			System.out.println("No of digits for "+rand+" : "+countDigits(rand));
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static int countDigits(int num){
		int count=0;
		do{
			count++;
		}while((num/=10)!=0);
		return count;
	}
	public static void main(String args[]){
		Random r=new Random(); 
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt();
			System.out.println("No of digits for "+rand+" : "+countDigits(rand));
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < 10; i++){
			System.out.print("Input an integer : ");
			int num=input.nextInt();
			System.out.println("Reverse of "+num+" is : "+reverse(num));
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static int reverse(int num){
		int reverse=0;
		while(num!=0){
			reverse*=10;
			reverse+=num%10;
			num/=10;
		}
		return reverse;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < 10; i++){
			System.out.print("Input an integer : ");
			int num=input.nextInt();
			System.out.println("Reverse of "+num+" is : "+reverse(num));
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		printFibonacciUpTo(num); //0, 1, 1, 2, 3, 5 ,8, 13, .....
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void printFibonacciUpTo(int num){
		
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		printFibonacciUpTo(num); //0, 1, 1, 2, 3, 5 ,8, 13, .....
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input year : ");
		int year=input.nextInt();
		if(isLeapYear(year)){
			System.out.println(year+" is a leap year");
		}else{
			System.out.println(year+" is not a leap year");
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static boolean isLeapYear(int num){
		return num%4==0;	
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input year : ");
		int year=input.nextInt();
		if(isLeapYear(year)){
			System.out.println(year+" is a leap year");
		}else{
			System.out.println(year+" is not a leap year");
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////
