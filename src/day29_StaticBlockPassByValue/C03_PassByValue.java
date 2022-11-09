package day29_StaticBlockPassByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// Main Method dan diğer methodlara veyya diğer methodlardan Main Method a bir variable gönderirseniz;
		//Java orjinal variable yi değil oların değerlerini(VALUE) götürür.
		// Orjinal Variable nin değeri DEĞİŞMEZ!!!
		
				int fiyat=100;
				
				System.out.println(indirimyap10(fiyat)); //90
				System.out.println("method dan sonra main method daki fiyat : " + fiyat); // 100
				
				fiyat=indirimyap25(fiyat); // BURADA YAPTIĞIMIZ ATAMA KALICI OLDU
				// İNDİRİMİ KALICI YAPMAK İSTİYORSAN MAİN METHOD A ATAMA YAPMAMIZ GEREKLİ
				System.out.println("method dan sonra main method daki fiyat : " + fiyat); // 75
			}

			private static int indirimyap25(int fiyat) {
				fiyat*=0.75;
				
				return fiyat;
			}

			private static int indirimyap10(int fiyat) { // 90
				fiyat*=0.90; // BURADA YAPTIĞIN DEĞİŞİKLİK BURAYI BAĞLAR
				
				return fiyat;
				
	}

}
