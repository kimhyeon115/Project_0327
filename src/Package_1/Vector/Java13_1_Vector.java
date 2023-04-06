package Package_1.Vector;

import java.util.Vector;

public class Java13_1_Vector {

	public static void main(String[] args) {
		//generics를 사용하지 않은 경우
		//기본형 데이터를 객체로 다룰 수 있도록하는 것이 wrapper 클래스이다
		//여기서 레퍼클래스로 변환해 주고 있다.
		Vector myVector = new Vector<>();
		myVector.addElement(3);
		myVector.addElement(3.14f);
		myVector.addElement("java");
		myVector.addElement("홍길동");
		System.out.println(myVector);
		System.out.println(myVector.elementAt(2));//2번째 즉 java 출력
		int nVar = (int)myVector.firstElement();//firstElement()는 3, 형변환
		System.out.println(nVar);//3 출력
		System.out.println("저장된 객체 : " + myVector.size());//크기인 4 출력
		
		//generics 사용
		//generics 사용(String 만 저장 가능하도록 정해 놓은 것이다)
		//이렇게 정해 놓은 것을 제네릭이라고 한다
		Vector<String> myVector2 = new Vector();
		myVector2.add("java");
		myVector2.add("programming");
		myVector2.add("android");
		myVector2.add("인천");
//		myVector2.add(77);
		System.out.println(myVector2);
		
		String str2 = myVector2.get(2);//형변환 하지 않아도 된다.
		System.out.println(str2);
		
		int nIndex = myVector2.indexOf("인천");
		//인천이 몇 번째 있느냐? 찾아서 넘겨 준다
		System.out.println(myVector2.get(nIndex));//인천이 출력된다
	}
}