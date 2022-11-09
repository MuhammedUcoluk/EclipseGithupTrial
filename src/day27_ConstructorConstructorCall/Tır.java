package day27_ConstructorConstructorCall;

public class Tır {

	
		int yıl=2000;
		String renk;
		String model;
		int km;
		boolean satılıkMı;
		

		public Tır(int i, String string, String string2, int j, boolean b) {
			//int km,String model,String renk, int yıl,boolean satılıkMı
			// Tır runner clasından yolladıgımız değerlerin instance variable lar ile eşleşmesi için 
			// atamalar yapmamız lazım.
			km=i;
			model=string;
			renk=string2;
			yıl=j;
			satılıkMı=b;
			
	}


		public Tır(int km, String model, String renk) {
			// i , string ve string2 güzel durmuyor. kodu sonradan incelerken anlaşılır durmuyor.
			// Daha anlaşılıt olması için variable isimlerini anlamlı yapalım.
			
			//int km,String model,String renk
			
			this.km=km;
			this.model=model;
			this.renk=renk;
			
			//   Başına this. yazdığımızda java bu variable nin classleveldeki olduğunu anlar.
		}
		
		
		
		
		
	

}
