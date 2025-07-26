package programforInterview;

public class palindromeNumber {

	public static void main(String []strg) {

		int i=145;
		int n=0; int n1=0;
		int temp=i;
		while(i>0) {
			n=i%10;// 1 -4 -1
			n1=(n1*10)+n;
			i=i/10;
		}if(temp==n1) {
			//System.out.println("It is plindromnNumber ="+n1);
		}else {
			//System.out.println("It is not a plindromnNumber ="+n1);
		}
		palindromeNumber.armstrong();;
		
	}
	static void palidron() {
		int a=231;
		int n, rev=0;
		int temp=a;
		while(a>0) {
			n=a%10;
			rev=(rev*10)+n;
			a=a/10;
		}
		if(temp==rev) {
			System.out.println(" plindron number "+rev);
		}else {
			System.out.println("Not plindron number "+rev);
		}
	}
	static void armstrong() {
		int a=153;
		int n, rev=0;
		int temp=a;
	while(a>0) {
			n=a%10;
			a=a/10;
			rev=rev+(n*n*n);//27+125+1
		}
		System.out.println(rev);
	}

}
