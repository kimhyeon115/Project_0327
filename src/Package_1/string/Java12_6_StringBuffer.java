package Package_1.string;

public class Java12_6_StringBuffer {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("abcdefg");//생성자 사용
		String str2 = "hijk";							//new String() 생략된것(autoboxing 이다)
		str1.append(str2);
		System.out.println(str1 + " 문자열 길이 : " + 
					str1.length());
		
		StringBuffer str3 = new StringBuffer(100);//여유있게 잡는다 (100)은 크기를 의미하는 숫자
		str3.append("abcdefghijklm");
		System.out.println(str3 + " 문자 길이 : "
						+ str3.length());
		//파일명을 바꾸는 예제 
		StringBuffer strFileName = new StringBuffer(100);
		strFileName.append("test.txt");
		System.out.println(strFileName);//test.txt
		
		strFileName.delete(0,  strFileName.length()-4);//8-4 이므로 test
		strFileName.insert(0, "success");
		System.out.println(strFileName);
	}
}