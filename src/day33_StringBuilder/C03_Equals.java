package day33_StringBuilder;

public class C03_Equals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Java");
		
		StringBuilder sb2=new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		
		// STRİNG BUİLDER DA EQUALS METHODU STRİNG TEKİ MANTIKLA ÇALIŞMAZ , == MANTIĞI İLE ÇALIŞIR!!!
		
		// sb DE KARŞILAŞTIRMA YAPMAK İÇİN AŞAĞIDAKİ COMPARETO KULLANILIR.
		
		System.out.println(sb1.compareTo(sb2)); //0

		// ilk harflerden başlayarak birebir sb ları karşılaştırır.
		// Eğer tüm karakterler aynı ise sonuç olarak 0 döner.
		// farklı karakter bulursa ilk yazılan sb, ikinci yazılandan kaç char öndeyse onu döner.
		
		// Eğer iki sb nin eşit olup olmadığını anlamak istersek 
		//if (sb1.compareTo(sb2)==0); ile bakabiliriz.
		
		String str="Java";
		//System.out.println(sb1==str); == sb ile stringi karşılaştıramaz.
		
		System.out.println(sb1.equals(str)); // false döndürür. sb ile string karşılaştırılamaz.
		//System.out.println(sb1.compareTo(str)); compare to string için kullanılamaz.
		
		//System.out.println(sb1=="Java");
	}

}
