package cn.edu.bupt.abstractclass;

import org.apache.log4j.Logger;

public class Test {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(Test.class);

	public static void main(String[] args) {
		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - start");
		}

		T t = new T1();
		t.method1();

		t.method();
		

		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - end");
		}
	}
}

abstract class T {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(T.class);

	public void method() {
		System.out.println("method in T");
	}
	public abstract void method1();
}

class T1 extends T {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(T1.class);

	public void method1() {
		System.out.println("method1 in T1");
	}
}