package com.yedam.java.ch02;

public class MainTest {

	public static void main(String[] args) {
		Computer c1 = new Desktop();
		c1.display();
		c1.typing();
		
		c1 = new Notebook();
		c1.display();
		c1.typing();
		
	}

}
