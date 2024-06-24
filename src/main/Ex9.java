package main;

public class Ex9 {

	public static void main(String[] args) {
		
//		byte b = 10;
//		int i  = b;		// b 변수의 값을  i 변수에 복사
//		System.out.println(i);
		
//		float f = 10.0f;
//		double d = f;
//		System.out.println(d);
		
		// 정수형과 실수형 (정밀한 값으로 형변환이 된다.)
		int iNum = 1;
		float fNum = iNum;
		System.out.println(fNum);
		
		// 연산 중 자동형변환이 되는 경우
		// 컴퓨터가 더하기 연산을 수행할 때, 두 항을 같은 자료형으로 변환한다.
		// 이 때 iNum이 float 형으로 자동으로 형변환이된다.
		System.out.println(iNum + fNum); // 2.0
		
	}

}
