package programforInterview;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=25;
		int n=0;
		int n1=1;
		int n3;
		System.out.print(n);
		System.out.print(" "+n1);
		for(int i=1; i<25; i++) {
			n3=n+n1;
			System.out.print(" "+ n3);
			n=n1;
			n1=n3;
		}
	}

}
