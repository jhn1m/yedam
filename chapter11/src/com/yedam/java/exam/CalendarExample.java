package com.yedam.java.exam;

import java.util.Calendar;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월요일";
			break;

		case Calendar.TUESDAY:
			strWeek = "화요일";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수요일";
			break;
		case Calendar.THURSDAY:
			strWeek = "목요일";
			break;
		case Calendar.FRIDAY:
			strWeek = "금요일";
			break;
		case Calendar.SATURDAY:
			strWeek = "토요일";
			break;
		case Calendar.SUNDAY:
			strWeek = "일요일";
			break;
		}
	
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + strWeek + " " + hour + "시 " + minute +"분");
		
	}

}
