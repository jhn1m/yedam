package com.yedam.java.ch0605;

public class Printer {
	int integer;
	boolean booleaner;
	double doubler;
	String stringer;

	void println(int integer) {
		this.integer = integer;
		System.out.println(integer);
	}

	void println(boolean booleaner) {
		this.booleaner = booleaner;
		System.out.println(booleaner);
	}

	void println(double doubler) {
		this.doubler = doubler;
		System.out.println(doubler);
	}

	void println(String stringer) {
		this.stringer = stringer;
		System.out.println(stringer);
	}

	
}