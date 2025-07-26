package programforInterview;

public class DuplicateArray {
	public static void main(String[] args) {
		DuplicateArray.duplicateArray();
	}

	public static void duplicateArray() {
		int [] arr={1,2,3,4,3,4,5,2,};
		int cout=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate arry value = "+arr[i]);
					cout++;
					//break;
				}
			}
		}
		System.out.println("value = "+cout);
		System.out.println("value = "+arr.length);
	}

}
