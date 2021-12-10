package com.yedam.java.ch01;

public class AnimalTest {
	public static Animal[] list = new Animal[2];

	public static void main(String[] args) {
//		moveAnimal(new Tiger());
//		moveAnimal(new Eagle());
		addAnimal();
		testCasting();

	}

	public static void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void addAnimal() {
		list[0] = new Tiger();
		list[1] = new Eagle();

		for (Animal animal : list) {
			animal.move();
		}
	}

	public static void testCasting() {
		for (Animal animal : list) {
			if(animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
			}
			Eagle eagle = (Eagle) animal;
			eagle.flying();
		}
	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 멀리날아갑니다.");
	}
}