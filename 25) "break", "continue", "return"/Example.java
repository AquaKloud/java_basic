import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.println("Start");
		for(int i=0; i<10; i++){
			System.out.println("i : "+i);
			if(i==5){break;}
		}
		System.out.println("End");
	}	
}

import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.println("Start");
		for(int i=0; i<10; i++){
			System.out.println("A : "+i);
			if(i==5){continue;}
			System.out.println("B : "+i);
		}
		System.out.println("End");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.println("Start");
		for(int i=0; i<10; i++){
			if(i%2==0){continue;}
			System.out.println("i : "+i);
		}
		System.out.println("End");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.println("Start");
		for(int i=0; i<10; i++){
			if(i==5){return;}
			System.out.println("i : "+i);
		}
		System.out.println("End");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.println("Start");
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.println(i+" "+j);
				if(i==5){
					break;
				}
			}
		}
		System.out.println("End");
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.println("Start");
		L1: for(int i=0; i<10; i++){
			L2: for(int j=0; j<10; j++){
				System.out.println(i+" "+j);
				if(i==5){
					break L1; 
				}
			}
		}
		System.out.println("End");
	}	
}


