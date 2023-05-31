import java.util.*;
class Example{
	public static void main(String args[]){
		int x=100;		
		System.out.println(x);	
		{
			int y=200;
			System.out.println(x);		
			System.out.println(y);	
			x++;
			y++;
		}
		System.out.println(x);	
		System.out.println(y);	//Illegal
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int x=100;		
		System.out.println(x);	
		{
			int y=200;
			System.out.println(x);		
			System.out.println(y);	
			x++;
			y++;
		}
		int x=1; //Illegal ?
 		int y=2; //Legal  ?
		System.out.println(x);	
		System.out.println(y);	
	}	
}


class Example {

    public static void main(String args[]) {
        int x = 100;
        System.out.println(x);	//Line 1 
        System.out.println(y);	//Line 2
        System.out.println(z);	//Line 3  
        {
            int y = 200;
            System.out.println(x);	//Line 4 
            System.out.println(y);	//Line 5
            System.out.println(z);	//Line 6  
            {
                int z = 300;
                System.out.println(x);	//Line 7 
                System.out.println(y);	//Line 8
                System.out.println(z);	//Line 9  
            }
            System.out.println(x);	//Line 10 
            System.out.println(y);	//Line 11
            System.out.println(z);	//Line 12
        }
        System.out.println(x);	//Line 13 
        System.out.println(y);	//Line 14
        System.out.println(z);	//Line 15  
    }
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int x=100;		
		for(int i=0; i<10; i++){
			int k=0;
			System.out.println(i+" "+k);	
			k++;
		}
		System.out.println(i); //Illegal
		System.out.println(k); //Illegal
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		int total=0;
		int num;
		
		for (int i = 0; i < 10; i++){
			System.out.print("Input number "+(i+1)+" : ");
			num=input.nextInt();
			total=total+num;
		}
		System.out.println("Total : "+total);	
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			System.out.println(i);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int i = 0;
		for (; i < 10; i++){
			System.out.println(i);
		}
		System.out.println("after loop : "+i);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int i = 0;
		for ( ;i < 10; ){
			System.out.println(i);
			i++;
		}
		System.out.println("after loop : "+i);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i=0; i < 10;  ){
			System.out.println(i);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		int i=0;
		for (System.out.println("A");  i < 10; System.out.println("C") ){
			System.out.println("B");
			i++;
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
	
		for(int i=0; i <100 ; i++){
			
		}
		
		for (int i = 0; i < 100; i++){
			
		}
		int i=0;
		for (; i < 100; i++){
			
		}
		for (int i = 0; i < 100; i++){
			
		}
		
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 0; i < 100; i++){
			System.out.println(i);
		}
		
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			System.out.println(i+1);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 1; i <= 10; i++){
			System.out.println(i);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 0; i < 10; ){
			System.out.println(++i);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 100; i > 0; i-- ){
			System.out.println(i);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 0; i <=100; i+=2 ){
			System.out.println(i);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 0; i <=100; ++i ){
			if(i%2==0) System.out.println(i);
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for (int i = 0; i <10; ++i ){
			System.out.print(i+" ");
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.print("[");
		for (int i = 0; i <10; ++i ){
			System.out.print(i+", ");
		}
		System.out.println("\b\b]");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input a digit : ");
		int digit=input.nextInt();
		System.out.print("[");
		for (int i = 0; i <10; ++i ){
			System.out.print(digit+", ");
		}
		System.out.println("\b\b]");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		System.out.print("[");
		for (int i = 0; i <num; i++ ){
			System.out.print(i+1+", ");
		}
		System.out.println("\b\b]");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		System.out.print("[");
		for (int i = num; i >0; i--){
			System.out.print(i+", ");
		}
		System.out.println("\b\b]");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		for (int i = 1; i<=num; i++){
			System.out.print(i+" + ");
		}
		System.out.println("\b\b =");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		int sum=0;
		for (int i = 1; i<=num; i++){
			System.out.print(i+" + ");
			sum+=i;
		}
		System.out.println("\b\b = "+sum);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		int fact=1;
		for (int i = num; i>0; i--){
			System.out.print(i+" x ");
			fact*=i;
		}
		System.out.println("\b\b = "+fact);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int total=0;
		for (int i = 0; i < 10; i++){
			System.out.print("Input marks for student "+(i+1)+" : ");
			int marks=input.nextInt();
			total=total+marks;
		}
		System.out.println("Total : "+total);	
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		int total=0;
		for (int i = 0; i < N; i++){
			System.out.print("Input marks for student "+(i+1)+" : ");
			int marks=input.nextInt();
			total=total+marks;
		}
		System.out.println("Total : "+total);	
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int total=0;
		System.out.print("Input marks for student  : ");
		int marks=input.nextInt();
		for (; marks!=-1; ){
			total=total+marks;
			System.out.print("Input marks for student  : ");
			marks=input.nextInt();
		}
		System.out.println("Total : "+total);	
	}	
}

