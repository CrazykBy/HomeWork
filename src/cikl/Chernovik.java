package cikl;

import java.util.Scanner;

public class Chernovik {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		System.out.println("¬ведите два многочлена не = 0");
		var a = Math.abs(scan.nextInt());
		var b = Math.abs(scan.nextInt());
		int nod = 1;
		int c = (a > b) ? b : a; // вы€сн€ем меньшее число
		for (int i = 1; i <= c; i++)
			if (a % i == 0 && b % i == 0) {
				nod = i;
			}
		System.out.println(nod);
		scan.close();
	}
}
