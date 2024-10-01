package module5;

public class CompareString {
	public static void main(String[] args) {

		int a = 100;
		int b = 100;
		if (a == b) {
			System.out.println("Same");
		} else {
			System.out.println("Same");
		}

		String str1 = "Ankita";
		String str2 = "Ankita";
		if (str1 == str2) {
			System.out.println("Same");
		} else {
			System.out.println("not same");
		}
		System.out.println("-----------------------------");

		// 2nd method to create a string obj

		String str3 = new String("Ank");
		String str4 = new String("Ank");
		if (str3.equals(str4)) {
			System.out.println("Same");
		} else {
			System.out.println("not same");
		}

		// System.out.println("-----------------------------");
		if (str3.equalsIgnoreCase(str4)) {
			System.out.println("Same");
		} else {
			System.out.println("not same");
		}

	}
}
