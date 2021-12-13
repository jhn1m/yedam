package com.yedam.java.ch01_02;

import javax.swing.ButtonModel;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}

	@Override
	public void touch() {
		
	}

}
