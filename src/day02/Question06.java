package day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {

		//kullanicidan alinan negatif,pozitif yada notr olma durumunu ternary de yazalim
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lüften bir sayi giriniz");
		 int sy = sc.nextInt();
		 String result = sy==0 ? "notr" : sy>0 ? "sayi pozitif":"sayi negatif"; 
		 System.out.println(result);
		
		 sc.close();
	}

}
