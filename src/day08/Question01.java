package day08;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
	/* Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, 
	 * değilse sessiz harf olduğunu ekrana yazdırsın. 
	 * Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı gostersin. 
	 * (Test girilen harfi buyuk yada kucukluğune duyarlıdır.)
​
Sesli harfler: a,e,i,o,u
​
Test Data: 
a
​
Beklenen cıktı:
a harfi sesli harfdir.
*/
		
		Scanner input =new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz.");
		String in =input.next().toLowerCase();
		
		boolean uppercase = in.charAt(0)>='A' && in.charAt(0)<='Z';
		boolean lowercase = in.charAt(0)>='a' && in.charAt(0)<='z';
		
		boolean sesli =in.equals("a")||in.equals("e")||in.equals("i")||in.equals("o")||in.equals("u");
		
		if(in.length()>1) {
			System.out.println("Tek karakter giriniz");
		}else if (!(uppercase || lowercase)) {
			System.out.println("Yanlis karakter girdiniz");
		}else if(sesli) {
			System.out.println(in + " sesli harf");
		}else {
			System.out.println(in + " sesliz harf");
		}
		input.close();
	}

}




