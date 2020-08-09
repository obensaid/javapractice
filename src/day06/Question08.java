package day06;

public class Question08 {

	public static void main(String[] args) {

		//while dongusu ile 1 den 100 e kadar olan sayilarin toplamini bulalim
		int toplam  = 0;
		int sayi = 0;
		while (sayi<=100) {
			toplam = toplam +sayi;
			sayi++;
		}
		System.out.println(toplam);
	}
	

}
