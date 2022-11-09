package day38_Overriding;

public class KümesHayvanları extends Kuşlar {

	public static void main(String[] args) {
		
		
		KümesHayvanları kms1=new KümesHayvanları();
		kms1.beslenme(); //Tüm hayvanlar belenir ANİMALS
		kms1.hareket();	 //Kümes hayvanları yürüyerek hareket eder. KÜMESHAYVANLARI
		kms1.solunum();	//Kuşlar akciğerleriyle nefes alır KUŞLAR
		
		Kuşlar kms2=new KümesHayvanları();
		kms2.beslenme();	//Tüm hayvanlar belenir ANİMALS
		kms2.hareket();		//Kümes hayvanları yürüyerek hareket eder. KÜMESHAYVANLARI
		kms2.solunum();		//Kuşlar akciğerleriyle nefes alır KUŞLAR
		//Kendi spesifik özellikleri dışında kuşlara tabi oluyor
		//ama spresifik bir durumu varsa farkını ortaya koyar.
		
		
		 
		Kuşlar kms3=new Kuşlar();
		kms3.beslenme();	//Tüm hayvanlar belenir ANİMALS
		kms3.hareket();		//Kuşlar uçarak hareket eder KUŞLAR
		kms3.solunum();		//Kuşlar akciğerleriyle nefes alır KUŞLAR
		
		Animals kms4=new KümesHayvanları();
		kms4.beslenme();
		kms4.hareket();
		kms4.solunum();

	}
	public void hareket(){
		System.out.println("Kümes hayvanları yürüyerek hareket eder.");	
		
		}
		
	
}
