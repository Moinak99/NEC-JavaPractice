package sample_programs;

abstract class AbstractClassExample {

	abstract void method1();
	 public void method2() 
	 {
		 System.out.println("I am Abstract class Member");
	 }
}

class MyClass extends AbstractClassExample {
	 void method1() {
		 System.out.println("I am in Child");
	 }
	
}