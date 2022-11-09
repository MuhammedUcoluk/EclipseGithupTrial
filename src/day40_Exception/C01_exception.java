package day40_Exception;

public class C01_exception {

	public static void main(String[] args) {
		 
		int a=20;
		int b=0;
		
		
		

		
		try {
			System.out.println("sayıların bölümü : " + a/b);
		} catch (ArithmeticException e) {
		   System.out.println("sıfıra bölüm yapılamaz.");
		   //System.out.println(e.getMessage()); // / by zero exception un kaynağını gösterdi.
		  // e.printStackTrace();//java.lang.ArithmeticException: / by zero
			//at day40.C01_exception.main(C01_exception.java:15)
		}
		
		System.out.println("Görev tamamlandı");
		
		
		
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at day40.C01_exception.main(C01_exception.java:10)

	}

}
