
public class Main5_4 {
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double triangleArea = calcTriangleArea(bottom, height);
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "の場合、面積は" + triangleArea + "㎠です。");

		double radius = 5.0;
		double circleArea = calcCircleArea(radius);
		System.out.println("円の半径が" + radius + "cmの場合、面積は" + circleArea + "㎠です。");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
