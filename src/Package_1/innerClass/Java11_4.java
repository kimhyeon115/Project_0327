package Package_1.innerClass;
class OutClass4 {
	static int nVar1 = 3;
	static class InnerClass {
		static void Print() {
			System.out.println("static inner class");
			System.out.println("out class static nVar1: " + nVar1);
		}
	}
}
public class Java11_4 {

	public static void main(String[] args) {
		OutClass4.InnerClass.Print();
	}
}