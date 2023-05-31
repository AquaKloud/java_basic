import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int total=0;
		System.out.print("Input marks for student  : ");
		int marks=input.nextInt();
		while(marks!=-1){
			total=total+marks;
			System.out.print("Input marks for student  : ");
			marks=input.nextInt();
		}
		System.out.println("Total : "+total);	
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int x=0;	
		while(x<100){	
			System.out.println(x++);
		}
	}
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		int fact=1;
		while(num>0){
			System.out.print(num+" x ");
			fact*=num--;
		}
		System.out.println("\b\b = "+fact);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new  Random();
		for (int i = 0; i < 100; i++){
			int rand=r.nextInt(101);
			System.out.println(rand);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new  Random();
		int rand;
		while((rand=r.nextInt(101))!=100){
			System.out.println(rand);
		}
	}	
}




