package objectExercise;

public class Apartment extends Property {

	//field
	private String floor;

	//constractor
	public Apartment(String building, String name, String type, int cost, String floor) {
		super(building, name, type, cost);
		this.floor = floor;
	}

	//getter.setter
	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	//method
	@Override
	public void explain() {
		System.out.println("=============================");
		System.out.println("物件名：いい感じ" + this.getBuilding());
		super.explain();
		System.out.println("間取り：" + getFloor());
		System.out.println("=============================");
	}
}
