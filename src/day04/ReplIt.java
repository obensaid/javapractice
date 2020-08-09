package day04;


import java.util.Scanner;



public class ReplIt {

	public static void main(String[] args) {
		//islem2();
		//daire();
		//dikdortgen();
		//ortalama();
		//degerlerToplami();
		//sayininDurumu();
		//kiyaslama();
		//haftaninGunu();
		//birdenYirmiyeKadar();
		//GirilenSayininCarpimTablosu();
		//birdenOnaKadararttirarak();
		//sesliHarf();
		elmasSorusu();
	
	}
	
	//================================================================================================================
	public static void islem1() {
		//a. -5 + 8 * 6

		//b. (55+9) % 9

		//c. 20 + -3*5 / 8

		//d. 5 + 15 / 3 * 2 - 8 % 3

		//Beklenen Sonuçlar :
		//43
		//1
		//19
		//13
		
		System.out.println(-5+(8*6));
		System.out.println((55+9)% 9);
		System.out.println(20+(-3*5)/8);
		System.out.println(5+15/3*2-8%3);
		
	}
	
	
	//================================================================================================================
	
	//Beklenen Sonuçlar:
		//125 + 24 = 149
		//125 - 24 = 101
		//125 x 24 = 3000
		//125 / 24 = 5
		//125 mod 24 = 5 
	
	
	
	
	public static void islem2() {
			  Scanner scan = new Scanner(System.in);
			  int num1 = scan.nextInt();
			  int num2 = scan.nextInt();
			  
			System.out.println(num1 +"+"+num2+" = "+(num1+num2)); 
			System.out.println(num1 +"-"+num2+" = "+(num1-num2));
			System.out.println(num1 +"x"+num2+" = "+(num1*num2));
			System.out.println(num1 +"/"+num2+" = "+(num1/num2));
			System.out.println(num1 +" mod "+num2+" = "+(num1%num2));
	
	}
	
	//================================================================================================================
	
	//Dairenin Çevresini ve Alanını hesaplayan Java kodunu yazınız. (r=7.5)
	//Not: Pi sayısı =  Math.PI 

	//Beklenen Çıktı: 
	//Dairenin Cevresi = 47.12388980384689
	//Daire Alani = 176.71458676442586
	
	public static void daire() {
		double r = 7.5;
		System.out.println("Dairenin Cevresi  = "+r*2*Math.PI);
		System.out.println("Dairenin Alani  = "+r*r*Math.PI);
	}

	//================================================================================================================
	//A kenar = 5.5
		//	B kenar = 3.2

		//	Beklenen Çıktı:
			//Dikdortgenin Cevresi = 17.4
		//	Dikdortgenin Alani = 17.6
	
	public static void dikdortgen() {
		double a = 5.5;
		double b = 3.2;
		
		System.out.println("Dikdortgenin Cevresi = "+2*(a+b));
		System.out.println("Dikdortgenin Cevresi = "+(a*b));
		
	}
	//================================================================================================================
	
	//Girilen 5 tam sayının orlatamasını hesaplayan Java kodunu yazınız.
	//Test Sayılar
	//10,20,30,40,50
	//Bekleen Çıktı
	//5 sayinin ortalamasi = 30
	
	public static void ortalama() {
		
	    Scanner scan = new Scanner(System.in);
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    int num3 = scan.nextInt();
	    int num4 = scan.nextInt();
	    int num5 = scan.nextInt();
	    System.out.println("5 sayinin ortalamasi = "+(num1+num2+num3+num4+num5)/5);
	   
	}
	
	//================================================================================================================
	
	//Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
	//Test Data
	//34
	//Beklenen Çıktı
	//7
	
	public static void degerlerToplami() {
		
		Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long adet = 0,toplam=0;
        
        while(n != 0)
        {
           toplam=(n%10)+toplam;
           n /= 10;
            ++adet;
        }
        
        
        System.out.println("Sayı Değerleri Toplama: " +toplam );
       
		
	}

	//================================================================================================================
	
