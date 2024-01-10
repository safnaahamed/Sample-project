package javasampleproject;

public class Class3 extends Class1 {
	public void printOne() {
		
		System.out.println("Print Hello World");	
			
		}
	public static void main(String[] args) {

		Class3 hier = new Class3();
		hier.print();
		hier.printOne();

	}

}
