package day34_accessModifier_Encapsulation;

public class C01 {

	private int sayiPrivate=10;
	// SADECE İÇİNDE BULUNDUĞU CLASS TAN ULAŞILABİLİR.!!!!!!!!!!!!!!!!!
	int sayiDefault=20;
	// SADECE İÇİNDE BULUNDUĞU CLASS VE PACKAGE DEN ULAŞILABİLİR.!!!!!!!!!!!!!!!!
	// diğer adı Package Access Modifier.
	protected int sayiProtected=30;
	// İÇİNDE BULUNDUĞU CLASS PACKAGE VE BAŞKA PACKAGE DEKİ CHİLDCLASS TAN ULAŞILABİLİR.!!!!!!!!!!!!!!
	public int sayiPublic=40;
	// BUNA HERYERDEN ULAŞILABİLİR.!!!!!!!!!!!!!!!!!!!!!!
	
	public static void main(String[] args) {

		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
	}
	
	public void staticOlmayanMethod() {
		
		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
		
	}

}
