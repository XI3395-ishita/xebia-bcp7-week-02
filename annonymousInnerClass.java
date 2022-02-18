import java.io.*;
class Parent{
	void name() {
		System.out.print("Rohan ");
	}
}

class Actual3{
	static Parent m=new Parent()
	{
		void name() {
			super.name();
		    System.out.println("Pant");
	}
};

	public static void main(String[] args) {
		m.name();

	}

}
