// Two dimensional arrays

import java.util.Random;
import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		final int N=10; //no of students
		final int S=4;  //no of subject
		int[][] marks=new int[N][S]; //two dimensional array
		System.out.println(marks);	
		System.out.println(marks[0]+" "+marks[1]+" ");	
		System.out.println(marks[0][0]);	
    }
}

////////////////////////////////////////////////////////////////////////////////////

// Three dimensional arrays

import java.util.Random;
import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		int[][][] threeD=new int[5][3][4];
		System.out.println(threeD);	
		System.out.println(threeD[0]+" "+threeD[1]);	
		System.out.println(threeD[0][0]+" "+threeD[0][1]);	
		System.out.println(threeD[0][0][0]+" "+threeD[0][0][1]);	
    }
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of sutdents : ");
		int N=input.nextInt();
		//1. Create a two dimensional array to store student marks
		
		//2. Read marks
		
		//3. Print marks (tabular form)
		
    }
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of sutdents : ");
		int N=input.nextInt();
		
		//1. Create a two dimensional array to store student marks
		int[][] marks=new int[N][];
		System.out.println(marks[0]+" "+marks[1]);//null null
		
		for (int i = 0; i < marks.length; i++){
			System.out.print("Input no of subjects for student "+(i+1)+" : ");
			int s=input.nextInt();
			marks[i]=new int[s];
		}
		
		//2. Read marks
		
		//3. Print marks (tabular form)
		
    }
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of sutdents : ");
		int N=input.nextInt();
		
		//1. Create a two dimensional array to store student marks
		int[][] marks=new int[N][];
		System.out.println(marks[0]+" "+marks[1]);//null null
		
		for (int i = 0; i < marks.length; i++){
			System.out.print("Input no of subjects for student "+(i+1)+" : ");
			int s=input.nextInt();
			marks[i]=new int[s];
		}
		
		//2. Read marks
		for (int i = 0; i < marks.length; i++){
			System.out.println("input marks for student "+(i+1)+"....");
			for(int j=0; j<marks[i].length; j++){
				System.out.print("\tSub"+(j+1)+" : ");
				marks[i][j]=input.nextInt();
			}	
			
		}
		
		//3. Print marks (tabular form)
		
    }
}

////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of sutdents : ");
		int N=input.nextInt();
		
		//1. Create a two dimensional array to store student marks
		int[][] marks=new int[N][];
		System.out.println(marks[0]+" "+marks[1]);//null null
		
		for (int i = 0; i < marks.length; i++){
			System.out.print("Input no of subjects for student "+(i+1)+" : ");
			int s=input.nextInt();
			marks[i]=new int[s];
		}
		
		//2. Read marks
		Random r=new Random();
		for (int i = 0; i < marks.length; i++){
			for(int j=0; j<marks[i].length; j++){
				marks[i][j]=r.nextInt(101);
			}	
		}
		
		//3. Print marks (tabular form)
		for (int i = 0; i < marks.length; i++){
			for(int j=0; j<marks[i].length; j++){
				System.out.print(marks[i][j]+"\t");
			}	
			System.out.println();			
		}
    }
}

////////////////////////////////////////////////////////////////////////////////////
