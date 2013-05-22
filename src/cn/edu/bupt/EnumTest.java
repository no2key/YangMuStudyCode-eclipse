package cn.edu.bupt;

public class EnumTest {
	public static void doOp(OpConstant opConstant) {
		if(opConstant == OpConstant.SHOOT) {		//可使用"=="
			System.out.println("射击");
		}
		else if(opConstant.equals(OpConstant.TURN_LEFT)){	//可使用.equals()方法
			System.out.println("向左转");
		}
		else {
			System.out.println("向右转");
		}
//		switch(opConstant) {
//		case TURN_LEFT:			//此处不能使用OpConstant.TURN_LEFT 而只能写成TURN_LEFT
//			System.out.println("向左转");
//			break;
//		case TURN_RIGHT:
//			System.out.println("向右转");
//			break;
//		case SHOOT:
//			System.out.println("射击");
//			break;
//		}
	}
	
	public static void main(String[] args) {
		doOp(OpConstant.TURN_LEFT);
	}
}

enum OpConstant {
	TURN_LEFT,
	TURN_RIGHT,
	SHOOT;
}