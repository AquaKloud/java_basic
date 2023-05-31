import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new  Random();
		int rand;
		do{
			rand=r.nextInt(101);
			System.out.println(rand);
		}while(rand!=100);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int i=0;
		while(i<10){
			System.out.println("While loop : "+i++);
		}
		//---------------------------------
		System.out.println("-----------");
		int j=0;
		do{
			System.out.println("do/while : "+j++);
		}while(j<10);
		
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int i=10;
		while(i<10){
			System.out.println("While loop : "+i++);
		}
		//---------------------------------
		System.out.println("-----------");
		int j=10;
		do{
			System.out.println("do/while : "+j++);
		}while(j<10);
		
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int i=0;
		while(i<10)
			System.out.println("While loop : "+i++);
		
		//---------------------------------
		System.out.println("-----------");
		int j=0;
		do
			System.out.println("do/while : "+j++);
		while(j<10);
		
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new  Random();
		do
			int rand=r.nextInt();
		while(true);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		//Find the no of digits 
		int count=0;
		
		
		System.out.println("No of digits : "+count);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		//Find the no of digits 
		int count=0;
		while(num!=0){
			num/=10;
			count++;
		}
		System.out.println("No of digits : "+count);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		//Find the no of digits 
		int count=0;
		do{
			num/=10;
			count++;
		}while(num!=0);
		System.out.println("No of digits : "+count);
	}	
}



import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		//Find the no of digits 
		int count=0;
		do{
			num/=10;
			count++;
		}while(num!=0);
		System.out.println("No of digits : "+count);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		//Find the sum of digits 
		int sum=0;
		do{
			sum+=num%10;
		}while((num/=10)!=0);
		System.out.println("sum of digits : "+sum);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		System.out.println("current num : "+num);
		//find the reverse
		int reverse=0;
		
		System.out.println("reverse num : "+reverse);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		System.out.println("current num : "+num);
		do{
			System.out.print(num%10);
		}while((num/=10)!=0);
	}	
}






