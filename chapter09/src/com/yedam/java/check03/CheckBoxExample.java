package com.yedam.java.check03;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkbox = new CheckBox();
		checkbox.setOnSelectListener(new CheckBox.onSelectListener){
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");
			}
		};
		checkBox.select();
	}
}