package sample_programs;

//Single inheritance
 class InheritanceDemoParent {
	
	int rollNumber = 10;
	String studentName;
	public void StudentDetails1() {
		studentName = "Moinak";
		System.out.println("Student Name :"+studentName+" Roll Number :"+rollNumber);
	}
}
 
 class InteritanceChild extends InheritanceDemoParent{
	 String studentName = "Moinak";
	 String address = "Delhi";
	 public void StudentDetails2() 
	 {
		 System.out.println("Student Name:"+studentName+" Roll Number:"+rollNumber+" address:"+address);
	 }
 }
 
 //Hierarchical Inheritance
  
class A{
	int a =10;
	public void myMethod1()
	{
		System.out.println(a);
	}
}

class B extends A{
	int b = 20;
	public void myMethod2()
	{
		System.out.println(a+b);
	}
}

class C extends A{
	public void myMethod1()
	{
		System.out.println(a*a);
	}
}

//Multi-Level Inheritance

class D{
	int a = 20;
}
class E extends D{
	int b=30;
}
class F extends E{
	public void PrintValues() {
		System.out.println(a+b+100);
	}
}