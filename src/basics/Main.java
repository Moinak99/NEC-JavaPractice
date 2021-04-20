package basics;
public class Main {
public static void main(String[] args) {
	//collections
		Collections obj = new Collections();
		obj.ArrayListDemo();
		obj.LinkedListDemo();
		obj.VectorDemo();
		obj.HashMapDemo();
		obj.HashSetDemo();
		obj.LinkedHashSetDemo();
		
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
			
	}
}



