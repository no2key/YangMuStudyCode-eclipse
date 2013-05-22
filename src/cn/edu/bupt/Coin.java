package cn.edu.bupt;

public enum Coin {
	//鏋氫妇绫荤殑闈欐�鍏湁瀹炰緥瀵硅薄(public static final)
	penny("hello"), nickel("world"), dime("welcome");
	
	//鏋氫妇绫荤殑鎴愬憳鍙橀噺
	private String value;
	
	//鏋氫妇绫荤殑鏋勯�鏂规硶
	Coin(String value) {
		this.value = value;
	}
	
	//鏋氫妇绫荤殑鎴愬憳鏂规硶
	public String getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		 Coin coin = Coin.penny;
		 System.out.println(coin.getValue());
	}
}
