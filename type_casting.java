import java.io.*;
public class typeCasting {

	public static void main(String[] args) {
		double a=12.12;
		int b=(int) a;
		char c='A';
		int d=(int) c;
		float e=(float)b;
		long f=(long)a;
		
		System.out.println("int equivalent of double "+a+" is "+b);
		System.out.println("int equivalent of character "+c+" is "+d);
		System.out.println("float equivalent of integer "+b+" is "+e);
		System.out.println("long equivalent of double "+a+" is "+f);


	}
}
