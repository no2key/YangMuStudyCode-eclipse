package cn.edu.bupt.strategy;

public class SubstractStrategy implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return a - b;
	}

}
