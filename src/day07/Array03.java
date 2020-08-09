package day07;

public class Array03 {

	public static void main(String[] args) {
		// Array elemanlarinin ortalamasini bulan java kodu yazalim.
		// 20,30,40,25,-15,55
		
		int [] num= {20,30,40,21,-15,55};
		double sum=0;
		double ort =0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			
		}
		ort=sum/num.length;
		System.out.println(sum);
		System.out.println("Arrayin eleman sayilarinin ortlamasi: " + ort);
		
		
		
		

	}

}
