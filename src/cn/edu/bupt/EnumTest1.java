package cn.edu.bupt;

public class EnumTest1 {
	public static void main(String[] args) {
		for(Color color : Color.values()) {
			System.out.println(color.ordinal() + "  " + color.name());
		}
	}
	
	private enum Color {
		Red, Blue, Pink;
	}
}
