class Example {
    public static void main(String []args) {
		System.out.println(100+200); //Arithmetic addition
		System.out.println("abc"+"xyz"); //String concat
		System.out.println("100"+"200"); //String concat
	}
}

class Example {
    public static void main(String []args) {
		System.out.println(100+"200"); //100200
		System.out.println("100"+200); //100200
		System.out.println("100+200"); //100+200
	}
}

class Example {
    public static void main(String []args) {
		System.out.println("10+20+30"); //10+20+30
		System.out.println("10+20"+"30");
		System.out.println("10"+"20+30");
		System.out.println("10"+"20"+"30");
		System.out.println("10"+"20"+30);
		System.out.println("10"+20+"30");
		System.out.println(10+"20"+"30");
		System.out.println("10+20"+30);
		System.out.println(10+"20+30");
		System.out.println("10"+20+30); //prints 102030
		System.out.println(10+20+"30"); //prints 3030
		System.out.println(10+20+30);
	}
}

class Example {
    public static void main(String []args) {
		int x=10,y=20,z=30;
		System.out.println("x+y+z");
		System.out.println("x"+"y+z");
		System.out.println("x+y"+"z");
		System.out.println("x"+"y"+"z");
		System.out.println(x+"y"+"z");
		System.out.println("x"+y+"z");
		System.out.println("x"+"y"+z);
		System.out.println("x+y"+z);
		System.out.println(x+"y+z");
		System.out.println(x+y+"z");
		System.out.println("x"+y+z);
		System.out.println(x+y+z);
	}
}

class Example {
    public static void main(String []args) {
		int age=10;
		System.out.println("My age is : "+age); //Prints --> My age is : 10		
	}
}

class Example {
    public static void main(String []args) {
		int x=10,y=20;
		System.out.println(x+" "+y); //10 20
	}
}

class Example {
    public static void main(String []args) {
		int x=10,y=20;
		int z;
		z=x+y;
		System.out.println(); //10 + 20 = 30
	}
}

class Example {
    public static void main(String []args) {
		int x=10,y=20;
		int z;
		z=x+y;
		System.out.println(x+" + "+y+" =  "+z); //10 + 20 = 30
	}
}

class Example {
    public static void main(String []args) {
		int year=1999;
		int month=2;
		int day=20;
		System.out.println(); //1999-2-20
	}
}

class Example {
    public static void main(String []args) {
		int year=1999;
		int month=2;
		int day=20;
		System.out.println(year+"-"+month+"-"+day); //1999-2-20
	}
}

