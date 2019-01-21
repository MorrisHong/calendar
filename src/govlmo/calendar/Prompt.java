package govlmo.calendar;

import java.util.Scanner;

public class Prompt {
	/**
	 * 
	 * @param week 요일명
	 * @return	0~6(Sunday 0, Saturday 6
	 */
	public int parseDay(String week) {
		//(SU, MO, TU, WE, TH, FR, SA)
		switch(week) {
		case "SU" : return 0;
		case "MO" : return 1;
		case "TU" : return 2;
		case "WE" : return 3;
		case "TH" : return 4;
		case "FR" : return 5;
		case "SA" : return 6;
		default : return -1;
		}
	}

	public void runPrompt() {
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
		int year = -1;
		
		while (true) {
			System.out.println("년도를 입력하세요.(-1 입력시 종료)"); 
			System.out.print("Year > ");
			year = sc.nextInt();
			if(year == -1) break;
			
			System.out.println("월을 입력하세요.(-1 입력시 종료)");
			System.out.print("Month > ");
			month = sc.nextInt();
			if(month == -1) break;
			if(month > 12 || month < 1) continue;
			
			
			cal.printSampleCal(year, month);
		}

		System.out.println("Bye~");
		sc.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
