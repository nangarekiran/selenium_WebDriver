package programforInterview;

public class AarryMaximumValue {

	public static void main(String[] args) {
		AarryMaximumValue.maxValueInArry();
		AarryMaximumValue.maxValueInterger();
	}
	static void maxValueInArry(){
		int [] arr={1,83,66,93,88};
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}

		}
		System.out.println(max);
	}
	static void maxValueInterger(){
		int n=62;
		int n1=15;
		int n3=20;
		if(n>n1 && n>n3) {
			System.out.println(" N value is greter than n3 & n2 "+n);
		}else if(n1>n && n1>n3){
			System.out.println(" N1 value is greter than n3 & n2 "+n1);
		}else{
			System.out.println(" N3 value is greter than n & n2 "+n3);
		}
	}
}
