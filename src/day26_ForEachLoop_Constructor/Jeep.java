package day26_ForEachLoop_Constructor;

public class Jeep {

	
		
		int ilanNo=1001;
		String marka;
		String model;
		int yıl=2001;
		int fiyat=10000;
		
		public void hız(int hız) { 
		System.out.println("araba saatte " + hız + " km yapar");
		
		
	}
		
		public void yakıt(String yakıt) {
			
			System.out.println("araba yakıt olarak " + yakıt + " kullanır");
		}
}
