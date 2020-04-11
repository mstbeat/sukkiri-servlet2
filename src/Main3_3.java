
public class Main3_3 {
	public static void main(String[] args) {
		int isHungry = new java.util.Random().nextInt(2);
		String food = "ハンバーガー";
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if(isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}
}
