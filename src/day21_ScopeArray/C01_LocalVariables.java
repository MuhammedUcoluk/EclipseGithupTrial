package day21_ScopeArray;

public class C01_LocalVariables {
	
	String okulİsmi; // bunu oluşturmamızın sebebi bütün methodlarda kullanabilelim diye.
	
	public static void main(String[] args) {
		//Java local lere default değer ataması yapmaz.
		
		// kodlarımızda sorun yaşamamak için oluşturduğumuz variable lara uygun bir değer ataması yapmamızda fayda var.
		
		 @SuppressWarnings("unused")
		int sayı=0; //int sayi; dersek java cte verir
	
		//bir localde 1den fazla aynı isimde variable OLUŞTURULAMAZ.
		//int sayi;
		//String sayi; // data türü farklı olsa da isim aynı java izin vermez.
		 @SuppressWarnings("unused")
		String isim="Ali";
	}
		
		public static void staticMethod() {
		
			//sayi; // bir localde oluşturulan variable (methodların static olup olmamasına bağlı 
			// olmaksızın) farklı bir localde kullanılamaz.
		@SuppressWarnings("unused")
		String isim="Veli";
	}

}
