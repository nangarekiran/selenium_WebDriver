package programforInterview;

public class SwapValueWithoutuse3rdVariable {
	public static void main(String[] args) {
		/*int a=10; int b=20;
		b=b-a;
		a=b+a;
		System.out.println(a+" value of a");
		System.out.println(b+" Value of b");*/
		// using the third variable
		int a=43,b=34, t;
		t=b;
		b=a;
		a=t;
		System.out.println("value of a ="+a);
		System.out.println("Value of b="+b);
		
	}
}
