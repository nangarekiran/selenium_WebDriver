package programforInterview;

import java.util.Scanner;

public class NumericProgram {

	// prime number
	public static void main(String[] arg) {
		//sStringProgram.arryprime();
		//StringProgram.specificnumber();
		//NumericProgram.arryPrimenumerWithoutflag();
		NumericProgram.Fibonacci();
	}

	public static void arryprime() {
		int a[]= {7,5,9,12};
		Boolean flag=true;

		for(int i=0;  i<a.length; i++) {//5
			for(int j=2; j<a[i]/2; j++) {
				if(a[i]%j==0) {
					System.out.println("It is not prime number " +a[i]);
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("It is prime " +a[i]);
		}
	}
	public static void specificnumber() {
		System.out.println("Enter number to check prime or not");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("your provided number "+a);
		int count=0;
		for(int j=2; j<=a/2; j++) {
			if(a%j==0) {
				System.out.println("It's not a prime number "+a);
				count++;
				break;
			}
		}if(count==0) {
			System.out.println(" It's prime number "+a);
		}
	}
	public static void arryPrimenumerWithoutflag() {
		int u[]= {3,11,14,24,23,22};
		int count=0;
		boolean flag=true;
		for(int i=0; i<u.length; i++) {
			for(int j=2; j<=u[i]/2; j++) {

				if(u[i]%j==0) {
					System.out.println("It is not a prime number "+u[i]);
					//flag=false;
					count++;
					break;
				}
			}

			if(count==0) {
				System.out.println("It is prime number " +u[i]);
			}

		}
	}
	public static void Fibonacci() {// sum up to 15
		int n=10;
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=2; i<=n; i++) {
			c=a+b;//0 + 1 || 1+1=2 || 2+1=3 || 3+2=5 ||
			System.out.println(c);
			a=b;// a=1 a || a=1  ||2    || 3
			b=c;// 1 ||2  || 3 ||5
		}
	}
}
