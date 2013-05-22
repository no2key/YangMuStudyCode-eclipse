package cn.edu.bupt.baseKnowledge;

public class StaticTest3 {
	public static void main(String[] args) {
		M m = new N();
		m.output();
		M.output();
		N.output();
	}
}

class M {
	public static void output() {
		System.out.println("M");
	}
}


class N extends M {
/*	public void output() {
		System.out.println("N");
	}
*/
}