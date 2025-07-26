package programforInterview;

public class RemoveLastChar {

	public static void main(String[] args) {
		//RemoveLastChar.removeLastCharWithLops();
		//RemoveLastChar.removeLastCh();
		RemoveLastChar.prasadRemoveCH();
	}
	static void removeLastCharWithLops() {
		String st="raju";
		String remove="";
		for(int i=0; i<st.length()-1; i++) {
			remove+=st.charAt(i);
		}
		System.out.println(remove);
	}
	static void removeLastCh() {
		String str="Kiran";
		StringBuffer sf=new StringBuffer(str);
		sf.deleteCharAt(4);
		System.out.println(" "+sf.deleteCharAt(0));
	}
	static void prasadRemoveCH() {
		String st="raju";
		StringBuffer bulider=new StringBuffer(st);
		
		bulider.deleteCharAt(0);
		System.out.println("input string: " +st);
		System.out.println("remove fisrt character : "+bulider.toString());
		
		bulider=new StringBuffer(st);
		bulider.deleteCharAt(st.length()-1);
		System.out.println("remove last char:"+bulider.toString());
		}
	
}
