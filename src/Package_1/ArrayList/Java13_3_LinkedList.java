package Package_1.ArrayList;

import java.util.Collections;
import java.util.LinkedList;

public class Java13_3_LinkedList {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(7);
		list1.add(3);
		list1.add(5);
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		System.out.println(list1);
		System.out.println("처음 노드 : " + list1.getFirst());
		System.out.println("끝 노드 : " + list1.getLast());
		System.out.println("개수 : " + list1.size());
		
		list1.remove(3);//삭제
		System.out.println(list1);
		list1.set(3,  12);//3번째를 12로 수정
		System.out.println(list1);
		
		Collections.sort(list1);//정렬 (2진 트리구조)
		System.out.println("sort : " + list1);
		list1.clear();
		System.out.println("개수 : " + list1.size());
	}
}