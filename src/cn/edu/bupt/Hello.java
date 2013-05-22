package cn.edu.bupt;

import cn.edu.bupt.common.Common;	//需要导入到类的层面即可

public class Hello {

	/**
	 * @param args
	 */
	@MyAnno(schoolName="BUPT",studentName="YangM")
	public static void main(String[] args) {
		int a = Common.AGE;	//直接使用静态成员数据,不用加入类名
		System.out.println(new Integer(a));
		Common.output();		//直接使用静态成员方法,不用加入类名
	}
}