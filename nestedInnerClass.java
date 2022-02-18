import java.io.*;
class outer{
	class inner{
		void dis() {
			System.out.println("Inside nested inner class");
		}
	}
}

public class Actual {

	public static void main(String[] args) {
		outer.inner k=new outer().new inner();
		k.dis();

	}

}
