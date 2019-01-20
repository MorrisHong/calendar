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
		
//		월을 입력하면 해당월의 달력을 출력한다.
//		달력은 모양은 1단계에서 작성한 모양으로 만든다.
//		1일은 일요일로 정해도 무방하다.
//		-1을 입력받기 전까지 반복 입력받는다.
//		프롬프트를 출력한다.
		
		
		int month = 0;
		while(true) {
			System.out.println("월을 입력하세요.(-1 입력시 종료)");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if(month == -1) {
				break;
			}
			if(month > 12 || month == 0) {
				continue;
			}
			if(cal.getMaxDaysOfMonth(month) == 31) {
				cal.printSampleCal("29 30 31");
			}else if(cal.getMaxDaysOfMonth(month) == 30) {
				cal.printSampleCal("29 30");
			}else {
				cal.printSampleCal("");
			}
		}
		
		System.out.println("Bye~");
		sc.close();
	}

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCal(String add) {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println(add);
		System.out.println();
	}

}
