class Example {
    public static void main(String args[]) {
        byte b=10;
        short s;
        s=b; 
        System.out.println(b+" "+s);
        
        b=s;
    }
}


class Example {
    public static void main(String []args) {
		double d=12.0;
		int x;
		x=d;
		System.out.println(x+" : "+d);
	}
}


class Example {
    public static void main(String []args) {
		double d;
		int x=100;
		d=x;
		System.out.println(x+" : "+d);//100 100.0
	}
}

class Example {
    public static void main(String []args) {
		double d=12.0;
		int x;
		//x=d; //Illegal
		x=(int)d; //Primitive data casting	
		System.out.println(x+" : "+d);
	}
}


class Example {
    public static void main(String []args) {
		short s=100;
		byte b;
		//b=s; //Illegal
		b=(byte)s;
		System.out.println(s+" : "+b); //100 : 100
		
		s=127;
		b=(byte)s;
		System.out.println(s+" : "+b); //127 : 127
		
		s=128;
		b=(byte)s;
		System.out.println(s+" : "+b); //127 : -128
		
		s=255;
		b=(byte)s;
		System.out.println(s+" : "+b); //127 : -1
		
		s=256;
		b=(byte)s;
		System.out.println(s+" : "+b); //127 : 0
	}
}


class Example{
	public static void main(String args[]){
		char ch='A';
		int code;
		code=ch; //automatic conversion
		System.out.println("ASCII of A : "+code);;
		
		double d;
		d=ch; //automatic
		System.out.println(ch+" "+d);//A : 65.0
	}
}


class Example{
	public static void main(String args[]){
		short s=127;
		byte b;
		b=127; //Legal
		b='A'; //Legal
		b=s; //Illegal
	}
}


class Example{
	public static void main(String args[]){
		double d=255.1234;
		byte b;
		b=(byte)d;
		System.out.println(d+" : "+b);

		short s;
		s=(short)d;
		System.out.println(d+" : "+s);
	}
}


class Example{
	public static void main(String args[]){
		double d;
		int x;

		d=1.23E3; //->1230.0
		x=(int)d;
		System.out.println(d+" : "+x);

		d=123.0E-3; //->0.123
		x=(int)d;
		System.out.println(d+" : "+x);

	}
}


class Example {

    public static void main(String args[]) {
        double d=67.1213;
        System.out.println(d);
        System.out.println((char)d);//C
    }
}

