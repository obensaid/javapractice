package day12abstract;

public class Motor extends Arac {

	public Motor(int hiz, int vites) {
		super(hiz, vites);
		
	}

	@Override
	void vitesAt(int vites) {
		setVites(vites);
		System.out.println("Moturun vitesi " +getVites()+ " e atildi.");
		
	}

	@Override
	void hizArtir(int hiz) {
		setHiz(hiz);
		System.out.println("Motorun hizi " + getHiz() + " seviyesine cikarildi.");
	
		
	}

}