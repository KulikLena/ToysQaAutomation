package objects;

import java.util.Comparator;

import general.Methods;
import general.Toys;

public class Ball extends Toys implements Methods {
	String purpose;

	public Ball(String type) {
		type = purpose;
	}

	@Override
	public void movement(String manner) {
		if (manner == "drop") {
			System.out.println("Jump-jump-jump");
		}
		if (manner == "push") {
			System.out.println("Roll over");
		}
	}

	@Override
	public void play() {
		System.out.println("A child plays with ball");

	}

	public static Comparator<Ball> COMPARE_BY_SIZE = new Comparator<Ball>() {
		public int compare(Ball one, Ball other) {
			return one.size.compareTo(other.size);
		}
	};

}
