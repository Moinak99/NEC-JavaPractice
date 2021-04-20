package basics;

public class ExceptionExample {

	public void Addition(int a ,int b) {
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
