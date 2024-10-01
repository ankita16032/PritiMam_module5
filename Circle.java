package module5;

import java.util.Scanner;

public class Circle {

	private double radius;
	private double area1;
	private double peri;
	final double PI = 3.14;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter radius to calculate area and perimeter");
		radius = sc.nextDouble();
	}

	public void calculateArea() {
		area1 = PI * radius * radius;

	}

	public void calculatePeri() {
		peri = 2 * PI * radius;
	}

	public void display() {
		System.out.println("radius is: " + radius);
		System.out.println("areav is: " + area1);
		System.out.println("Perimeter is : " + peri);
	}

}
