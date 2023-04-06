package Package_1.LumdaType;

public class Lamda_1 {

	public static void main(String[] args) {
		MyFuntion3 mf3 = (a, b) -> a > b ? a : b;
		int value = mf3.max(5,10);
		System.out.println(value);
	}
}
interface MyFuntion3 {
	int max(int a, int b);
}