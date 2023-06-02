////////////////////////////////////////////////////////////////////////////////////
// Case I

import java.util.*;
class Example{
	public static void myMethod(){
		System.out.println("Start myMethod");
		System.out.println("End myMethod");
	}
	public static void main(String args[]){
		System.out.println("Start main");
		//myMethod();
		System.out.println("End main");
	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Case II

import java.util.*;
class Example{
	
	public static void main(String args[]){
		System.out.println("Start main");
		myMethod(); //Legal
		System.out.println("End main");
	}	
	public static void myMethod(){
		System.out.println("Start myMethod");
		System.out.println("End myMethod");
	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Case III

import java.util.*;
class Example{
	
	public static void main(String args[]){
		public static void myMethod(){
			System.out.println("Start myMethod");
			System.out.println("End myMethod");
		}	

		System.out.println("Start main");
		myMethod(); //Legal
		System.out.println("End main");
	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Case IV

import java.util.*;
class Example{
	public static void myMethod2(){
		System.out.println("Start myMethod2");
		myMethod1();
		System.out.println("End myMethod2");
	}	
	public static void main(String args[]){
		System.out.println("Start main");
		myMethod2(); //Legal
		System.out.println("End main");
	}	
	public static void myMethod1(){
		System.out.println("Start myMethod1");
		System.out.println("End myMethod1");
	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Case V

import java.util.*;
class Example{
	public static void printTotal(int a, int b){
		int a=100;
		int b=200;
		int c=300;
	}		
	public static void main(String args[]){

	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Case VI

import java.util.*;
class Example{
	public static void printTotal(int a,b){ //Illegal
		
	}		
	public static void main(String args[]){

	}	
}

////////////////////////////////////////////////////////////////////////////////////

// Case VII

class Example{
	public static void  printTotal(int x=10,int y=20){
		int total;
		total=x+y;
		System.out.println(total);
	}
	public static void main(String args[]){
		//
	}
}

////////////////////////////////////////////////////////////////////////////////////

// Case VIII
class Example{
	public static double  average(int total, int n){	
		double avg=(double)total/n;
		return avg;
	}		
	public static void main(String args[]){
		int totalMarks=899;
		int no_of_students=10;
		double avg=average(no_of_students,totalMarks);
		System.out.println("Average : "+avg);	
		
		avg=average(totalMarks,no_of_students);
		System.out.println("Average : "+avg);			
	}
}

////////////////////////////////////////////////////////////////////////////////////

 class Example {
    
    public static void main(String[] args) {
        double d;
        d=Math.pow(7,2);
        System.out.println("7^2 : "+d); //49.0
        d=Math.pow(2,7);
        System.out.println("2^7 : "+d); //128.0        
    }
}

////////////////////////////////////////////////////////////////////////////////////

//Case X

import java.util.*;
class Example{
	public static void printNumber(int num){
		System.out.println("["+num+"]");
	}		
	public static void main(String args[]){
		printNumber(123);
		byte b=100;
		printNumber(b);
		
		short s=100;
		printNumber(s);
		
		long x=122;
		//printNumber(x);
		
		printNumber('A');
	}	
}

////////////////////////////////////////////////////////////////////////////////////

//Case XI

import java.util.*;
class Example{
	public static void myMethod(int x){
		System.out.println("A");
		System.out.println("B");
		if(x<50){return;}
		System.out.println("C");
		System.out.println("D");
	}
	public static void main(String args[]){
		myMethod(49);
		System.out.println("============");
		myMethod(100);
	}
}

////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
class Example{
	public static void myMethod(int x){
		System.out.println("A");
		System.out.println("B");
		return;
		System.out.println("C");
		System.out.println("D");
	}
	public static void main(String args[]){
		myMethod(49);
		System.out.println("============");
		myMethod(100);
		System.out.println("End");
	}
}

////////////////////////////////////////////////////////////////////////////////////


class Example{
	public static void myMethod(int x){
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		return;
	}
	public static void main(String args[]){
		myMethod(49);
		System.out.println("============");
		myMethod(100);
		System.out.println("End");
	}
}

////////////////////////////////////////////////////////////////////////////////////

// Case XII

class Example{
	public static void  printTotal(int x,int y){
		int total;
		total=x+y;
		return total;
	}
	public static void main(String args[]){
		//
	}
}

////////////////////////////////////////////////////////////////////////////////////

// Case XIII

class Example{
	public static int  getTotal(int x,int y){
		int total;
		total=x+y;
		System.out.println(total);
	}
	public static void main(String args[]){
		//
	}
}

////////////////////////////////////////////////////////////////////////////////////


// Case XIV
class Example{
	public static int  getTotal(int x,int y){
		int total;
		total=x+y;
		return total;
		System.out.println(total);
	}
	public static void main(String args[]){
		//
	}
}

////////////////////////////////////////////////////////////////////////////////////

// Case XV

import java.util.*;
class Example{
	public static char findGrade(double avg){
		if(avg>=75){
			return 'A';
		}else if(avg>=65){
			return 'B';
		}else if(avg>=55){
			return 'C';
		}else if(avg>=45){
			return 'D';
		}
		
	}
	
	public static void main(String args[]){
		
	}
}

////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
class Example{
	public static char findGrade(double avg){
		if(avg>=75){
			return 'A';
		}else if(avg>=65){
			return 'B';
		}else if(avg>=55){
			return 'C';
		}else if(avg>=45){
			return 'D';
		}else{
			return 'F';
		}
		return 'E';
	}
	
	public static void main(String args[]){
		
	}
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static char findGrade(double avg){
		if(avg>=75){
			return 'A';
		}else if(avg>=65){
			return 'B';
		}else if(avg>=55){
			return 'C';
		}else if(avg>=45){
			return 'D';
		}else{
			return 'F';
		}
	}
	
	public static void main(String args[]){
		
	}
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static char findGrade(double avg){
		if(avg>=75){
			return 'A';
		}else if(avg>=65){
			return 'B';
		}else if(avg>=55){
			return 'C';
		}else if(avg>=45){
			return 'D';
		}
		return 'E';
	}
	
	public static void main(String args[]){
		
	}
}

////////////////////////////////////////////////////////////////////////////////////

// Case XVI

class Example {
    public static int findTotal(int x, int y) {
        int z = x + y;
        return z;
    }
    public static void printTotal(int x, int y) {
        int z = x + y;
        System.out.println("Total : " + z);
    }
    public static void main(String args[]) {
        printTotal(1, 2);
		findTotal(1,2); //Illegal
    }
}

////////////////////////////////////////////////////////////////////////////////////

Case XVII

class Example {

    public static int findTotal(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void printTotal(int x, int y) {
        int z = x + y;
        System.out.println("Total : " + z);
    }

    public static void main(String args[]) {
        int tot;
        tot = findTotal(10, 20);	//Line 1 -->Legl
        tot = printTotal(10, 20);	//Line 2-->Illegal
        System.out.println(findTotal(10, 20));	//Line 3
        System.out.println(printTotal(10, 20));	//Line 4 -->>Illegal
    }
}





