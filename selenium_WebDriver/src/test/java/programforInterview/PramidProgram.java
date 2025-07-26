package programforInterview;

public class PramidProgram {
	
	public static void main(String[] args) {
		PramidProgram.pramid();
		PramidProgram.pramid02();
	}
	static void pramid() {
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pramid02() {
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" ");
			}
			for(int c=a; c<=8-a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
