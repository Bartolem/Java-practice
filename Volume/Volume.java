package pack;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a cylinder: ");
		double radius = input.nextDouble();

		System.out.println("Enter the length of a cylinder: ");
		double length = input.nextDouble();
		input.close();
		
		double pi = 3.1416;
		double area = radius * radius * pi;
		double volume = area * length;

		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);

	}

}
