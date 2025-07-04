package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;

		System.out.println(a > b);

		boolean isSunny = true;
		boolean isWarm = true;

		System.out.println((isSunny == true) && (isWarm == true));

		int x = 3;
		int y = 2;

		System.out.println((x >= 0) && ((y % 2) == 0));

		boolean hasPermission = false;

		System.out.println(!hasPermission);

	}

}
