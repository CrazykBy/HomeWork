package cikl;

import java.util.Scanner;

public class Zad001 {

	public static void main(String[] args) {
				var scan = new Scanner(System.in);
				System.out.println("Введите количество цифр");
				var n = scan.nextInt();
				var count = 0;
				int sum = 0, sum_n = 0, quant = 0, quant_n = 0;
				float mean = 0f, mean_n = 0f;
				while (count < n) {
					count++;
					System.out.println("Введите  " + count + " ччисло");
					var num = scan.nextInt();
					if (num % 2 == 0) {
						sum += num;
						quant++;
						mean = sum / quant;
					} else {
						sum_n += num;
						quant_n++;
						mean_n = sum / quant;
					}
				}
				System.out.println("Сумма нечётных чисел = " + sum_n + "\n	чётных чисел = " + sum);
				System.out.println("Количество нечётных чисел = " + quant_n + "\n	чётных чисел = " + quant);
				System.out.printf("Среднее значение нечётных чисел = %.3f\n	чётных чисел = %.3f", mean_n, mean);
				scan.close();
			}//lll
		}