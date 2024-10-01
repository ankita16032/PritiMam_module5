package module5;

public class OverloadMain {

	public void main() {
		System.out.println("Main method without Parameters");
	}

	public void main(int a, int b) {
		System.out.println("Main method with 2 parameters");
	}

	public void main(int a) {
		System.out.println("Main method with 1 parameter");
	}

	public static void main(String[] args) {

		OverloadMain overloadMain = new OverloadMain();
		overloadMain.main();
		overloadMain.main(10);
		overloadMain.main(12, 20);

	}

}
