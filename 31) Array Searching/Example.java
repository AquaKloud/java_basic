// lastIndexOf

import java.util.Random;
import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		int index;
		int key=32;
		
		index= lastIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //10
    	
    	key=90;
    	index= lastIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //1
    	
    	key=99;
    	index= lastIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //-1
    }
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;
class Example {
	public static int lastIndexOf(int[] x, int key){
		int index=-1;
		for (int i = 0; i < x.length; i++){
			if(x[i]==key){
				index=i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		int index;
		int key=32;
		
		index= lastIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //10
    	
    	key=90;
    	index= lastIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //1
    	
    	key=99;
    	index= lastIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //-1
    }
}

////////////////////////////////////////////////////////////////////////////////////

// firstIndexOf

import java.util.Random;
import java.util.Scanner;
class Example {
	public static int lastIndexOf(int[] x, int key){
		int index=-1;
		for (int i = 0; i < x.length; i++){
			if(x[i]==key){
				index=i;
			}
		}
		return index;
	}
	public static int firstIndexOf(int[] x, int key){
		int index=-1;
		for (int i = 0; i < x.length; i++){
			if(x[i]==key){
				index=i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		int index;
		int key=32;
		
		index= firstIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //4
    	
    	key=99;
    	index= firstIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //-1
    }
}

////////////////////////////////////////////////////////////////////////////////////

// firstIndexOf

import java.util.Random;
import java.util.Scanner;
class Example {
	public static int lastIndexOf(int[] x, int key){
		for (int i = 0; i < x.length; i++){
			if(x[i]==key){
				return i;	
			}
		}
		return -1;
	}
	public static int firstIndexOf(int[] x, int key){
		int index=-1;
		for (int i = 0; i < x.length; i++){
			if(x[i]==key){
				index=i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		int index;
		int key=32;
		
		index= firstIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //4
    	
    	key=99;
    	index= firstIndexOf(xr,key);
    	System.out.println("Index of "+key+" : "+index); //-1
    }
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		
		int key=32;
		boolean isExist=searchArray(xr,key);
    	System.out.println(key+" is exists : "+isExist);
    	
    	key=99;
		isExist=searchArray(xr,key);
    	System.out.println(key+" is exists : "+isExist);
    }
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;
class Example {
	public static boolean searchArray(int[] x, int key){
		for (int i = 0; i < x.length; i++){
			if(x[i]==key){
				return true;
			}
		}
		return false;
	}	
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		
		int key=32;
		boolean isExist=searchArray(xr,key);
    	System.out.println(key+" is exists : "+isExist);
    	
    	key=99;
		isExist=searchArray(xr,key);
    	System.out.println(key+" is exists : "+isExist);
    }
}

////////////////////////////////////////////////////////////////////////////////////
