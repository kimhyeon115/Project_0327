package Package_1.LumdaType;
public class Ex14_1 {

	public static void main(String[] args) {
		MyFunction f = (a, b) -> a > b ? a : b;//람다식, 익명객체(함수형 인터페이스에 연결해야한다)
//람다식(익명객체)을 다루기위한 참조변수의 타입은 함수형 인터페이스로 한다.
		int value = f.max(3, 5);
		System.out.println("value = " + value);
		}
	}
@FunctionalInterface //붙여주면 조건을 체크 해 준다.
interface MyFunction {
//	public abstract int max(int a, int b);
	int max(int a, int b);//public abstrac 생략
	//함수형 인터페이스 에는 추상 메서드가 한개만 있어야 한다.
}