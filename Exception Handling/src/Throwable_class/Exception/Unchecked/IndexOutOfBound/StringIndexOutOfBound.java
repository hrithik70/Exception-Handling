package Throwable_class.Exception.Unchecked.IndexOutOfBound;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		
		String str = "Ram";
		System.out.println("Length of Str " + str + " = " + str.length());
		try {
			System.out.println(str.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bound Exception Caught...");
		}

	}

}
