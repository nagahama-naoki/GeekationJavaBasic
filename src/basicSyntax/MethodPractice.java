package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;

		method5(method1(a, b));
		method5(method2(a, b));
		method5(method3(a, b));
		method5(method4(a, b));
		
	}

	public static int method1(int x, int y){
		return x + y;
	}

	public static int method2(int x, int y){
		return x - y;
	}

	public static int method3(int x, int y){
		return x * y;
	}

	public static int method4(int x, int y){
		return x / y;
	}

	public static void method5(int x){
		System.out.println("計算結果は" + x + "です。");
	}

}