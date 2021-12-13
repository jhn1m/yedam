package com.yedam.java.ch02_01;

import com.yedam.java.ch02_01.Button.OnClickListener;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();

	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void touch() {
			// TODO Auto-generated method stub

		}

		@Override
		public void setOnClickListener(OnClickListener listener) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onCLick() {
			System.out.println("전화를 겁니다.");

		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void touch() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setOnClickListener(OnClickListener listener) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onCLick() {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
