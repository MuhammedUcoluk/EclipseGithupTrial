package day37_İnheritance;

public class Toyota extends Araba {

	protected boolean pahalıMı;
	protected String uretimYeri="Japonya";
	
	public void method1() {
		System.out.println("Toyota classından method1 çalıştı");
	}
	public void method2() {
		System.out.println("Toyota classından method2 çalıştı");
	}
}
