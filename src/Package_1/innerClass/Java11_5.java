package Package_1.innerClass;
class OutClass5 {
	int nVar1 = 3;
	class InnerClass {
		void Print() {
			System.out.println("out class nVar1: " + nVar1);
		}
	}
	void Print() {
		InnerClass Inner = new InnerClass();
		Inner.Print();
	}
}
public class Java11_5 {

	public static void main(String[] args) {
		OutClass5 OutTest1 = new OutClass5();
		OutTest1.Print();
	}
}