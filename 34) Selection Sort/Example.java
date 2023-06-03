// Step I

import java.util.*;
class Example {
	public static void sort(int[] x){
		int max=x[0];
		int index=0;
		for(int j=0; j<x.length; j++){
			if(x[j]>max){
				max=x[j];
				index=j;
			}
		}
		x[index]=x[x.length-1];
		x[x.length-1]=max;
	}
	public static void main(String[] args) {
		int[] xr={99,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		sort(xr);
		System.out.println(Arrays.toString(xr));//[12,23,32,32,34,43,45...........]
    }
}

////////////////////////////////////////////////////////////////////////////////////

// Step II

import java.util.*;
class Example {
	public static void sort(int[] x){
		int max=x[0];
		int index=0;
		
		for(int j=0; j<x.length-0; j++){
			if(x[j]>max){
				max=x[j];
				index=j;
			}
		}
		x[index]=x[x.length-1];
		x[x.length-1]=max;
		//-----------------------------------------------
		
		max=x[0];
		index=0;
		for(int j=0; j<x.length-1; j++){
			if(x[j]>max){
				max=x[j];
				index=j;
			}
		}
		x[index]=x[x.length-2];
		x[x.length-2]=max;
		//-----------------------------------------------
		
		max=x[0];
		index=0;
		for(int j=0; j<x.length-2; j++){
			if(x[j]>max){
				max=x[j];
				index=j;
			}
		}
		x[index]=x[x.length-3];
		x[x.length-3]=max;
		//-----------------------------------------------
	}
	public static void main(String[] args) {
		int[] xr={99,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		sort(xr);
		System.out.println(Arrays.toString(xr));//[12,23,32,32,34,43,45...........]
    }
}

////////////////////////////////////////////////////////////////////////////////////
