package sample_programs;
public class Main {
public static void main(String[] args) {

	//Polymorphism
		//method overloading
			PolymorphismExample obj1 = new PolymorphismExample();
			System.out.println(obj1.AddNumbers(2, 3.5,8.8));
		//method overriding
			Train t_obj = new Express();
			t_obj.run();
			
	//Inheritance
		//Single inheritance
			InteritanceChild inh = new InteritanceChild();
			inh.StudentDetails2();
		//Hierarchical Inheritance
			
	//Collections
			Collections obj = new Collections();
			obj.ArrayListDemo();
			obj.LinkedListDemo();
			obj.VectorDemo();
			obj.HashMapDemo();
			obj.HashSetDemo();
			obj.LinkedHashSetDemo();
			
	//Exception
			ExceptionExample exobj = new ExceptionExample();
			exobj.Division(10, 0);
			
	//Abstract Class
			AbstractClassExample absobj = new MyClass();
			absobj.method1();
			absobj.method2();
			
	//Encaptulation
			EncaptulationExamples s=new EncaptulationExamples();  
			s.setName("Moinak");  
			System.out.println("Student NAme is "+s.getName());  
			
			try {
				UserDefinedExc.ValidateString("hello");
			}
			catch(Exception e) {System.out.println(e.getMessage());}
	}
}



