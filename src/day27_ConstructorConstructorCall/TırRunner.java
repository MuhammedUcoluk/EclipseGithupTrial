package day27_ConstructorConstructorCall;

public class TırRunner {

	public static void main(String[] args) {
		
		// Bir tane tüm özellikleri değiştiren const. oluşturalım.
		
		Tır tır1=new Tır(	5000, 	"Axor" ,	 "Beyaz" ,	 2020 , 	false);
						////int km,String model,String renk, int yıl,boolean satılıkMı
		
		System.out.println(tır1.km +" " + tır1.model + " " + tır1.renk + " " + tır1.yıl + " " + tır1.satılıkMı);
							//5000 				Axor 			Beyaz 			2020 				false
		
		// ÜÇ ÖZELLİĞİ DEĞİŞTİREN BİR CONS.. OLUŞTURALIM.
		
		Tır tır2=new Tır(12000, "kar" , "Kırmızı");
		//int km,String model,String renk
		System.out.println(tır2.km +" " + tır2.model + " " + tır2.renk + " " + tır2.yıl + " " + tır2.satılıkMı);
							//12000 		kar 				Kırmızı			2000				false
	}

}
