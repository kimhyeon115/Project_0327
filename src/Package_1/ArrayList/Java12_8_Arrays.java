package Package_1.ArrayList;

import java.util.Arrays;

public class Java12_8_Arrays {
	public static void main(String[] args) {
		int[] nIntArray = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("정렬전 : " + Arrays.toString(nIntArray));
		
		Arrays.sort(nIntArray);//sort 메소드가 static 이므로 객체 생성 없이 Arrays 이름으로 부른 것
		System.out.println("정렬후 : " + Arrays.toString(nIntArray));
		
		System.out.println(Arrays.binarySearch(nIntArray, 13));
		//13찾기(검색)
		System.out.println(Arrays.binarySearch(nIntArray, 5));
		//5 찾기(검색)
		
		Arrays.fill(nIntArray, 1, 3, 12);//12로 채워라
		System.out.println("치환결과 : " + Arrays.toString(nIntArray));
	}
}