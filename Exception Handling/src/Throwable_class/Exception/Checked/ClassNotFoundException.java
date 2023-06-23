package Throwable_class.Exception.Checked;

public class ClassNotFoundException {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // class import from mysql connector jar file without adding
		} catch (java.lang.ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Class not present...");
		}
	}

}
