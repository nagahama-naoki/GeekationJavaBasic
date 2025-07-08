package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");
				}
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
		}

		String[] langList = { "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "JavaScript" };

		for (String lang : langList) {
			if (lang.equals("Java")) {
				System.out.println("現在学習中の言語は" + lang + "です。");
				continue;

			} else if (lang.equals("HTML")) {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			} else {
				System.out.println(lang);
			}
		}
	}
}