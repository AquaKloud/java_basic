import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input average marks : ");
		double avg =input.nextDouble(); //69
		if(avg>50){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		//avg is 51 -->Pass
		//avg is 50 -->Fail
	}
}



import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input average marks : ");
		double avg =input.nextDouble(); //69
		if(avg>=50){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		//avg is 51 -->Pass
		//avg is 50 -->Fail
	}
}


import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		int x=100,y=100;
		if(x=y){ //Illegal --> if(x=y) illegal, if(x==y)-->Legal
			System.out.println("x is equals to y");
		}
			
	}
}



import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		int x=100,y=100;
		boolean b=x==y;
		if(b){  //Line 1 
			System.out.println("x is equals to y");
		}
		if(b=true){ //Line 2
			System.out.println("x is equals to y");
		}	
		if(b==true){ //Line 3 
			System.out.println("x is equals to y");
		}	
	}
}



