package cn.edu.bupt.enumeration;

public class AccessControl {
	private static boolean checkRight(AccessRight ar) {		//限制传入的权限参数仅限于枚举类型的三个实例对象中,否则会发生语法错误
		if(ar == AccessRight.MANAGER) {
			return true;
		}
		else if(ar == AccessRight.DEPARTMENT) {
			return false;
		}
		else if(ar == AccessRight.EMPLOYEE) {
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		AccessRight ar = AccessRight.valueOf(args[0]);
		System.out.println(checkRight(ar));
		ar.show();
		ar.setName("myManager");
		ar.show();
	}
}
