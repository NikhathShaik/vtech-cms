package vtech.advjava.basics;

public class Main1 {

	public static void main(String[] args) {
		IDemo d = (x, y, z) -> x+y+z;
		System.out.println(d.sum(10, 20, 10));
	}

}
