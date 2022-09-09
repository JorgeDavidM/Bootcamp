
public class JavaBrushUp {

	public static void main(String[] args) {
		
		//Data types
		int num = 5;
		String str = "Hola mundo";
		char letter = 'J';
		double dec = 3.1416;
		boolean yesOrNot = true;
				
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
//		System.out.println(arr[1]);
		
		int[] arr2 = {1,2,3,4};
//		System.out.println(arr2[0]);
		
		//for loop
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] names = {"Jorge", "David", "Aslan"};
		
		//Long method to access arrays
//		for(int j = 0; j<names.length; j++) {
//			System.out.println(names[j]);
//		}
		
		//Short method to access arrays
		for(String s: names) {
			System.out.println(s);
		}

	}

}
