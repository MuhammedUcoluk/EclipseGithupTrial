package day33_StringBuilder;

public class C01_AppendCapasity {

	public static void main(String[] args) {
		
		
		StringBuilder sb=new StringBuilder();
		
		sb.length();    // StringBuilder ın uzunluğunu verir.
		System.out.println(sb.length()); //0 lenght kullanılan kısmın uzunluğunu verir.
		
		sb.capacity();
		System.out.println(sb.capacity()); // 16 kararkter çıkacak şekilde StringBuilder oluşturmuştuk.
		
		StringBuilder sb2=new StringBuilder("Java Candır");
		
		sb2.length();    // StringBuilder ın uzunluğunu verir.
		System.out.println(sb2.length()); //11 lenght kullanılan kısmın uzunluğunu verir.
		
		sb2.capacity();
		System.out.println(sb2.capacity()); // 27 
		
		StringBuilder sb3=new StringBuilder(7);
		sb3.append("Mehlika");
		
		sb3.length();    // StringBuilder ın uzunluğunu verir.
		System.out.println(sb3.length()); //7 lenght kullanılan kısmın uzunluğunu verir.
		
		sb3.capacity();
		System.out.println(sb3.capacity()); // 7 
		
		
		StringBuilder sb4=new StringBuilder(7);
		
		sb4.length();    // StringBuilder ın uzunluğunu verir.
		System.out.println(sb4.length()); //0 lenght kullanılan kısmın uzunluğunu verir.
		
		sb4.capacity();
		System.out.println(sb4.capacity()); // 7 
		
		sb4.append("Nilgün");
		System.out.println(sb4.length()); //6
		System.out.println(sb4.capacity());//7
		
		sb4.append(" candır");
		System.out.println(sb4.length()); //13
		System.out.println(sb4.capacity());//16 KAPASİTEYİ *2+2 İLE İLE BULUYOR. BAŞTAKİ KAPASİTEYİ 2 İLE ÇARPIP 2 EKLİYOR.
		
		sb.append("Java");
		System.out.println(sb); // Java
		
		sb.append(" Candır");
		System.out.println(sb); // Java Candır
		
		sb.append("anlasıldı mı", 3, 6);
		System.out.println(sb);  //Java Candırası
		
		

		
		
		
	}

}
