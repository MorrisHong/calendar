package govlmo.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 ==0)) {
			return true;
		}else {
			return false;			
		}
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		}else {
			return MAX_DAYS[month];
		}
		
		
	}

	public void printSampleCal(int year, int month) {
		System.out.println(year + ", " + month);
		System.out.printf("   <<%4d년 %3d월>>\n", year, month);
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("----------------------");
		
		//get weekDay automatically
		int maxDay = getMaxDaysOfMonth(year, month);
		int weekDay = 0;
		weekDay = getWeekDay(year, month, 1);
		int count = 7 - weekDay;
		int delim = (count < 7) ? count : 0;
		
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

	private int getWeekDay(int year, int month, int day) {
		//먼저 기준 날짜의 요일을 얻는다.
		//1970 1월 1일
		int syear = 1970;
		//int smonth = 1;
		int sweekday = 3;	// 1/3/1970 Thursday (0~6 Sun ~ Sat)
		
		int count = 0;
		
		for(int i = syear; i < year; i++) {
			//윤년이면 366을 대입하고, 아니면 365를 대입한다.
			int delta = isLeapYear(i) ? 366 : 365;	
			count += delta;
		}
		
		for(int i = 1; i < month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}
		
		count += day;
		
		int weekday = (count + sweekday) % 7;
		
		return weekday;
	}
	//simple test code here
	public static void main(String[] args) {
		Calendar c = new Calendar();
		System.out.println(c.getWeekDay(1970, 1, 1));
		System.out.println(c.getWeekDay(1971, 1, 1));
		System.out.println(c.getWeekDay(1972, 1, 1));
		System.out.println(c.getWeekDay(1973, 1, 1));
	}

}
