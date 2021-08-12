package Assignment;

class outer1{
	static class inner{
		inner(){
			System.out.println("inside static inner class");
		}
	}
}

public class Question2 {

	public static void main(String[] args) {
		outer1.inner o = new outer1.inner();
	}

}
