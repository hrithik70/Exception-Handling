package Throwable_class.Exception.Unchecked.IndexOutOfBound;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[6]);  // Index is define upto 4 but You access 6th index
		} catch (Exception e) {
			System.out.println("Array Index Out Of Bound Caught....");
		}

	}

}
