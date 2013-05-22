package cn.edu.bupt.strategy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		//实例化环境决策,完成相关的运算
		Environment env = new Environment();
		
		//传入减法策略,执行减法运算
		env.setStra(new SubstractStrategy());
		System.out.println(env.calculate(a, b));
		
		//传入加法策略,执行加法运算
		env.setStra(new AddStrategy());
		System.out.println(env.calculate(a, b));
	}

}
