package general;

public class Room {

	private String nameOfTheRoom;
	private String shapeOfTheRoom;
	final String mathematicalSystem = "Euclidean geometry";
	final int numberOfDimensions = 3;
	boolean otherPlanesPresence;
	boolean enlightening;

	public Room(boolean furnitura, boolean light) {
		otherPlanesPresence = furnitura;
		enlightening = light;
	}

	public String getNameOfTheRoom() {
		return nameOfTheRoom;
	}

	public void setNameOfTheRoom(String nameOfTheRoom) {
		this.nameOfTheRoom = nameOfTheRoom;
	}

	public String getShapeOfTheRoom() {
		return shapeOfTheRoom;
	}

	public void setShapeOfTheRoom(String shapeOfTheRoom) {
		this.shapeOfTheRoom = shapeOfTheRoom;
	}

	public void throwToys() {
		System.out.println("Toys are thrown!");
	}

	public void pickUpToys() {
		System.out.println("Toys are picked up!");
	}
}
