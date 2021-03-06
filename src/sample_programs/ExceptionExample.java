package sample_programs;

// divide by zero exception
public class ExceptionExample {

	public void Division(int a ,int b) {
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}

//user defined exception
class UserDefinedExc{
	static void ValidateString(String str)throws UserDefinedException {
	
		if(str == "hello") {
			throw new UserDefinedException("User Defined Exception Done!");
		}
		
		else {
			System.out.println("No exception");
		}
	}
}