package Abstraction;
	
	abstract class Parent{
		abstract void add(int a,int b);
		abstract void mul(int a,int b);
	}
	class Child extends Parent{
		public void add(int x,int y) {
			System.out.println("Summation: "+(x+y));		
	}
		public void mul(int x,int y) {
			System.out.println("Multiplication: "+(x*y));
		}
	}
	public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.add(10, 2);
		c.mul(3, 4);

	}
}


