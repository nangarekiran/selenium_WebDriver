package programforInterview;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		int a, c=0, temp;
		int n=153;
		temp=n;
		while(n>0) {
			a=n%10;// 1 (baki)- 4
			n=n/10;//14         1
			c=c+(a*a*a);//1  -65 
		}if(temp==c) {
			 System.out.println("Armstrong number "+c);
		} else
				    System.out.println("Not an Armstrong number "+c);
		
	}

}
