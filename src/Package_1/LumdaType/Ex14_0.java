package Package_1.LumdaType;
public class Ex14_0 {

	public static void main(String[] args) {
		MyFunction2 f = new MyFunction2() {
			public int max(int a, int b) {	//public를 붙여야한다.(생략불가)
				return a > b ? a : b;		//람다식 단독 사용불가
			}
		};
		
		int value = f.max(3, 5);
		System.out.println("value = " + value);
		}
	}
@FunctionalInterface //붙여주면 조건을 체크 해 준다.
interface MyFunction2 {
//	public abstract int max(int a, int b);
	int max(int a, int b);		//public 생략가능(인터페이스 내 메소드)
}