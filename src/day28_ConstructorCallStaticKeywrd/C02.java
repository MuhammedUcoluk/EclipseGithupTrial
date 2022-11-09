package day28_ConstructorCallStaticKeywrd;

public class C02 {
	
	int x=5;
	static int y=10;
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 3 obje oluşturalım değişimleri gözelyelim.
		
		C02 obje1=new C02();
		System.out.println("obje1 için x : " + obje1.x + " obje1 için y : " + y); // 5 10
		
		obje1.x++;
		y++;
		
		System.out.println("obje1 için x : " + obje1.x + " obje1 için y : " + y); // 6 11
		
		
		
		C02 obje2=new C02();
		System.out.println("obje2 için x : " + obje2.x + " obje2 için y : " + y); // 5 11
		
		obje2.x++;
		y++; // STATİC OLDUĞUNDAN BURADA ALDIĞI DEĞER KALICI OLDU
		
		System.out.println("obje2 için x : " + obje2.x + " obje2 için y : " + y); //6 12
		
		System.out.println(" onje 2 oluşturulduktan ve işlemden sonra obje1 in x i : "+ obje1.x + " y : " + obje1.y); // 6 12
		
		C02 obje3=new C02();
		 // AYNI CLASS İÇİNDE İKEN STATİC VARİABLE YA ULAŞMAK İÇİN OBJE YE İHTİYAÇ YOKTUR. KULLANIRSAK JAVA CTE VERMEZ
		// FAKAT STATİC VARİABLE YA STATİC YOLDAN ULAŞ DİYE BİZİ UYARIR.
		// SOLDAKİ ÜNLEMLER ONDAN KAYNAKLI.
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
