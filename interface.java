import java.io.*;
interface Student{
	void display();	
}

class Subject implements Student{
	public void display() {
		System.out.println("This is display method of the Subject class");
	}
}

class Teacher implements Student{
	public void display() {
		System.out.println("This is display method of the Teacher class");
	}
}

public class interface_abstraction {

	public static void main(String[] args) {
		Student obj1=new Subject();
		obj1.display();
		Student obj2=new Teacher();
		obj2.display();
	}

}
