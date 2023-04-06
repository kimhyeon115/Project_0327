package Package_1.wrapper;

public class Java12_2_Autoboxing {
	public static int Add(Integer IntVar) {
		int nVar = 10;
		IntVar = IntVar + nVar;
		return IntVar;//IntVar 객체의 값이 오토박싱 되어 int 값으로 반환
	}
	public static void main(String[] args) {
		Integer IntVar = 12;//intVar은 객체 생성해서 만들어 진것
		//new Integer(12)라고 해야 하는데 간단하게 이것을 오토박싱이라고 한다.
		int nVar = 3;//nVar은 정수형 변수
		int nTotal = nVar + IntVar; //변수 + 객체가 된다
		//IntVar 은 IntVar.intValue()를 한 것과 같다. 오토박싱이 된 것이다.
		System.out.println("autoboxing : " + IntVar);
		System.out.println("합 : " + nTotal);
		
		IntVar++;
		System.out.println("++ autoboxing : " + IntVar);
		
		System.out.println("return : " + Add(IntVar));
	}
}