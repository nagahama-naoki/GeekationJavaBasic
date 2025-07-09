package basicSyntax;

public class GeekIntroduction {
	
	int height;
	double weight;
	
	int num1;
	int num2;
	
	public GeekIntroduction(int height, double weight, int num1, int num2) {
		this.height = height;
		this.weight = weight;
		this.num1 = num1;
		this.num2 = num2;
	}

	public void greeting(int age, double height) {
		System.out.println("こんにちは!私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
	}

	public void specialSkill(int num1, int num2) {

		if (num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");

		} else if (num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");

		} else if (num1 > 300 || num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");

		} else {
			for (int i = num1; i <= num2; i++) {

				if (i % 3 == 0 || i % 5 == 0) {
					System.out.println(i + "は3の倍数と5の倍数です。");
					continue;

				} else if (i % 3 == 0) {
					System.out.println(i + "は3の倍数です。");
					continue;
				} else if (i % 5 == 0) {
					System.out.println(i + "は5の倍数です。");
					continue;
				}
				System.out.println(i);
			}

		}
	}
}
