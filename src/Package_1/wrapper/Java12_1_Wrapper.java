package Package_1.wrapper;

public class Java12_1_Wrapper {

	public static void main(String[] args) {
//		parseInt() - String 객체에 들어있는 문자형 정수를 int 값으로 반환. 새로운 객체를 생성하지 않는다.
//		​intValue() - Integer 객체에 있는 값을 언박싱(Unboxing) 하여 일반 자료형 int 로 반환.
		Integer IntVar1 = new Integer(123);//Integer  값을 반환
		int nVar = IntVar1.intValue();
		System.out.println("정수 값 : " + nVar);
		
		String str = IntVar1.toString();//객체 값을 문자 열로
		System.out.println("문자열 : " + str);
		
		nVar = Integer.parseInt("300");//문자 열을 정수로
		System.out.println("정수 값 : " + nVar);
		
		str = Integer.toString(nVar);//정수 값을 문자열로
		System.out.println("문자 열 : " + str);
		
		//문자열 Integer 객체로 반환
		Integer IntVar3 = Integer.valueOf("100");
		System.out.println("Integer에 저장된 정수 값 : " + IntVar3.intValue());
		//intValue() 메소드를 사용하기 위해서 객체 생성 했다
		//(IntVar3.intValue()+3) 실습
	}
}