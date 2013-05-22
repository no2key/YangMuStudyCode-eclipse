package cn.edu.bupt;

public class ColorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Color myColor : Color.values()) {
			System.out.println(myColor);
		}
	}

}

enum Color {
	White,
	Red,
	Blue
}