import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input Student average : ");
		double avg=input.nextDouble();
		System.out.print("Input Student attendence : ");
		double atten=input.nextDouble();
		if(avg>=50 | atten>=80){
			System.out.println("eligible");
		}else{
			System.out.println("not eligible");
		}
	}	
}

import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		int x=100,y=200;
		System.out.println(x=y);	//Line 1
		System.out.println(x==y);	//Line 2
		System.out.println(x!=y);	//Line 3
	}
}


class Example {
    public static void main(String[] args) {
        int x=99;
        if(x==100){
            System.out.println("A");
        }
        if(x++==100){
            System.out.println("B");
        }        
        if(++x==100){
            System.out.println("C");
        }
    }
}


class Example {
    public static void main(String[] args) {
		int x=5,y=3;
		System.out.println(x+" "+y); // 5 3
		if(x++==5 | y++==5){ 
			System.out.println("win");
		}
		System.out.println(x+" "+y); // 6 4
    }
}


//Short Circuit OR "||" VS boolean OR "|"
package example;
public class Example {
    public static void main(String[] args) {
        int x=5, y=3;
        System.out.println(x+" "+y); //5 3
        if(x++==5 | y++==5){
            System.out.println("won");
        }
        System.out.println(x+" "+y); //6 4
    }
}


// Short Circuit AND "&&" VS boolean AND "&"
package example;
public class Example {
    public static void main(String[] args) {
        int x=5, y=3;
        System.out.println(x+" "+y); //5 3
        if(x++==5 || y++==5){
            System.out.println("won");
        }
        System.out.println(x+" "+y); //6 3
    }
}


package example;
public class Example {
    public static void main(String[] args) {
        int x=3, y=5;
        System.out.println(x+" "+y); //3 5
        if(x++==5  && y++==5){
            System.out.println("won");
        }
        System.out.println(x+" "+y); //4 5
    }
}


class Example{
	public static void main(String args[]){
		int x;
		x=9;
		System.out.println(x==x);

		x=9;
		System.out.println(x++==x);//

		x=9;
		System.out.println(++x==x);

		x=9;
		System.out.println(x==++x);
	
		x=9;
		System.out.println(x==x++);
		
		x=9;
		System.out.println(x++==x++);

		x=9;
		System.out.println(++x==++x);

		x=9;
		System.out.println(++x==x++);
		
		x=9;
		System.out.println(x++==++x);

	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		int x;
		x=r.nextInt(); //min of int to max of int
		System.out.println(x);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		int x;
		x=r.nextInt(); //min of int to max of int
		int abs;
		if(x<0){
			abs=-x;
		}else{
			abs=x;
		}
		System.out.println(x+" : "+abs);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		int x;
		x=r.nextInt(); //min of int to max of int
		int abs;
		/*if(x<0){
			abs=-x;
		}else{
			abs=x;
		}
		*/
		abs = x<0 ? -x : x;
		System.out.println(x+" : "+abs);
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		int x=r.nextInt(); //min of int to max of int
		x=x<0 ? -x : x;
		x=x % 10; 
		System.out.println(x); //0 to 9
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		int x=r.nextInt(10); //0 to 9
		System.out.println(x); //
	}	
}



import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		int x=r.nextInt(100)+1; //1 to 100
		System.out.println(x); //
	}	
}


