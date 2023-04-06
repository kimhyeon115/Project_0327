package Package_1.string;

public class Java12_3_String {
	public static void main(String[] args) {
		String str1 = new String("abcdefg");
		String str2 = "hijklmn";
		String str3 = str1 + str2;//객체와 객체 연결
		
		System.out.println(str3);
		
		
		str3 = str1 + "12345";//객체와 문자 열 연결
		System.out.println(str3);
		
		str3 = str1.concat(str2);//연산식 사용
		System.out.println(str3);
	}
}