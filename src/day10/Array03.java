package day10;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		 //Kullanicidan 5 adet tam sayi girmesini isteyelim ve bu sayilari bir 
		// arrayde toplayalim,
        // içindeki çift sayilarin sayisini yazdiralim
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen 5 tane sayi giriniz");
		int [] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		int count =0;
		for (int i = 0; i < nums.length; i++) {
		if(nums[i]%2==0)
			count++;
			
		}
		for (int i : nums) {
			if(i%2==0)
				count++;
			
		}
		System.out.println("Girilen sayilardaki cift sayi adedi: " +count);
		
		

	}

}