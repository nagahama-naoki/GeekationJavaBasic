package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {

		int num = 2;

		if((num % 2) == 0){
			System.out.println("2の倍数です。");
		
		} else if((num % 3) == 0){
			System.out.println("3の倍数です。");

		} else {
			System.out.println("どちらでもありません。");

		}


		String pref = "大阪府";

		switch (pref) {

			case "北海":
				System.out.println(pref + "道");
				break;

			case "東京":
				System.out.println(pref + "都");
				break;
			case "京都":
				System.out.println(pref + "府");
				break;
			default :
				System.out.println("当てはまりません。");
				break;
		}
	}
}