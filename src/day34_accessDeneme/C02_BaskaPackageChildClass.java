package day34_accessDeneme;

import day34_accessModifier_Encapsulation.C01;

public class C02_BaskaPackageChildClass extends C01{ // EXTENDS UZANMAK DEMEK.BUNUNLA DAY34 C01 E UZANDIK

	public static void main(String[] args) {
		
		C01 obj=new C01();
		
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);
		//System.out.println(obj.sayiProtected); main method static bu variable static değil o sebeple ılaşamadık.
		System.out.println(obj.sayiPublic);

	}

	public void staticOlmayanMethod() {
		
		C01 obj=new C01();
		
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);
		System.out.println(sayiProtected); // Bu class da sayıProtected diye bir variable olmadığı halde parent class da 
		// var olduğu için Java problem yapmadı.
		System.out.println(obj.sayiPublic);
	}
}
