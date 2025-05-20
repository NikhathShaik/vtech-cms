package vtech.advjava.basics;

public class MainClass {

	public static void main(String[] args) {
		Product p1 = new Product(100, "Desktop", 45000);
		Product p2 = new Product(100, "Desktop", 45000);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
	
}
