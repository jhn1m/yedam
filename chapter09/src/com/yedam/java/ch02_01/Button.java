package com.yedam.java.ch02_01;

public class Button {
	static interface OnClickListener {
		private OnClickListener listener;

		public void setOnClickListener(OnClickListener listener) {
			this.listener = listener;
		}

		public void touch() {
			listener.onCLick();
		}

		void onCLick();
	}

}
