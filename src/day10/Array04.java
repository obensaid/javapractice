package day10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array04 {

	public static void main(String[] args) {
		// Klavyeden girilecek plaka numarasından ili gösteren uygulamayı yazalım

        /*      "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
                "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
                "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
                "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
                "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
                "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
                "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
                "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
​
         */
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lutfen il plaka numarasi giriniz.");
		//int plaka = input.nextInt();
		String Sehirler [] = {"","Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
                "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
                "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
                "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
                "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
                "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
                "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
                "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		
		//System.out.println("Girilen Plaka Numarasi " +Sehirler [plaka] +" iline aittir.");
		int plaka = Byte.valueOf(JOptionPane.showInputDialog("Lutfen Plaka Numarasi Giriniz"));
		JOptionPane.showMessageDialog(null,Sehirler[plaka]);
int placa = Byte.valueOf(JOptionPane.showInputDialog("merhaba nasilsin"));
JOptionPane.showMessageDialog(null, Sehirler[plaka]);
	}

}
