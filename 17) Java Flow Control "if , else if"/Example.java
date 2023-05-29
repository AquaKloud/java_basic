
import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input average marks : ");
		double avg =input.nextDouble(); //69
		if(avg>=75){
			System.out.println("Grade A");
		}
		if(avg>=65){
			System.out.println("Grade B");
		}
		if(avg>=45){
			System.out.println("Grade C");
		}
		if(avg>=25){
			System.out.println("Grade D");
		}else{
			System.out.println("Grade E");
		}
	}
}


import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input average marks : ");
		double avg =input.nextDouble(); //69.0
		if(avg>=75){
			System.out.println("Grade A");
		}else if(avg>=65){
			System.out.println("Grade B");
		}else if(avg>=45){
			System.out.println("Grade C");
		}else if(avg>=25){
			System.out.println("Grade D");
		}else{
			System.out.println("Grade E");
		}
	}
}
