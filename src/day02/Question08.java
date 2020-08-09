package day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
	// Kullanıcından 2 sayı alalım ve bunların birbirleriyle olan durumunu karşılaştırakım.
		
		/* 12 15      		12 < 15  12 != 15
		 * num1 > num2
		 * num1 < num2
		 * num1= num2
		 * num1 != num2
		 *  num1 <= num2
		 *  num1 >= num2
		 * 
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 1.sayiyi giriniz");
		int num1 = scan.nextInt();
		System.out.println("lutfen 2.sayiyi giriniz");
		int num2 = scan.nextInt();
		
		if (num1==num2) {
			System.out.println(num1+ "="+ num2);
			
		}if (num1!=num2) {
			System.out.println(num1+ "!="+ num2);
			
		}if (num1<num2) {
			System.out.println(num1+ "<"+ num2);
			
		}if (num1<=num2) {
			System.out.println(num1+ "<="+ num2);
			
		}if (num1>num2) {
			System.out.println(num1+ ">"+ num2);
			
		}if (num1>=num2) {
			System.out.println(num1+ ">="+ num2);
		}
		scan.close();
	}

}
