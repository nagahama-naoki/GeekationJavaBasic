package objectExercise;

public abstract class Property {

	//field
	private String building;
	private String name;
	private String type;
	private int cost;

	//constractor
	public Property(String building, String name, String type, int cost) {
		this.building = building;
		this.name = name;
		this.type = type;
		this.cost = cost;

	}

	//getter.setter
	public String getBuilding() {
		return this.building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	//method
	public void explain() {
		System.out.println("物件所有者名：" + getName());
		System.out.println("物件種別：" + getType());
		System.out.println("物件価格：" + getCost() + "円");
	}
}
