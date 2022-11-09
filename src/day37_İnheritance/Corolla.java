package day37_İnheritance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayısı=4;
	String uretimYeri="Türkiye";
	
	public static void main(String[] args) {
		
			Corolla 			arb1		=			new 		Corolla();
	//Class ismi&& Data Türü	Obje ismi	Assignment	keyword		Constructor
		
		// Java da oluşturduğumuz her class ismi aynı zamanda bir data türüdür.
		// Bu örneğimiz için Corolla hem class adı hem de oluşturduğumuz arb1 objesinin data type dır. ( int strng gibi!!!)
		// Java da obje üretilen her bir class aynı zamanda non-primitive data türü olur.
		
		System.out.println(arb1.calısıyorMu);//true
		System.out.println(arb1.tekerSayısı);//4
		System.out.println(arb1.uretimYeri);//Türkiye
		
		Toyota arb2=new Corolla();
		System.out.println(arb2.calısıyorMu);//true
		System.out.println(arb2.tekerSayısı);//0
		System.out.println(arb2.uretimYeri);//Japonya
		
		Araba arb3=new Corolla();
		System.out.println(arb3.calısıyorMu);//true
		System.out.println(arb3.tekerSayısı);//0
		
		
	}
	
}
