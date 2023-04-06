package anonymousClass;
interface Testable2 {
	public void Print();
}
class InterfaceClass2 implements Testable2 {

	@Override
	public void Print() {
		System.out.println("Hi !");
	}
}
class ClassA2 {
	public void Print() {
		System.out.println("good !");
	}
}
public class Java12_2 {

	public static void main(String[] args) {
		InterfaceClass2 Test3 = new InterfaceClass2() {//익명 클래스
			public void Print() {
				System.out.println("Anonymous interface1");
			}
		};
		
		Test3.Print();
		
		ClassA2 Test4 = new ClassA2() {//익명 클래스
			public void Print() {
				System.out.println("Anonymous interface2");
			}
		};
		Test4.Print();
		
		ClassA2 Test5 = new ClassA2() {//익명 클래스
			public void Print() {
				System.out.println("Anonymous interface3");
				//오버라이딩 내용이 같더라도 재정의 한것이므로 오버라이딩에 속한다
			}
		};
		
		Test5.Print();
		
		Testable2 Test6 = new Testable2() {//익명 클래스
			public void Print() {
				System.out.println("Anonymous interface4");
			}
		};
		
		Test6.Print();
	}

}