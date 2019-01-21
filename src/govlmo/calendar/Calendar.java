package govlmo.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 ==0)) {
			return true;
		}else {
			return false;			
		}
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		}else {
			return MAX_DAYS[month - 1];
		}
		
		
	}

	public void printSampleCal(int year, int month, int weekDay) {
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekDay;
		int delim = (count < 7) ? count : 0;
		
		System.out.println(year + ", " + month + ", " + weekDay);
		System.out.printf("   <<%4d년 %3d월>>\n", year, month);
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("----------------------");
		
		//print black space
		for(int i = 0; i < weekDay; i++) {
			System.out.print("   ");
		}
		//print first line
		for(int i = 1; i <= count; i++) {
			System.out.printf(" %2d",i);
		}
		System.out.println();
		
		//print second line to last
		count++;
		for(int i = count; i <= maxDay; i++) {
			System.out.printf(" %2d",i);
			if( i % 7 == delim) {
				System.out.println();
			}
		}
		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");

	}

}
