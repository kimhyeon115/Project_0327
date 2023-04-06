package Package_1.string;

public class Java12_5_string {

	public static void main(String[] args) {
		String str1 = String.valueOf(3.14f);
		System.out.println(str1);
		
		char[] strArray = {'a', 'b', 'c', 'd'};
		String str2 = String.valueOf(strArray);
		System.out.println(str2);
		System.out.println(str2 + " 길이 : " + str2.length());
	}
}