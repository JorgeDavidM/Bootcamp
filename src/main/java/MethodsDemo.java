
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String s = d.getData();
		System.out.println(s);
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getUserData();
		getData2();
	}
	
//	public void getData() {
//		System.out.println("Running my method");
//	}
	
	public String getData() {
		System.out.println("Running my String method");
		return "Hello world";
	}
	
	public static String getData2() {
		System.out.println("Running my static String method");
		return "Hello world";
	}
}
