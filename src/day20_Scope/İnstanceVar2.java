package day20_Scope;

public class İnstanceVar2 {
	
	String adres="Ankara";
	String dogumYeri;
	double notOrtalaması;
	double yasOrt=12.3;
	char cinsiyet='E';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;
	
	public static void main(String[] args) {
		// instance variblelara main method dan direk ulaşılabilir mi? HAYIR
		// Nasıl ulaşılabilir ? OBJE OLUŞTURARAK.
		
		İnstanceVar2 ali=new İnstanceVar2();    //OBJEYİ OLUŞTURDUK
		System.out.println(ali.adres); //ANKARA
		System.out.println(ali.dogumYeri); // null
		System.out.println(ali.notOrtalaması); //0.0
		System.out.println(ali.yasOrt); // 12.3
		System.out.println(ali.cinsiyet); // E
		System.out.println(ali.karakter); // space
		System.out.println(ali.ogrenciMi); // true
		System.out.println(ali.izinliMi); // False
		
		
	}
	public static void staticMethod() {
		// instance variblelara static method dan direk ulaşılabilir mi? HAYIR
				// Nasıl ulaşılabilir ? OBJE OLUŞTURARAK.
		
	}

	public void staticOlmayanMethod() {
		// instance variblelara static olmayan method dan direk ulaşılabilir mi? EVET
				
		
	}
}
