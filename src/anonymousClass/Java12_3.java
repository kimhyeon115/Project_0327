package anonymousClass;
interface Testable3 {
	public void Print();
}
class ClassA3 implements Testable3 {

	@Override
	public void Print() {
		System.out.println("Hi!");
	}
}
class ClassB {
	void SetClass(ClassA3 ObjectA) {
		ObjectA.Print();
	}
}
public class Java12_3 {

	public static void main(String[] args) {
		//이렇게 사용할 수 있다
		ClassB Test1 = new ClassB();
		//ClassA3()를 던져 준다 그것을 받아서 실행 한 경우이다
		Test1.SetClass(new ClassA3());

		//익명 클래스로 만들어 사용
		Test1.SetClass(new ClassA3() {
		//던져 준 ClassA3()를 그데로 사용하지 않고 재 정의해서 사용
			public void Print() {
				System.out.println("Good!");
			}
		});
		ClassA3 Test2 = new ClassA3() {
			public void Print() {
				System.out.println("인천직업능력개발원");
			}
		};
		Test2.Print();
		InterfaceClass2 ss1 = new InterfaceClass2() {
			public void Print() {
				System.out.println("rlagus");
			}
		};
		ss1.Print();
	}
}