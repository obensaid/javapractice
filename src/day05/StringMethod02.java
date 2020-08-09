package day05;

import java.util.Scanner;

public class StringMethod02 {

	public static void main(String[] args) {

		// name1 ve name2 sekilinde 2 string tanimlayalim.
				//name1 karakter sayisi cift ise  name2 yi name1 in oata kisminda icine yazsin.
				//mehmet 6
				//	ahmet 
				//mehahmetmet
				//name1 karakter sayisi telk ise  eklenemiyor.
				
		Scanner scan = new Scanner(System.in);
		
				String name1 = scan.nextLine();
				String name2 =scan.nextLine();
				
				boolean nameCift=name1.length()%2==0;
				
				String ilkKisim=name1.substring(0, name1.length()/2); //(0,]
				String ikinciKisim = name1.substring(name1.length()/2); //start, 
				
				if(nameCift) {
					System.out.println(ilkKisim +name2 + ikinciKisim);
				}else {
					System.out.println("Name1 karakter sayisi tektir.");
				}
		scan.close();	
	}

}
