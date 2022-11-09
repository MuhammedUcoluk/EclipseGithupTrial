package day34_accessDeneme;

import day34_accessModifier_Encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		
		
		C01 obj=new C01();
		//System.out.println(obj.sayiPrivate); SADECE KENDİ CLASSINDAN ULAŞILABİLİR
		//System.out.println(obj.sayiDefault); // SADECE AYNI PASKAGE DEKİLER ULAŞABİLİR.
		//System.out.println(obj.sayiProtected); AYNI PACKAGEDEKİ CLASS VE CHİLDCLASS LAR ULAŞABİLİR.
		System.out.println(obj.sayiPublic); // BUNA OBJE OLUŞTURUP BAŞKA PACKAGE DEN DE ULAŞILABİLİR.
		
		
	}

}
