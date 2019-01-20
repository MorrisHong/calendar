package govlmo.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String PROMPT = "Cal> ";
	
	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램.
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		
//		System.out.println("반복횟수를 입력하세요. : ");
//		int repeat=sc.nextInt();
		
		
		int month = 0;
		while(true) {
			System.out.println("월을 입력하세요.(-1 입력시 종료)");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다. \n\n", month, cal.getMaxDaysOfMonth(month));
		}
		
		System.out.println("Bye~");
		sc.close();
	}

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCal() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

}
