package Throwable_class.Exception.Unchecked;

public class NullPointerException {

	public static void main(String[] args) {

		String str1 = null;
		try {
			if (str1.equals("ram")) {
				System.out.println("equals");
			} else {
				System.out.println("not equals");
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Null Pointer Exception caught....");
		}
	}

}
