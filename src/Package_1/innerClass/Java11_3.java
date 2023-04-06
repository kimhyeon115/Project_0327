package Package_1.innerClass;
class OutClass3 {
	static class InnerClass {
		static void Print() {
			System.out.println("static inner class");
		}
	}
}
public class Java11_3 {

	public static void main(String[] args) {
		OutClass3.InnerClass.Print();
	}
}
