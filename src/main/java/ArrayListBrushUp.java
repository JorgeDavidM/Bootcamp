import java.util.ArrayList;

public class ArrayListBrushUp {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 8, 24, 16, 37, 89, 122 };

		//Print all numbers multiples by 2 from an array
		for (int i=0; i<arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
			else {
				System.out.println(arr[i] + " is not multiple of 2");
			}
		}

		//Array List
		ArrayList<String> a = new ArrayList<String>();
		a.add("Jorge");
		a.add("Munoz");
		a.add("Aslan");
		a.add("Programación");
		System.out.println(a.get(2));
		
	}

}
