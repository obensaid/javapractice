package day07;

public class AsalCozum {
	public static void main(String[] args) {
		// Asal sayiyi bulan bir method yazalim.
		
		asalSayi(343437);
		
		
		
	}
	public static int asalSayi(int num) {
		int count=0;
		for (int i = 1; i<=num; i++) {
			if(num%i==0) {  //11 11%1==0  11%2==0! 11%3==0!  11%11==0
				count++;		//1				1	1			2
			}
			
		}
		if(count==2) {
			System.out.println("Asal sayidir. " +num);
		}else {
			System.out.println("Asal sayi degildir.");
			
		}
		return num;
	}

}
