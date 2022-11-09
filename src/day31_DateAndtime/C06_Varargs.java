package day31_DateAndtime;

public class C06_Varargs {

	public static void main(String[] args) {
		// Verilen sayılar toplayan bir method oluşturmak istiyorum.
		//
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		
		
		topla(a,b);					//iki sayının toplamı : 30
		topla(a,b,c);				//üç sayının toplamı : 60
		topla(a,b,c,d);				//varargs çalışır
		topla(a,b,c,d,e);			//varargs çalışır
		topla(a,b,c,d,e,f);			//varargs çalışır
										

		
		// Şu ana kadar gördüğümüz tekniklerle değişken sayıda parametreli bir method oluşturamayız.
		//VARİATY ARGUMENTS
		
	}

	private static void topla(int...a) {          // BUNUN AÇILIMI İNTEGER OLSUN KAÇ TANE YOLLARSAN YOLLA
		System.out.println("varargs çalışır");
		
	}

	private static void topla(int a, int b, int c) {
		System.out.println("üç sayının toplamı : "+  (a+b+c));
		
	}

	private static void topla(int a, int b) {
		System.out.println("iki sayının toplamı : "+  (a+b));
		
	}

}
