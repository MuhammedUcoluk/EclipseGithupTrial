package day36_İnheritance;


class Derived{
	
	public Derived(String temp) {
		
		System.out.println("Derived class" + temp);//5
	}
		
	}

public class Test01 extends Derived {
public Test01 (String temp) { //3 Samet
	super(temp);//4
	System.out.println("Test class" + temp);//6  
	
}
	@SuppressWarnings("unused")
	public static void main(String[]args) { //1
		Test01 obj = new Test01 ("Samet"); //2
		
	}

}
