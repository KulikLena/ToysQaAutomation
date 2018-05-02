package objects;

import general.Methods;
import general.Toys;

public class Doll extends Toys implements Methods {
	String gender;
	String name;

	@Override
	public void movement(String manner) {
		if (manner == "drop") {
			System.out.println("Can be broken");
		}
		if (manner == "push") {
			System.out.println("Slide");

		}
	}

	@Override
	public void play() {
		System.out.println("A child plays with doll");

	}

}
