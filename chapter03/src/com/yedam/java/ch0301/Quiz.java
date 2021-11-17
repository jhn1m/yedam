package src.com.yedam.java.ch0301;

public class Quiz {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int result;

		// 문제 1-1
		// 부호연산자를 이용하여 변수 x를 음수로 출력
		result = -x;
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);

		// 문제 1-2
		// 변수 x와 y의 값을 더한 후 y의 값을 증가시키는
		// 연산식을 한줄로 작성하여라
		result = x + y++;
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);

		// 문제 1-3
		// 변수 x와 x의 더한값이 20이 되도록 변수 x와 y중 하나의
		// 변수에 증감 연산자를 사용하여 연산식을 한줄로 작성하여라.
		result = x + --y;
		System.out.printf("x : %d, y : %d, result : %d\n", x, y, result);

		// 문제 1-4
		// 변수 x에서 변수 y를 나눈 후 몫과 나머지를 출력하세요.
		System.out.printf("몫 : %d, 나머지 : %d\n", (x / y), (x % y));

		// 문제2
		// 산술연산자만 이용하여 365를 300으로 변환
		int value = 365;
		// 소수점이 없어지는것을 이용
		result = (value / 100) * 100;
		System.out.println(result);

		// 다른 방법
		result = value - (value % 100);
		System.out.println(result);

		// 문제3
		// 다음 결과를 차례대로 true와 false를 출력하도록 수정하세요.
		int m = 10;
		int n = 5;

//		System.out.println((m < 7) && (n <= 5)); // true
//		System.out.println(((m % 3) == 1) || ((n % 2) != 0)); // false
//		
		System.out.println((m < 7) || (n <= 5)); // true
		System.out.println(((m % 3) == 1) ^ ((n % 2) != 0)); // false

		// 문제4
		// 각 연산식을 대입연산자 하나로 구성된 실행문으로 변경하세요.
		int val = 0;
//		val = val + 10;
//		val = val - 10;
//		val = val * 10;
//		val = val / 10;
		val += 10;
		val -= 10;
		val *= 10;
		val /= 10;

		// 문제5
		// 변수 val의 값이 양수일 경우엔 변수 값을 
		// 아닐 경우엔 0을 담는 변수를 선언하라.
		// (삼항 연산자를 사용)
		val = (val > 0) ? val : 0;
		System.out.println(val);
		
		// 문제 5)
		// 다음과 같이 두 개의 정수가 주어졌을 경우 두 정수 중에서
		// 음수가 있다면 'One of a or b is negative number'를,
		// 만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요.
		if((m > 0) && (n > 0 )) {
			System.out.println("both a and b are zero or more");
		}else {
			System.out.println("One of a or b is negative number");
		}
		
<<<<<<< HEAD
		//((m > 0) && (n > 0))?System.out.println("both a and b are zero or more"):System.out.println("One of a or b is negative number");
		
		 
=======
//		String strResult = ((m > 0) && (n > 0))?"both a and b are zero or more"):"One of a or b is negative number";
//		System.out.println(strResult);
>>>>>>> branch 'main' of https://github.com/jhn1m/yedam.git
		
	}

}
