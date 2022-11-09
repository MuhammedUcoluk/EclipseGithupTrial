package day30_MutableımmutableDateTime;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		//Java da String 2 türlü oluşturulabilir
		//1.Non-Primitive olduğu için new keyword ile. //String str3=new String("Mustafa");
		// Java önce eşitliğin sağına baktığından new kelimesi olduğu için önce obje oluşturur, sonra değeri atar.
		// Yani bu oluşturma şeklinde her zaman yeni bir obje oluşur.
		
		// 2. Stringi bugüne kadar öğrendiğimiz gibi oluşturursak
		// String str2="Mustafa gibi.
		// Java bu durumda eşitliğin sağında olan String in STRİNG HAVUZUNDA olup olmadığını kontrol eder.
		// Havuzda varsa yeni obje oluşturmaz.
		// Yeni obje oluşturmadığı için öncekinin referansına yeni referansı da ekler.
		
		String str1="Mustafa";
		
		String str2="Mustafa";
		
		String str3=new String("Mustafa");
		String str4=new String("Mustafa"); // Burada önce obje oluşrutmuş. dolayısı ile == false verir.
		
		System.out.println(str1 == str3); //false // doubleequal yani (==) hem değere hem referansa bakar. referanslar aynı değil o yüzden false
		System.out.println(str1.equals(str3)); // true // equals sadece değere baktı o sebeple true
		
		System.out.println(str4==str3); // false
		System.out.println(str4.equals(str3)); // true,
		
		System.out.println(str1==str2); // true
		System.out.println(str1.equals(str2)); // true
	}

}
