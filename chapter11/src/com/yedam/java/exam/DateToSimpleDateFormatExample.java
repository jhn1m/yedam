package com.yedam.java.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class DateToSimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
		String sdfNow = sdf.format(now);
		System.out.println(sdfNow);
		
	}
}
