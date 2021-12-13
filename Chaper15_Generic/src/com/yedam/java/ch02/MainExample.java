package com.yedam.java.ch02;

public class MainExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
		String name = box1.get();

		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);

	}

}
