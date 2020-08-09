package day12abstract;

public class Bisiklet extends  Arac {

	public Bisiklet(int hiz, int vites) {
		super(hiz, vites);
		
	}

	@Override
	void vitesAt(int vites) {
		setVites (vites);
		System.out.println("Bisiklet vitesi " + getVites() +" e atildi.");
		
	}

	@Override
	void hizArtir(int hiz) {
		setHiz(hiz);
		System.out.println("Bisiklet hizi " + getHiz()+ " seviyesine cikarildi.");
		
	}

}