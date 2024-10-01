package module5;

public class OverloadMainStatic {

	public static void main() {
		System.out.println("Main method without Parameters");
	}

	public static void main(int a, int b) {
		System.out.println("Main method with 2 parameters");
	}

	public static void main(int a) {
		System.out.println("Main method with 1 parameter");
	}

	public static void main(String[] args) {
		main();
		main(10);
		main(12, 24);

	}

}
