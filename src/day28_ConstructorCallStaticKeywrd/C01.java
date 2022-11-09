package day28_ConstructorCallStaticKeywrd;

public class C01 {

	int x=3;
	int y=5;
	
	C01(){
		x+=1;
		System.out.println("-x"+ x);
	}
	C01(int i){
		this();
		
		this.y=i;
		x+= y;
		System.out.println("-x"+ x);
	}
	C01(int i , int i2){
		this(3);
		
		this.x-=4;
		System.out.println("-x"+ x);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	C01 mc1=new C01(4,3);
	// Constructor çalışmaya başladığıktan sonra x ve y üzerindeki değişmeler. instance variables olduğundan
	// x ve y üzerindeki değişmeler sadece C01 objesini ilgilendirir.
	// Constructor un işi bittiğinde x ve y değerleri eski halini alır.
	
	}

}
