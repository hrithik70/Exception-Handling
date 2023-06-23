package Throwable_class.Exception.Unchecked;

public class ArithmeticException {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 0;
		float div = 0;
		try {
			div = num1 / num2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Arithmetic Exception occur because /zero.....");
		}

		System.out.println(div);

	}

}
