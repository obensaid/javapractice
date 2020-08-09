package day03;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// Kullanicidan boy CM  ve kilosunu alalim
		//BMI (VKE) hesaplayalım
		//BMI <=20 oldukca zayifsiniz
		//20<BMI<=25 Normal sinirlardasiniz 
		//25<BMI<=30 Sisman kategorisindesiniz
		//30<BMI ==> Obez grubundasiniz.
		//BMI = kilo /(boy*boy)
		
		Scanner input = new Scanner (System.in);
		System.out.println("Luften kilonuzu giriniz");
		int kilo = input.nextInt();
		System.out.println("Lutfen boyunuzu CM olarak giriniz");
		double boy = input.nextDouble()/100;
		
		double BMI= kilo/(boy*boy);
		
		System.out.println(BMI);
		
		if(BMI<=20) {
			System.out.println("Oldukce zayifsiniz");
		}else if (BMI>20 && BMI<=25) {
			System.out.println("Normal sinirlardasiniz");
		}else if (25<BMI && BMI<=30) {
			System.out.println("Sisman kategorisindesiniz");
		}else {
			System.out.println("Obez kategorisinizdesiniz.");
		}
         input.close();
	}

}