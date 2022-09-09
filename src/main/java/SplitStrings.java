
public class SplitStrings {

	public static void main(String[] args) {

		// String is an object //String literal

		// Two strings cannot have same content in literal way
		String s1 = "Hola mundo";

		// new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");

		String s = "Jorge David Muñoz";
		String[] splittedString = s.split("David");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		//Print String character by character
//		for(int i=0;i<s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
		//Print String at reverse character by character
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		
	}

}
