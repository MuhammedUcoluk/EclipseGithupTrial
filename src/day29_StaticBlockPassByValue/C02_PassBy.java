package day29_StaticBlockPassByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		// 100 tl ye satılan ürün için iki farklı indirim uygulayan iki farklı method oluşturalım.
		
		int fiyat=100;
		
		indirimyap10(fiyat);
		System.out.println("method dan sonra main method daki fiyat : " + fiyat); // 100
		indirimyap25(fiyat);
		System.out.println("method dan sonra main method daki fiyat : " + fiyat); // 100
	}

	private static void indirimyap25(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat : " + fiyat); // 75
		
	}

	private static void indirimyap10(int fiyat) { // 90
		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat : " + fiyat);
		
	}

}
