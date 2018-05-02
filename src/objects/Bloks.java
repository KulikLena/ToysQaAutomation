package objects;

import general.Methods;
import general.Toys;

public class Bloks extends Toys implements Methods {
	int amount;
	String storage;

	@Override
	public void movement(String manner) {
		if (manner == "drop") {
			System.out.println("Can'not bounce");
		}
		if (manner == "push") {
			System.out.println("Slide");
		}

	}

	@Override
	public void play() {
		System.out.println("A child plays with bloks");

	}

}
