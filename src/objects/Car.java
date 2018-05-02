package objects;

import general.Methods;
import general.Toys;

public class Car extends Toys implements Methods, Comparable<Car> {
	String type;
	int numberOfWheels;

	public Car(String r, double w) {
		super();
		type = r;
		weight = w;
	}

	@Override
	public void movement(String manner) {
		if (manner == "drop") {
			System.out.println("Can be broken");
		}
		if (manner == "push") {
			System.out.println("Ride");
		}

	}

	@Override
	public void play() {
		System.out.println("A child plays with car");

	}

	@Override
	public int compareTo(Car o) {
		return weight.compareTo(o.weight);
	}

}
