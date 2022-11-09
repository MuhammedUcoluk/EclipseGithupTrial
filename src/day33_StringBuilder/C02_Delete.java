package day33_StringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		
		
		StringBuilder sb=new StringBuilder("Java Candır can");
		
		sb.deleteCharAt(14);	// 14 üncü indexteki n yi sildi.
		System.out.println(sb); //Java Candır ca 12
		
	//	sb.delete(12, 14); // 12 ve 14 arasındaki ca yı sildi. /** ilk index inclusive ikinci index exclusive
		//System.out.println(sb); //Java Candır 
		
		sb.delete(12, sb.length());
		System.out.println(sb); // Java candır 
		System.out.println(sb.capacity()); //31
	
	}

}
