package day21_ScopeArray;

public class C02_LoopVariables {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int sayi=10;
		
		for (int i = 0; i < 6; i++) {
			String isim="Ali";
			System.out.println(sayi); // 6 kere 10 yazdırır.
			System.out.println(sayi + " " + sayi); // 10 Ali yazdırır 6 defa.
		}
		// System.out.println(isim); bunu kabul etmez javva. loopun içinde oluşturduğun variable yı loop dışında kullanamazsın.
		//System.out.println(i); // bunda da aynı işem var. loop içinde oluşturulmuş.
		//LOOP DIŞINDA İHTİYACIMIZ OLAN BİR DEĞİŞKEN VARSA LOOP DAN ÖNCE OLUŞTURURUZ VE EMNİYETTE KALMAK İÇİN İLK DEĞER ATAMASI YAPARIZ.
		// forun üstündeki int sayı=10 gibi....!!!
		for (int i = 0; i < 10; i++) {
		//	int sayi=20; sayı variable si main method içinde oluşturulduğundan tüm main method da geçerlidir. Dolayısı ile
			// aynı isimde bir variable oluşturamazsınız.
			
			String isim="Ali"; // bunu kabul etti yukarıdaki String isim ali loopun içindeydi o yüzden yanlızca o body de geçerli.
		}
	}

}
