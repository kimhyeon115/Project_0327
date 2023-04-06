package Package_1.ArrayList;

import java.util.LinkedList;

class Person {
	String strName;
	public Person(String str) {
		strName = str;
	}
}
public class Java13_4_LinkedList {

	public static void main(String[] args) {
//만든 Person 객체로 제네릭을 사용한 것이다
		LinkedList<Person> list = new LinkedList();	
		list.add(new Person("A Name"));
		list.add(new Person("B Name"));
		list.add(new Person("C Name"));
		list.add(new Person("D Name"));
		list.add(new Person("F Name"));

		//정렬
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).strName);
		
		//검색
		int nSearchIndex = -1;
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).strName.equals("C Name"))
			{
				System.out.println(list.get(i).strName + "을 "
						+ i + " 번째에서 찾았습니다");
				nSearchIndex = i;
				break;
			}
		}
		
		//삭제
		list.remove(nSearchIndex);
		System.out.println("삭제==========");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).strName);
		
		//삽입
		list.add(nSearchIndex, new Person("C Name"));
		System.out.println("삽입==========");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).strName);
	}
}