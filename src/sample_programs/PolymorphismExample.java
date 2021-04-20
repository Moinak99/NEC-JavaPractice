package sample_programs;
//method overloading
public class PolymorphismExample {


	public int AddNumbers(int num1 , int num2) {
		return num1+num2;
	}
	
	
	public int AddNumbers(int num1 , int num2,int num3) {
		return num1+num2+num3;
	}
	
	public double AddNumbers(double num1 , double num2,double num3) {
		return num1+num2+num3;
	}
	
	
	
}

//method overriding
class Train{  
	  void run(){
		  System.out.println("Train is running");
		  }  
	}  
	class Express extends Train{  
	  void run(){
		  System.out.println("Express Train is running");
		  }  
	  
	}  
