package day40_Exception;

public class C07_NumberFormatExceptions {

	public static void main(String[] args) {
		String str="123a"; // "123" olsaydı sıkıntı yoktu. yanına a koyunca hata verdi.  
		
		int sayı=Integer.parseInt(str)+4;
		System.out.println(sayı);

	}

}
