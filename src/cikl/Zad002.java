package cikl;

public class Zad002 {

	public static void main(String[] args) {
		var n = 0;
		while (n >= 0 && n < 1000) {
			n++;
			if (n % 15 == 0) {
				System.out.println("hiss");
			} else if (n % 5 ==0) {
				System.out.println("buzz");
			} else if (n % 3 == 0) {
				System.out.println("fizz");
			} else {
				System.out.println(n);
			}
		}
	}
}