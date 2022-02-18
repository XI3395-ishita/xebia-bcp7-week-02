import java.io.*;
public class thisExample {
	public static int a;
	
	
	thisExample(int a) {
		this.a=a;
	}
	
	void Display() {
		System.out.println("Value: "+a);
	}
	
	public static void main(String[] args) {
		thisExample o=new thisExample(5);
		o.Display();
	}

}
