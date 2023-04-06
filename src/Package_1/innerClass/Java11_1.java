package Package_1.innerClass;
class OutClass {
	int nVar1 = 3;
	class InnerClass {
		void Print() {
			System.out.println("OutClass nVar1 : " + nVar1);
		}
	}
	InnerClass inner = new InnerClass();
}
public class Java11_1 {

	public static void main(String[] args) {
		OutClass outTest1 = new OutClass();//외부 클래스 속 내부 클래스를 메인 메소드에서 사용시
		outTest1.inner.Print();			   //외부 클래스에서 내부 클래스 객체생성하고
										   //메인에서 외부 클래스를 객체생성하여 사용
	}
}