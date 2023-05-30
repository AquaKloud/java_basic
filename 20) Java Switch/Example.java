import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		int x=r.nextInt(9)+1; //1 to 9
		if(x==1){
			System.out.println("x==1");
		}else if(x==2){
			System.out.println("x==2");
		}else if(x==3){
			System.out.println("x==3");
		}else if(x==4){
			System.out.println("x==4");
		}else if(x==5){
			System.out.println("x==5");
		}else{
			System.out.println("wrong number");
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		
		int x=2;
		switch(x){
			case	1: 	System.out.println("x==1");
			case	2: 	System.out.println("x==2");
			case	3: 	System.out.println("x==3");
			case	4: 	System.out.println("x==4");
			case	5: 	System.out.println("x==5");
			default	 : 	System.out.println("wrong number"); 
		}
	}	
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Random r=new Random(); //Scanner input=new Scanner(System.in);
		
		int x=2;
		switch(x){
			case	1: 	System.out.println("x==1");break;
			case	2: 	System.out.println("x==2");break;
			case	3: 	System.out.println("x==3");break;
			case	4: 	System.out.println("x==4");break;
			case	5: 	System.out.println("x==5");break;
			default	 : 	System.out.println("wrong number");  //break;
		}
	}	
}


