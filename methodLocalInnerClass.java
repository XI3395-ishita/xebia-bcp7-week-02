import java.io.*;
class Outer11{
	void outerMethod() {
		int age=22;
		System.out.println("Age: "+age);
		class inner{
			void innerMethod() {
				String name="Aditya";
				System.out.println("Name: "+name);
		
			}
		}
		
		inner x=new inner();
		x.innerMethod();
		
	}
}

public class Actual2 {

	public static void main(String[] args) {
		Outer11 y=new Outer11();
		y.outerMethod();

	}

}
