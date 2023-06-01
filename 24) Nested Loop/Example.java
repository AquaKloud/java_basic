
import java.util.*;
class Example{
	public static void main(String args[]){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.println(i+" "+j);
			}
		}
	}	
}

import java.util.*;
class Example{
	public static void main(String args[]){
		for(int i=0; i<10; i++){
			for(int j=0; j<i+1; j++){
				System.out.println(i+" "+j);
			}
			System.out.println("====");
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for(int i=9; i>=0; i--){
			for(int j=0; j<i+1; j++){
				System.out.println(i+" "+j);
			}
			System.out.println("====");
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.print("*  ");
			}
			System.out.println();
		}
	}	
}
