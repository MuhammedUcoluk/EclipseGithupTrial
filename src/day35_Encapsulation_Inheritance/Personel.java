package day35_Encapsulation_Inheritance;

public class Personel {

	protected String isim;
	protected String soyisim;
	protected boolean calısıyorMu;
	protected String telNo;
	protected int yas;
	
	Personel(){
		System.out.println("Personel parametresiz contructor çalıştı");
	}
	// Variable ya access modifier yazmazsak java default değer atar.
	// böyle olursa sadece aynı package içindeki child class lar personel classını
	// inherit edebilir. Başka packagelerdeki child class laarın Personle class ını inherit edebilmesi için
	// variable ve methodların acc. modifierını protected yaparız.
	// Public yazsak ta inherit edilebilir ama biz herkesin değil sadece 
	// child class ların erismesini istediğimizden protected yaparız.
	
	
	public static void main(String[] args) {
		

	}

}
