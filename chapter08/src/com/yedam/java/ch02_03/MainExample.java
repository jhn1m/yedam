package com.yedam.java.ch02_03;

public class MainExample {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA();
		InterfaceB ib = impl;
		ib.methodB();
		InterfaceC ic = impl;
		ic.methodC();
		ic.methodB();
		ic.methodC();
	}
}
