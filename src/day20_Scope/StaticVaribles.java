package day20_Scope;

public class StaticVaribles {

	static int no=20;
	static int sayı;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	
	public static void main(String[] args) {
		// static variable larar main method dan direk ulaşılabilir mi ? EVET
		System.out.println(no); // 20 
		no++;
		System.out.println(no); // 21
		staticMethod();
		System.out.println(no); //22
		
		StaticVaribles obje=new StaticVaribles();
		obje.staticOlmayanMethod();
		System.out.println(no); // 23
		
	}
	public static void staticMethod() {
		// static variable lara main method dan direk ulaşılabilir mi ? EVET
		no++;
		System.out.println("Static method da no:" + no);//22
	}
	
	public void staticOlmayanMethod() {
		//static variable lara main method dan direk ulaşılabilir mi ? EVET
		//static variable lara static olan olmayan tüm methodlardan ulaşılabilir.
		// bu yüzden static variable lara class variable denir.
		no++;
		System.out.println("static olmayan method da no: "+ no);
				
	}
}
