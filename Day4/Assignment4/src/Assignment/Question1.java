package Assignment;

class outer{
	public void inner() {
		class inner{
			inner(){
			System.out.println("Inner method class");
			}
		}
		new inner();
			
	}
}

public class Question1 {

	public static void main(String[] args) {
		
		outer o=new outer();
		o.inner();
		

	}

}
