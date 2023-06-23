package Throwable_class.Exception.Unchecked;

public class NumberFormatException {

	public static void main(String[] args) {
		String str ="199.36";
		try {
			int num = Integer.parseInt(str);  // float String value can't be change into int
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Number Format Exception...");
		}
		

	}

}
