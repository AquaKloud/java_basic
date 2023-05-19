import java.util.Scanner;

 class Example {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.print("Input number 1 : ");
        num1=input.nextInt();
        System.out.print("Input number 2 : ");
        num2=input.nextInt();
        int result;
        result=num1+num2;
        System.out.println(num1+" + "+num2+" = "+result);
        result=num1-num2;
        System.out.println(num1+" - "+num2+" = "+result);        
        result=num1*num2;
        System.out.println(num1+" * "+num2+" = "+result);        
        result=num1/num2;
        System.out.println(num1+" / "+num2+" = "+result);        
    }
}


import java.util.Scanner;
class Example {

    public static void main(String[] args) {
        System.out.println(10/4); //2
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0); //2.5
        System.out.println((double)10/4); //2.5
    }
}


public class Example {

    public static void main(String[] args) {
        int x;
        x=10/3;
        System.out.println("10/3 : "+x);
        x=10%3;
        System.out.println("10%3 : "+x);
    }
}


class Example {

    public static void main(String[] args) {
        int x;
        x=10%1;
        System.out.println("10/1 : "+x);
        x=10%2;
        System.out.println("10%2 : "+x);
        x=10%3;
        System.out.println("10%3 : "+x);        
        x=10%4;
        System.out.println("10%4 : "+x);        
        x=10%5;
        System.out.println("10%5 : "+x);        
        x=10%6;
        System.out.println("10%6 : "+x);        
        x=10%7;
        System.out.println("10%7 : "+x);        
        x=10%8;
        System.out.println("10%8 : "+x);        
        x=10%9;
        System.out.println("10%9 : "+x);        
        x=10%10;
        System.out.println("10%10 : "+x);        
        
    }
}


class Example {

    public static void main(String[] args) {
        int x;
        x=10%13;
        System.out.println("10/13 : "+x);
    }
}


import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input a salary : ");
		int salary=input.nextInt();
		int r5000,r2000,r1000,r500,r200,r100,r50,r20,r10,r5,r2,r1;
		//Find minimum notes and coins
		
		
		System.out.println("R5000 : "+r5000);
		System.out.println("R2000 : "+r2000);
		System.out.println("R1000 : "+r1000);
		System.out.println("R500  : "+r500);
		System.out.println("R200  : "+r200);
		System.out.println("R100  : "+r100);
		System.out.println("R50  : "+r50);
		System.out.println("R20  : "+r20);
		System.out.println("R10  : "+r10);
		System.out.println("R5  : "+r5);
		System.out.println("R2  : "+r2);
		System.out.println("R1  : "+r1);
	}
}


import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input a salary : ");
		int salary=input.nextInt();
		int r5000,r2000,r1000,r500,r200,r100,r50,r20,r10,r5,r2,r1;
		//Find minimum notes and coins
		r5000=salary/5000;
		r2000=salary/2000;
		r1000=salary/1000;
		r500=salary/500;
		r200=salary/200;
		r100=salary/100;
		r50=salary/50;
		r20=salary/20;
		r10=salary/10;
		r5=salary/5;
		r2=salary/2;
		r1=salary/1;
				
		System.out.println("R5000 : "+r5000);
		System.out.println("R2000 : "+r2000);
		System.out.println("R1000 : "+r1000);
		System.out.println("R500  : "+r500);
		System.out.println("R200  : "+r200);
		System.out.println("R100  : "+r100);
		System.out.println("R50  : "+r50);
		System.out.println("R20  : "+r20);
		System.out.println("R10  : "+r10);
		System.out.println("R5  : "+r5);
		System.out.println("R2  : "+r2);
		System.out.println("R1  : "+r1);
	}
}


import java.util.*;
class Example {
    public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input a salary : ");
		int salary=input.nextInt();
		int r5000,r2000,r1000,r500,r200,r100,r50,r20,r10,r5,r2,r1;
		//Find minimum notes and coins
		r5000=salary/5000;
		salary=salary%5000;
		r2000=salary/2000;
		salary=salary%2000;
		r1000=salary/1000;
		salary=salary%1000;
		r500=salary/500;
		salary=salary%500;
		r200=salary/200;
		salary=salary%200;
		r100=salary/100;
		salary=salary%100;
		r50=salary/50;
		salary=salary%50;
		r20=salary/20;
		salary=salary%20;
		r10=salary/10;
		salary=salary%10;
		r5=salary/5;
		salary=salary%5;
		r2=salary/2;
		salary=salary%2;
		r1=salary;
				
		System.out.println("R5000 : "+r5000);
		System.out.println("R2000 : "+r2000);
		System.out.println("R1000 : "+r1000);
		System.out.println("R500  : "+r500);
		System.out.println("R200  : "+r200);
		System.out.println("R100  : "+r100);
		System.out.println("R50  : "+r50);
		System.out.println("R20  : "+r20);
		System.out.println("R10  : "+r10);
		System.out.println("R5  : "+r5);
		System.out.println("R2  : "+r2);
		System.out.println("R1  : "+r1);
	}
}


//Incrementer(++) and decrementer (--)
class Example {
    public static void main(String[] args) {
        int x=100;
        System.out.println(x); //100
        x++; //increment by 1 (x=x+1, x+=1)
        System.out.println(x); //101
        ++x; //increment by 1 (x=x+1, x+=1)
        System.out.println(x); //102
        x--; //x=x-1; //x-=1
        System.out.println(x); //101
        --x;
        System.out.println(x); //100
    }
}

//x++(post fix) vs ++x (pre fix)
class Example {
    public static void main(String[] args) {
        int x=100;
        int y;
        y=x++;
        System.out.println(x+" "+y); 
        System.out.println("-----------");
        //
        x=100;
        y=++y;
        System.out.println(x+" "+y); 
    }
}


class Example {
    public static void main(String[] args) {
        int x=100;
        System.out.println(x); 
        
        System.out.println(x++);
        System.out.println(++x);
    }
}


class Example {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4;
        int x;
        x=a++ + ++b + ++c + d++;
        System.out.println(x+" "+a+" "+b+" "+c+" "+d);
    }
}


class Example {
    public static void main(String[] args) {
        int x=1;
        x=x++ + ++x + x++ + ++x;
        System.out.println(x);
    }
}








