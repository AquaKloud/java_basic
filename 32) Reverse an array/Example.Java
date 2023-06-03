import java.util.*;
class Example {
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		reverseArray(x);
		System.out.println(Arrays.toString(xr));//[...........32,23,98,90,12]
    }
}

////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
class Example {
	public static void reverseArray(int[] x){
		for (int i = 0,j=x.length-1; i <j ; i++,j--){
			int temp=x[i];
			x[i]=x[j];
			x[j]=temp;
		}
	}
	public static void main(String[] args) {
		int[] xr={12,90,98,23,32,78,87,34,43,67,32,76,45,74};	
		System.out.println(Arrays.toString(xr));//[12,90,98,23,32,78,87,34,43,67,32,76,45,74]
		reverseArray(xr);
		System.out.println(Arrays.toString(xr));//[...........32,23,98,90,12]
    }
}

////////////////////////////////////////////////////////////////////////////////////
