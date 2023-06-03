////////////////////////////////////////////////////////////////////////////////////

class Example {
    public static void myMethod() {
		System.out.println("Start myMethod");	
		myMethod();
		System.out.println("End myMethod");	
    }
    public static void main(String args[]) {
		System.out.println("Start main");	
		myMethod();
		System.out.println("End main");	
    }
}

////////////////////////////////////////////////////////////////////////////////////

class Example {
    public static void myMethod(int x) {
		System.out.println("Start myMethod : "+x);	
		myMethod(x++);
		System.out.println("End myMethod : "+x);	
    }
    public static void main(String args[]) {
		System.out.println("Start main");	
		myMethod(0);
		System.out.println("End main");	
    }
}

////////////////////////////////////////////////////////////////////////////////////

class Example {
    public static void myMethod(int x) {
		System.out.println("Start myMethod : "+x);	
		myMethod(++x);
		System.out.println("End myMethod : "+x);	
    }
    public static void main(String args[]) {
		System.out.println("Start main");	
		myMethod(0);
		System.out.println("End main");	
    }
}

////////////////////////////////////////////////////////////////////////////////////

class Example {
    public static void myMethod(int x) {
		System.out.println("Start myMethod : "+x);	
		if(x<5) myMethod(++x);
		System.out.println("End myMethod : "+x);	
    }
    public static void main(String args[]) {
		System.out.println("Start main");	
		myMethod(0);
		System.out.println("End main");	
    }
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Example{
	public static int fact(int num){
		//return num==0 ? 1 : num*fact(num-1);
		if(num==0){
			return 1;
		}else{
			return num*fact(num-1);
		}
	}
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			int fact=fact(i);
			System.out.println(i+" ! : "+fact);
		}
	}	
}

////////////////////////////////////////////////////////////////////////////////////

