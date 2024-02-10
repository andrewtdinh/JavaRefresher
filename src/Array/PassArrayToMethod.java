package Array;

public class PassArrayToMethod {
	
	public void findMin(int arrayOne[]) {
		int min = arrayOne[0];
		
		for(int i = 1; i < arrayOne.length; i++) {
			if (min > arrayOne[i]) {
				min = arrayOne[i];
			}
		}
		
		System.out.println("Minimum element is: " + min);
		
	}
	
	public int[] getArray() {
		return new int[] {12,13,45,38,56,190,12,3};
	}
	

	public static void main(String[] args) {
		PassArrayToMethod pass = new PassArrayToMethod();
		
		int arrayTest[] = {12, 47, 37, 7, 3, 9};
		
		pass.findMin(arrayTest);
		
		int arrayThree[] = pass.getArray();
		
		System.out.println(arrayThree[2]);
	}

}
