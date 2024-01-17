package aggregation;

public class Aggregation2 {
	
	String c;
	Aggregation1 ag1;
	public Aggregation2(String name, Aggregation1 ag1 ) {
		this.c=name;
		this.ag1=ag1;
	}
	
	public void print() {
		System.out.println(c);
		System.out.println(ag1.a);
		System.out.println(ag1.b);
	}
	public static void main(String[] args) {
		Aggregation1 a1 = new Aggregation1("Safna", 12);
		Aggregation2 a2 = new Aggregation2("Sreeja",a1);
		a2.print();
	}

}
