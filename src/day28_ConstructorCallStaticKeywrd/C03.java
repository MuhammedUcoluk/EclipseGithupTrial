package day28_ConstructorCallStaticKeywrd;

public class C03 {

	public static void main(String[] args) {
		// JAVA RUN TİME BİR PROGRAMDIR. RUN TUŞUNA BASTIĞIMIZDA JAVA ÇALIŞMAYA BAŞLAR VE İŞLEMLERİ YAPAR.
		// jAVA NIN İŞİ BİTTİĞİNDE (ÇALIŞMA TUŞU KIRMIZIDAN SİYAHA DÖDÜĞÜNDE) HERŞEY BAŞA DÖNER.
		
		// STATİC VARİABLE VE METHODLAR BULUNDUKLARI CLASS İLE İLİNTİLİDİR. ( OBJE İLE DEĞİL CLASS İLE)
		// DOLAYISI İLE BAŞKA BİR CLASS TA İKEN C02 DEKİ STATİC VARİABLE VEYA METHODA ULAŞMAK İSTEDİĞİMİZDE
		// C02.staticVariableİsmi ve C02.staticMethodİsmi() YAZMAMIZ YETERLİ OLUR.
		
				C02 obje1=new C02();
				System.out.println("obje1 için x : " + obje1.x + " obje1 için y : " + C02.y); // 5 10
				
				obje1.x++;
				C02.y++; // c02 de static yaptığımızdan obje olmadan da ulaşabiliyoruz.
				// STATİC BİR VARİABLE YA CLASS İSMİ ÜZERİNDEN ULAŞMAK YERİNE
				// İNSTANCE VARİABLE LAR GİBİ OBJE İLE ULAŞMAYA ÇALIŞIRSAN
				// JAVA CTE VERMEZ AMA SOLDA ! İLE BİZİ UYARIR.
				// "static bir field olan C02 ye static yoldan ulaş" DER.
				System.out.println("obje1 için x : " + obje1.x + " obje1 için y : " + obje1.y); // 6 11
				
				
				
				C02 obje2=new C02();
				System.out.println("obje2 için x : " + obje2.x + " obje2 için y : " + obje2.y); // 5 11
				
				obje2.x++;
				obje2.y++; // STATİC OLDUĞUNDAN BURADA ALDIĞI DEĞER KALICI OLDU
				
				System.out.println("obje2 için x : " + obje2.x + " obje2 için y : " + obje2.y); //6 12
				
				System.out.println(" onje 2 oluşturulduktan ve işlemden sonra obje1 in x i : "+ obje1.x + " y : " + obje1.y); // 6 12
				
				C02 obje3=new C02();
				
				obje3.x=20;
				obje3.y=40; // y static olduğundan ne değer verdiysen hepsi için aynı
				
				System.out.println("obje 3 ten sonra obje 1 in x i : " + obje1.x  ); // 6 
				System.out.println("obje 3 ten sonra obje 2 in x i : " + obje2.x  ); // 6 
				System.out.println("obje 3 ten sonra obje 3 in x i : " + obje3.x  ); // 20
				
				System.out.println("obje 3 ten sonra obje 1 in y si : " + obje1.y  ); // 40
				System.out.println("obje 3 ten sonra obje 2 in y si : " + obje2.y  ); // 40
				System.out.println("obje 3 ten sonra obje 3 in y si : " + obje3.y  ); // 40
	}

}
