package cn.edu.bupt.enumeration;

public enum AccessRight {
	MANAGER("Manager"), DEPARTMENT("Department"), EMPLOYEE("Employee");
	
	private String name;
	private AccessRight(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println(this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
}
