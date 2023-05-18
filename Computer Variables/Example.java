public class Example {
    public static void main(String []args) {
		int x; //Variable Declaration
		x=100; //Variable Initializatin (value Assignment)
		System.out.println(x);  //prints 100
	}
}

public class Example {
    public static void main(String []args) {
		int x; 
		x=100; 
		System.out.println(x);
		System.out.println('x');
		System.out.println("x");
	}
}

public class Example {
    public static void main(String []args) {
		int x; 
		//x=100; 
		System.out.println(x); //Illegal -->Variable initialization error
	}
}

public class Example {
    public static void main(String []args) {
		//int x; 
		x=100; 
		System.out.println(x);
	}
}

class Example {
    public static void main(String []args) {
		int x; 
		x=100; 
		x=200;	
		System.out.println(x); //prints 200
	}
}

class Example {
    public static void main(String []args) {
		int x; 
		x=100; 
		System.out.println(x);
		x=200;	
		System.out.println(x);
	}
}

class Example {
    public static void main(String []args) {
		int x=100; 
		System.out.println(x);
	}
}

class Example {
    public static void main(String []args) {
		int x=100; 
		int y=200;
		System.out.println(x);
		System.out.println(y);
	}
}

class Example {
    public static void main(String []args) {
		int x=100; 
		System.out.println(x);
		int y=200;
		System.out.println(y);
		System.out.println(x);
	}
}

class Example {
    public static void main(String []args) {
		int x,y,z;
		x=100;
		y=200;
		z=300;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}


class Example {
    public static void main(String []args) {
		int x,y,z;
		x=y=z=100;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

class Example {
    public static void main(String []args) {
		int x=10,y,z=20;
		y=30;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

class Example {
    public static void main(String []args) {
		int x=y=z=10; //Illegal
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

class Example {
    public static void main(String []args) {
		int x=10;
		int y=20;
		int z=30;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		int x=100; //Illegal -->variable x is already defined in method main(String[])
		System.out.println(x);
	}
}

class Example {
    public static void main(String []args) {
		int x=10;
		int y=20;
		System.out.println(x);
		System.out.println(y);
		x=y;//
		System.out.println(x); //Prints 20 
		System.out.println(y); //Prints 20
	}
}

class Example {
    public static void main(String []args) {
		int x=10;
		int y=20;
		int z;
		z=x+y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}






