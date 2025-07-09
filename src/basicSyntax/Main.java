package basicSyntax;

public class Main { 
	public static void main(String[] args){
		
		int age = 20;
		double height = 180.0;

		int num1 = 23;
		int num2 = 50;

		GeekIntroduction geek1 = new GeekIntroduction(age, height, num1, num2);

		geek1.greeting(age, height);	
		geek1.specialSkill(num1, num2);
	}
}