package quiz;

public class Quiz8 {

	public static void main(String[] args) {

		int i = 10;
		float f = 2.0f;
		
		System.out.println((int) (i + f));	// int 형 보다 float 형이 더 정밀하기에, (int) 값이 없다면, float 형으로 자동 형 변환이 이뤄진다.
		System.out.println((int) (i - f));
		System.out.println((int) (i * f));
		System.out.println((int) (i / f));
		
	}

}
