package objectExercise;

public class Main {
	public static void main(String[] args){
		
		//instance
		Property obj1 = new Apartment("アパートメント", "山田 マンション太郎", "マンション", 50000000, "3LDK");
		Property obj2 = new Land("土地", "山田 土地太郎", "土地", 8000000, 105.2);
		obj1.explain();
		obj2.explain();
	}
}
