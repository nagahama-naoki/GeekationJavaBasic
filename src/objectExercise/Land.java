package objectExercise;

public class Land extends Property {

	//field
	private double land;
	
	//constractor
	public Land(String building, String name, String type, int cost, double land){
		super(building, name, type, cost);
		this.land = land;
	}

	//getter.setter
	public double getLand() {return this.land;}
	public void setLand(double land) {this.land = land;}

	//method
	@Override
	public void explain(){
		System.out.println("=============================");
		System.out.println("物件名：いい感じの" + getBuilding());
		super.explain();
		System.out.println("広さ：" + getLand() + "m²");
		System.out.println("=============================");
	}
}
