package cn.edu.bupt.strategy;

public class Environment {
	private Strategy stra;	//Strategy类型,面向接口编程

	public Environment(){
		super();
	}
	public Environment(Strategy stra) {
		super();
		this.stra = stra;
	}

	public Strategy getStra() {
		return this.stra;
	}

	public void setStra(Strategy stra) {
		this.stra = stra;
	}
	
	public int calculate(int a, int b) {
		return this.stra.calculate(a, b);
	}
}
