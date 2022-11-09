package day33_StringBuilder;

public class C06_SubSquance {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("Java ne kadar kolay");
		
		System.out.println(sb.substring(14)); //kolay
		
		System.out.println(sb.subSequence(14, 19)); //kolay
		
		// ikisi de aynı sonucu döndürür.
		// ancak substrin() sytingclass ından geldiği için 
		// substring() kullanıldığından arkasından string methodlar kullanılabilir.
		// Ancak Subsquance kullanıldığında bu mümkün olmaz.
		


	}

}