	/*Girilen sayının pozitif,  negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.

	Test data :21
	Beklenen Çıktı:
	 Sayi Pozitif

	Test data :-15
	Beklenen Çıktı:
	 Sayi Negatif

	Test data :0
	Beklenen Çıktı:
	 Sayi Notr
	 */
	public static void sayininDurumu() {
		Scanner scan = new Scanner(System.in);
	     System.out.print("Input number: ");
	     int input = scan.nextInt();
	     if (input<0) {
	    	 System.out.println("Sayi Negatif");
		}else if (input>0) {
			 System.out.println("Sayi Pozitif");			
		}else {
			System.out.println("Sayi Notr");
		}
	}
	 
	//================================================================================================================

		/*iki sayıyı kıyaslayan Java kodunu yazınınz.
		
		Kullanılacak Operatörler 
		Büyüktür >
		Küçüktür <
		Büyük yada eşit =>
		Küçük yada eşit =<
		Eşittir ==
		Eşit değildir !=
		
		Kullanılacak sayılar 25 ile 39
		 
		Beklenen Örnek Çıktı:
		25 != 39                                                                          
		25 < 39                                                                           
		25 <= 39
		*/
	public static void kiyaslama() {
		  Scanner scan = new Scanner(System.in);
	        int number1 = scan.nextInt();
	        int number2 = scan.nextInt();
	        if (number1<number2) {
	        	System.out.println(number1+" != "+number2);
	        	System.out.println(number1+" < "+number2);
	        	System.out.println(number1+" <= "+number2);	
			}else if (number1>number2) {
				System.out.println(number1+" != "+number2);
	        	System.out.println(number1+" > "+number2);
	        	System.out.println(number1+" >= "+number2);		        
				
			}else if (number1==number2) {
				System.out.println(number1+" == "+number2);
	        	System.out.println(number1+" <= "+number2);
	        	System.out.println(number1+" >= "+number2);	
				
			}
		
	}
	//================================================================================================================
	/*Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.

	Test Data:
	12
	34
	23

	Beklenen Çıktı:
	En Buyuk Sayi: 34
	*/
	public static void buyukSayi() {
		  Scanner scan = new Scanner(System.in);
		   
		   int num1 = scan.nextInt();
		   int num2 = scan.nextInt();
		   int num3 = scan.nextInt();
		   
		   if (num1>num2&&num1>num3) {
			   System.out.println("En Buyuk Sayi: "+num1);			
		}else if (num2>num1&&num2>num3) {
			System.out.println("En Buyuk Sayi: "+num2);	
		}else if (num3>num1&&num3>num2) {
			System.out.println("En Buyuk Sayi: "+num3);	
		}
		
	}
	//================================================================================================================
	
