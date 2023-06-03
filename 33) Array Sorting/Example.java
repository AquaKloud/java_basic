// Bubble Sort

import java.util.*;
class Example {
	public static void sort(int[] x){
		
	}
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		sort(xr);
		System.out.println(Arrays.toString(xr));//[...........32,23,98,90,12]
    }
}

////////////////////////////////////////////////////////////////////////////////////

// Step II

import java.util.*;
class Example {
	public static void sort(int[] x){
		if(x[0]>x[1]){
			int t=x[0];
			x[0]=x[1];
			x[1]=t;
		}
		if(x[1]>x[2]){
			int t=x[1];
			x[1]=x[2];
			x[2]=t;
		}
		if(x[2]>x[3]){
			int t=x[2];
			x[2]=x[3];
			x[3]=t;
		}
	}
	public static void main(String[] args) {
		int[] xr={99,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		sort(xr);
		System.out.println(Arrays.toString(xr));//[12,23,32,32,34,43,45...........]
    }
}

////////////////////////////////////////////////////////////////////////////////////

// Step III (Runtime error)

import java.util.*;
class Example {
	public static void sort(int[] x){
		for(int i=0; i<x.length; i++){
			if(x[i]>x[i+1]){
				int t=x[i];
				x[i]=x[i+1];
				x[i+1]=t;
			}
		}
	}
	public static void main(String[] args) {
		int[] xr={99,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		sort(xr);
		System.out.println(Arrays.toString(xr));//[12,23,32,32,34,43,45...........]
    }
}

////////////////////////////////////////////////////////////////////////////////////

// Step IV

import java.util.*;
class Example {
	public static void sort(int[] x){
		for(int i=0; i<x.length-1; i++){
			if(x[i]>x[i+1]){
				int t=x[i];
				x[i]=x[i+1];
				x[i+1]=t;
			}
		}
	}
	public static void main(String[] args) {
		int[] xr={99,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		sort(xr);
		System.out.println(Arrays.toString(xr));//[12,23,32,32,34,43,45...........]
    }
}

////////////////////////////////////////////////////////////////////////////////////

// Step V

import java.util.*;
class Example {
	public static void sort(int[] x){
		for(int j=0; j<x.length-1; j++){
			for(int i=0; i<x.length-1; i++){
				if(x[i]>x[i+1]){
					int t=x[i];
					x[i]=x[i+1];
					x[i+1]=t;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] xr={99,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		sort(xr);
		System.out.println(Arrays.toString(xr));//[12,23,32,32,34,43,45...........]
    }
}

////////////////////////////////////////////////////////////////////////////////////

// Step VI

import java.util.*;
class Example {
	public static void sort(int[] x){
		for(int j=0; j<x.length-1; j++){
			for(int i=0; i<x.length-1; i++){
				if(x[i]>x[i+1]){
					int t=x[i];
					x[i]=x[i+1];
					x[i+1]=t;
				}
				System.out.println(Arrays.toString(x));		
				try{Thread.sleep(500);}catch(Exception ex){}
			}
		}
	}
	public static void main(String[] args) {
		int[] xr={99,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		sort(xr);
		System.out.println(Arrays.toString(xr));//[12,23,32,32,34,43,45...........]
    }
}

////////////////////////////////////////////////////////////////////////////////////
