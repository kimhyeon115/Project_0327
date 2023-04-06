package Package_1.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Java13_2_ArrayList {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();		//객체생성
		list1.add(7);
		list1.add(3);
		list1.add(5);
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		System.out.println("개수 : " + list1.size());
		System.out.println("리스트 : " + list1);
		
		Collections.sort(list1);//정렬 static 메소드, 객체생성 안하고 사용가능
		System.out.println("sort된 것 : " + list1);
		
		list1.set(6,  11);//6번째를 11로 수정
		System.out.println(list1);
		
		int nVar = (int)list1.get(2);
//2를 찾아서 형 변환 해서 이동, 제네릭스를 사용하지 않아서 형 변환을 해 주어야 한다
		System.out.println(nVar);
		
		list1.clear();//삭제
		System.out.println("개수 :" + list1.size());
		
//제네릭스를 사용 한 것
		ArrayList<String> list2 = new ArrayList();
		list2.add("java");
		list2.add("programming");
		list2.add("now");
		list2.add("인천");
		System.out.println(list2);
		int nIndex = list2.indexOf("now");//제네릭스를 사용해서 형 변환 하지 않아도 된다
		System.out.println(list2.get(nIndex));
		list2.set(nIndex, "android");//"android"로 수정 했다
		System.out.println(list2);
	}
}