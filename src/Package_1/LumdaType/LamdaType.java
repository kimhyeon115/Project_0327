package Package_1.LumdaType;

import java.util.ArrayList;
import java.util.List;

public class LamdaType {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//ArrayList는 자바의 List 인터페이스를 상속받은 여러 클래스 중 하나이다
		list.add("Java");
		list.add("C");
		list.add("React");
//		for(String str: list) {
//			System.out.println(str);
//		}
		//for 문을 람다식으로 바꾼 것
		list.stream().forEach((String str) -> System.out.println(str));
		//String 츄론이 가능한 경우는 생략가능 그때는 ( )도 생략
		list.stream().forEach(str -> System.out.println(str));
		//이와 같이 도 사용 가능
		list.stream().forEach(System.out::println);
	}
}