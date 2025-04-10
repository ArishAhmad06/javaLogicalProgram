package day1;

public class swapping {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		System.out.println("before swaping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("after swaping");
		int temp;

		temp = a; // 20
		a = b; // 10
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
