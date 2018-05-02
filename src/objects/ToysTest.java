package objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import general.Room;

public class ToysTest {

	public static void main(String[] args) {

		Room room = new Room(false);
		room.setNameOfTheRoom("Red room");
		room.setShapeOfTheRoom("Cube");
		room.lightOn();
		room.throwToys();

		List<Ball> balls = new ArrayList<Ball>();
		balls.add(new Ball("football"));
		balls.get(0).weight = 0.78;
		balls.get(0).size = "3_Medium";

		balls.add(new Ball("voleyball"));
		balls.get(1).weight = 0.64;
		balls.get(1).size = "3_Medium";

		balls.add(new Ball("basketball"));
		balls.get(2).weight = 1.34;
		balls.get(2).size = "4_Large";

		balls.add(new Ball("fitball"));
		balls.get(3).weight = 0.92;
		balls.get(3).size = "5_Huge";

		balls.add(new Ball("plain"));
		balls.get(4).weight = 0.31;
		balls.get(4).size = "2_Small";

		balls.add(new Ball("table_tennis"));
		balls.get(5).weight = 0.11;
		balls.get(5).size = "1_Tiny";

		// сортируем мячи по размеру
		Collections.sort(balls, Ball.COMPARE_BY_SIZE);
		for (int i = 0; i < balls.size(); i++) {
			System.out.println(balls.get(i).size);
		}
		System.out.println();

		TreeSet<Car> cars = new TreeSet<Car>();
		cars.add(new Car("truck", 0.78));
		cars.add(new Car("loader", 2.11));
		cars.add(new Car("crane", 1.58));
		cars.add(new Car("bolid", 0.15));
		cars.add(new Car("passenger car", 0.21));
		cars.add(new Car("tractor", 1.05));
		cars.add(new Car("combine", 1.75));

		// находим машинки, которые тяжелее трактора
		Set<Car> subCars = cars.tailSet(new Car("tractor", 1.05));

		for (Car elem : subCars) {
			System.out.println(elem.weight + " " + elem.type);
		}
		System.out.println();
		// находим машинки, которые тяжелее грузовика, но легче комбайна
		Set<Car> subSubCars = cars.subSet(new Car("truck", 0.78), new Car("combine", 1.75));

		for (Car elem : subSubCars) {
			System.out.println(elem.weight + " " + elem.type);
		}

		Doll[] dolls = { new Doll("Amy"), new Doll("Kate"), new Doll("Pam"), new Doll("Doroty") };
		dolls[2].play();
		System.out.print(" "+dolls[2].name);

	}

}
