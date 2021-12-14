package com.yedam.java.ch02_01;

public class Button {
	static interface OnClickListener {
		public OnClickListener listener;

		void onCLick();
	}

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	public void touch() {
		listener.onCLick();
	}

}
