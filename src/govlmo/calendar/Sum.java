package govlmo.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력 : 키보드로 두 수의 입력을 받는다.
		//출력 : 화면에 두 수의 합을 출력.
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해주세요. ");
		s1 = scanner.next();
		s2 = scanner.next();
		num1 = Integer.parseInt(s1);
		num2 = Integer.parseInt(s2);
		System.out.println(num1 + ", " + num2);
		
		//int result = num1 + num2;
		//System.out.println("두 수의 합은 " + (num1+num2) + "입니다.");
		System.out.printf("%d와 %d의 합은 %d 입니다.", num1, num2, num1+num2);
		scanner.close();
	}
}
