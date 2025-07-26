package programforInterview;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] arg) {
		StringProgram.reversString();
	}
	public static void reversString() {
		System.out.println("enter string value");
		Scanner sc=new Scanner(System.in);
		String string_vlaue=sc.nextLine();
		System.out.println(" entered string value"+string_vlaue);
		String rev="";
		
		for(int i=string_vlaue.length()-1; i>=0; i--) {
		rev+=string_vlaue.charAt(i);
		}
		if(rev.equals(string_vlaue)) {
			System.out.println(" it's a palidrom = "+rev);
		}else {
			System.out.println("It is not a palidrom number "+ rev);
		}
	}

}

