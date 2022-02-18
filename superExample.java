import java.io.*;
class Book {
	
	int StudentId=1111;
}

class StudentDetails extends Book{
	int StudentId=3333;
	
	void Display(){
		System.out.println("Student id: "+super.StudentId);
	}
}

 class superExample {

	public static void main(String[] args) {
		StudentDetails obj=new StudentDetails();
		obj.Display();

	}

}
