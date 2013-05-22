package cn.edu.bupt;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;

public class A {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(A.class);

	@SuppressWarnings(value="unchecked")
	public void sayHello() {
		Collection col = new ArrayList();
		if (logger.isDebugEnabled()) {
			logger.debug("sayHello() - Hello");
		}

		System.out.println("Hello,world");
	}
} 
