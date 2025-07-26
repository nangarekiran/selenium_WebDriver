package programforInterview;

public class PrimidClass {
	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int a=1; a<=1+i; a++) {
					System.out.print("*");
			}for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		PrimidClass.stringsplit();
	}
	static void stringsplit() {
		String str="ABC DEF GHI";
		String str2[]=str.split(" ");
	
		for(int i=str2.length-1; i>=1; i--) {
			System.out.print(str2[i]);
		}
		for(int j=0; j<=3; j++) {
			System.out.print(str.charAt(j));
		}
	}

}
/* 
    *
   ***
  *****
 *******
*********
*/