	/*1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.

	Test Data :
	3
	Beklenen Çıktı:
	Carsamba

	Test Data:
	1
	Beklenen Çıktı:
	Pazartesi
	*/
	public static void haftaninGunu() {
		 Scanner scan = new Scanner(System.in);
	     int day = scan.nextInt();
	     
	     switch (day) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Gecersiz gun girdiniz");
			break;
		}
	     	
	}
	//================================================================================================================
	/* 1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve  o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

	Test Data:
	2
	2016
	 
	Beklenen çıktı:
	2016 yili Subat ayi 29 gun

	Test Data:
	4
	1998

	Beklenen Çıktı:
	1998 yili Nisan ayi 30 gun
	*/
	public void yilGunAyHesabi() {
		 Scanner scan = new Scanner(System.in);
	     int month = scan.nextInt();
	     int year = scan.nextInt();
	}
	//================================================================================================================
	/*1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
	Hint: For döngüsü kullanınız.


	Beklenen Çıktı:
	1
	2
	3
	4
	.
	.
	.
	19
	20
	*/
    public static void birdenYirmiyeKadar() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i+" ");
		}
	} 
  //================================================================================================================  
     /*
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

		Örnek Sonuç: 
		5 x 1 = 5                                                                                                    
		5 x 2 = 10                                                                                                    
		5 x 3 = 15                                                                                                    
		5 x 4 = 20                                                                                                    
		5 x 5 = 25                                                                                                    
		5 x 6 = 30                                                                                                    
		5 x 7 = 35                                                                                                    
		5 x 8 = 40                                                                                                    
		5 x 9 = 45                                                                                                    
		5 x 10 = 50
      */
    public static void GirilenSayininCarpimTablosu() {
    	  Scanner scan = new Scanner(System.in);
    	  int num1 = scan.nextInt();
    	  for (int i = 1; i <= 10; i++) {
		System.out.println(num1+" x "+i+" = "+(num1*i));
		}
	}
    
  //================================================================================================================  
    
    /*1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

    Beklenen çıltı:
                                                                                      
   1                                                                                                       
   12                                                                                                       
   123                                                                                                       
   1234                                                                                                       
   12345                                                                                                       
   123456                                                                                                       
   1234567                                                                                                       
   12345678                                                                                                      
   123456789                                                                                                     
   12345678910
   */
    public static void birdenOnaKadararttirarak() {
		
    	int i, j;

        for (i = 1; i <= 10; i++) {

            for (j = 1; j <= i; j++) {
            	System.out.print(j);
            }
            
            System.out.println();
            
}
    }
  //================================================================================================================  
    
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data: 
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data: 
    we  yada %

    Beklenen Çıktı: 
    Yanlis karakter girdiniz!
    */
    
    public static void sesliHarf() {
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("lutfenbir harf giriniz");
    	 String str=scan.next();
         str=str.toLowerCase();
         int num=str.length();
         char ch=str.charAt(0);
    	 
         if ((ch<'a') || (ch>'z') ){
             System.out.println("Yanlis karakter girdiniz!");
           }else if(num>1){
            System.out.println("Yanlis karakter girdiniz!");
           }
           else if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
             System.out.println(ch +  " harfi sesli harfdir");
           }else {
             System.out.println(ch + " harfi sesiz harftir");
           }	 
    	
    }
    
  //================================================================================================================   
         
         public static void elmasSorusu() {
        	 
         String elmas="*************";
		  
		  System.out.println("      "+elmas.substring(6,7)+"        ");
		  System.out.println("     "+elmas.substring(5,8)+"     "); 
		  System.out.println("    "+elmas.substring(4,9)+"    ");
		  System.out.println("   "+elmas.substring(3,10)+"   "); 
		  System.out.println("  "+elmas.substring(2,11)+"  ");
		  System.out.println(" "+elmas.substring(1,12)+" "); 
		  System.out.println(elmas.substring(0,13));
		  System.out.println(" "+elmas.substring(1,12)+" "); 
		  System.out.println("  "+elmas.substring(2,11)+"  ");
		  System.out.println("   "+elmas.substring(3,10)+"   "); 
		  System.out.println("    "+elmas.substring(4,9)+"    ");
		  System.out.println("     "+elmas.substring(5,8)+"     "); 
		  System.out.println("      "+elmas.substring(6,7)+"      ");
		  
		
		  
		    for (int i=1;i<=7;i++){
		      for (int j=1;j<=7-i;j++){
		      System.out.print(" ");}
		     for (int k=1;k<=2*i-1;k++ ){
		      System.out.print("*");}
		      
		       System.out.println("");
		      
		    }
		    for (int i=1;i<=6;i++){
		      for (int j=1;j<=i;j++){
		      System.out.print(" ");}
		     for (int k=1;k<=13-2*i;k++ ){
		      System.out.print("*");}
		    System.out.println("");
		    
		  }
		
		
		  
		  
   
         	}
       //================================================================================================================   
		
        /* Ugly Number: 
        	 
        	 Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.


        	 Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

        	 Test Data:
        	 13

        	 Beklenen çıktı:
        	 ugly number  degildir

        	 Test Data:
        	 25
        	 Beklenen Çıktı:

        	 ugly number
        	 */
         public static void uglyNumber() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir  sayi giriniz");
			int num =scan.nextInt();
			
        	 
		}
   

}
  
//================================================================================================================   			

				

    
	



