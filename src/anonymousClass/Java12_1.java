package anonymousClass;
interface Testable {
	public void Print();
}
class InterfaceClass implements Testable {

	@Override
	public void Print() {
		System.out.println("Hi !");
	}
}
class ClassA {
	public void Print() {
		System.out.println("good !");
	}
}

public class Java12_1 {

	public static void main(String[] args) {
		InterfaceClass Test1 = new InterfaceClass();
		Test1.Print(); //일반적인 클래스 호출
		ClassA Test2 = new ClassA();
		Test2.Print(); //일반적인 클래스 호출
	}
}