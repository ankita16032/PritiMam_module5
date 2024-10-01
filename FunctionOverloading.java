package module5;

public class FunctionOverloading {

	static public int add(int a, int b) {
		return (a + b);
	}

	static public int add(int a, int b, int c) {
		return (a + b + c);
	}

	static public double add(int a, double b) {
		return (a + b);
	}

	public static void main(String[] args) {
		int result = add(10, 30);
		System.out.println("result : " + result);
		int result1 = add(10, 50, 80);
		System.out.println("result2: " + result1);
		double result3 = add(12, 78.90);
		System.out.println("result3: " + result3);

	}

}
