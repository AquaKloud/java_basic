class Example {
    public static void main(String []args) {
		int x;
		x=1.4; //Illegal
		System.out.println(x);
	}
}


class Example {

    public static void main(String args[]) {
        double x;
        x=1.5; //Legal
        System.out.println(x);
    }
}

class Example{
	public static void main(String args[]){
		byte b;
		b=100; //Legal	
		System.out.println(b);
		b=127; //Legal
		System.out.println(b);
		b=128; //Illegal
	}
}


class Example{
	public static void main(String args[]){
		byte b;
		b=-100; //Legal	
		System.out.println(b);
		b=-128; //Legal
		System.out.println(b);
		b=-129; //Illegal
	}
}

class Example{
	public static void main(String args[]){
		byte b;
		b=Byte.MAX_VALUE;
		System.out.println(b);
		b=Byte.MIN_VALUE;
		System.out.println(b);
	}
}

class Example{
	public static void main(String args[]){
		short s;
		s=1200;
		System.out.println(s);
		s=32767; //Legal
		System.out.println(s);
		s=32768; //Illegal

		s=-32767; //Legal
		s=-32768; //Legal
		s=-32769; //Illegal

	}
}


class Example{
	public static void main(String args[]){
		short s;
		s=Short.MAX_VALUE;
		System.out.println(s);
		s=Short.MIN_VALUE;
		System.out.println(s);
	}
}


class Example{
	public static void main(String args[]){
		int x;
		x=Integer.MAX_VALUE;
		System.out.println(x);

		x=Integer.MIN_VALUE;
		System.out.println(x);
	}
}

class Example{
	public static void main(String args[]){
		long x;
		x=Long.MAX_VALUE;
		System.out.println(x);

		x=Long.MIN_VALUE;
		System.out.println(x);
	}
}

class Example{
	public static void main(String args[]){
		float f;
		f=100;
		System.out.println(f);
		
		f=1.5; //Illegal
		f=1.5f; //Legal
		System.out.println();
	}
}


class Example{
	public static void main(String args[]){
		float f;
		f=Float.MAX_VALUE;
		System.out.println(f);

		f=Float.MIN_VALUE;
		System.out.println(f);
	}
}


class Example{
	public static void main(String args[]){		
		double d;
		d=12.343; //Legal
		System.out.println(d);
		d=12.232232d; //or D Legal
		System.out.println(d);
		
		d=Double.MAX_VALUE;
		System.out.println(d);
		
		d=Double.MIN_VALUE;
		System.out.println(d);
	}
}


class Example{
	public static void main(String args[]){
		char ch;
		ch='A';
		System.out.println("ch : "+ch);
		
		ch='5';
		System.out.println("ch : "+ch);
	}
}

class Example{
	public static void main(String args[]){
		boolean b;
		b=true;
		System.out.println("boolean  : "+b);
		
		b=false;
		System.out.println("boolean  : "+b);

		b=10>9;
		System.out.println("10>9 : "+b);

		double avg=49.99;
		boolean isPass=avg>50;
		System.out.println("pass : "+isPass);
	}
}

class Example{
	public static void main(String args[]){
		char x='A';
		System.out.println(x);
		x=66;
		System.out.println(x); //prints B

		x='1';
		System.out.println(x); //prints 1
	}
}


class Example{
	public static void main(String args[]){		
		char ch;
		ch='A';
		System.out.println(ch);
		ch=66;
		System.out.println(ch);

		int x;
		x='A';
		System.out.println(x);
	}
}


class Example{
	public static void main(String args[]){
		char x='A';
		System.out.println("A"+100); //prints A100
		System.out.println('A'+100); //prints 165
	}
}


class Example{
	public static void main(String args[]){
		char x='A';
		System.out.println(x+x); //130
		System.out.println('x'+x); //
		System.out.println('x'+'x'); //
		System.out.println("x"+"x"); //
	}
}


class Example{
	public static void main(String args[]){
		boolean b=true;
		System.out.println(b);
		b=100<99;
		System.out.println(b);
		b=1; //Illegal
		b=0;	//Illegal
	}
}


class Example{
	public static void main(String args[]){		
		String s="Hello Java";
		System.out.println(s);

		String name=new String("Niroth");
		System.out.println(name);
	}
}


import java.util.*;
class Example{
	public static void main(String args[]){		
		Scanner input=new Scanner(System.in);
		byte b;
		b=input.nextByte();
		short s;
		s=input.nextShort();	

		int x;
		x=input.nextInt();

		long y;
		y=input.nextLong();

		float f;
		f=input.nextFloat();
		double d;
		d=input.nextDouble();

		boolean bool;
		bool=input.nextBoolean();	

		String name;
		name=input.next();
	}
}


import java.util.*;
class Example{
	public static void main(String args[]){		
		Scanner input=new Scanner(System.in);
		
		String name;
		System.out.print("Input your name : ");

		name=input.nextLine(); //name=input.next(); 
		System.out.println("your name : "+name);
	}
}


class Example {
    public static void main(String []args) {
		System.out.println(2147483647);
		//System.out.println(2147483648);
		System.out.println(2147483648L);
		System.out.println(214748364234234248L);
		System.out.println(9223372036854775807L);
		//System.out.println(9223372036854775808L);
		System.out.println(92233720368547758034334538D);
	}
}
















