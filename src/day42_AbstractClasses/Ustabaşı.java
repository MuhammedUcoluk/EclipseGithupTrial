package day42_AbstractClasses;

public class Ustabaşı extends İşçi{

	public void statu() {
		System.out.println("Bu classtaki tüm personle ustabaşıdır... İmza:USTABAŞI");
	}
	public void maas() {
		System.out.println("Ustabaşılar aylık 10000 TL maaş alır... İmza:USTABAŞI");
	}
	public void mesai() {
		System.out.println("Ustabaşı arıza durumunda arıza çözülünceye kadar çalışır... İmza:USTABAŞI");
	}
	
	// OBJE OLUŞTURDUĞUMUZ EN ALTTAKİ CLASS PARENT CLASS TAKİ METHODLARI OVERRİDE EDİNCE CLASS TAN OLUŞTURULAN OBJELER EN DOĞRU
	// VE SPESİFİK ÖZELLİKLERE KAVUŞTU!!!
	
	// AMA KLASİK PARENT CHİLD İLİŞKİSİNDE TÜM METHODLARI OVERRİDE ETME MECBURİYETİ YOKTUR.
	//JAVA PARENT CLASSLARDAKİ TÜM METHODLARI OVERRİDE ETMEK MECBURİYETİ KZAANDIRMAK İÇİN ABSTRACT CLASS YAPISINI OLUŞTURMUŞTUR!!!
	// YANİ BİR CLASSI ABSTRACT OLARAK TANIMLARSANIZ CHİLD CLASSLAR TÜM METHODLARI OVERRİDE ETMEK ZORUNDA KALIR.
	
	//***DOLAYISI İLE ABSTRACT YAPTIĞIMIZ PARENT CLASSLAR SADECE KALIP GÖREVİ YAPACAKLAR***
	public static void main(String[] args) {
		
		
		
		Ustabaşı ust1=new Ustabaşı();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();

	}

}
