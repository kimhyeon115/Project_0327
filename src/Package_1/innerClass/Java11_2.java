package Package_1.innerClass;
class OutClass2 {
	int nVar1 = 3;
	class InnerClass {
		void Print() {
			System.out.println("OutClass nVar1 : " + nVar1);
		}
	}
}
public class Java11_2 {

	public static void main(String[] args) {
		OutClass2 outTest1 = new OutClass2();
		OutClass2.InnerClass InnerTest1 = outTest1.new InnerClass();
		InnerTest1.Print();
	}
}