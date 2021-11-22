import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Quiz5();
	}

	private static void my() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int diceCnt = 0;
		int diceCntCheck = 0;
		int diceNum = 0;
		int fiveCnt = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int max = 0;

		int[] Dice = new int[6];
		while (run) {
			System.out.println("=== 1. 주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료 ===");
			System.out.print("메뉴 > ");
			int menuNum = Integer.parseInt(sc.nextLine());
			if (menuNum == 1) {
				System.out.print("주사위 크기 > ");
				diceCntCheck = Integer.parseInt(sc.nextLine());
				if (diceCntCheck >= 5 && diceCntCheck <= 10) {
					diceCnt = diceCntCheck;
				} else {
				}
			} else if (menuNum == 2) {
				while (true) {
					diceNum = (int) (Math.random() * diceCnt + 1);
					if (diceNum == 1) {
						one++;
						fiveCnt++;
					} else if (diceNum == 2) {
						two++;
						fiveCnt++;
					} else if (diceNum == 3) {
						three++;
						fiveCnt++;
					} else if (diceNum == 4) {
						four++;
						fiveCnt++;
					} else if (diceNum == 5) {
						five++;
						fiveCnt++;
						break;
					} else if (diceNum == 6) {
						six++;
						fiveCnt++;
					}
				}
				System.out.println("5가 나올 때까지 주사위를 " + fiveCnt + "번 굴렸습니다.");

			} else if (menuNum == 3) {
				System.out.println("1은 " + one + "번 나왔습니다.");
				System.out.println("2은 " + two + "번 나왔습니다.");
				System.out.println("3은 " + three + "번 나왔습니다.");
				System.out.println("4은 " + four + "번 나왔습니다.");
				System.out.println("5은 " + five + "번 나왔습니다.");
				System.out.println("6은 " + six + "번 나왔습니다.");
				Dice[0] = one;
				Dice[1] = two;
				Dice[2] = three;
				Dice[3] = four;
				Dice[4] = five;
				Dice[5] = six;
			} else if (menuNum == 4) {
				max = Dice[0];
				for (int i = 0; i < Dice.length; i++) {
					if (Dice[i] > max) {
						max = Dice[i];
					}
				}

				System.out.println("가장 많이 나온 수는 " + max + " 입니다.");

			} else if (menuNum == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}

	private static void Quiz1() {
		int num1 = 10;
		double num2 = 2.0;
		int result = num1 + (int) num2;
		result = (int) (num1 + num2);
	}

	private static void Quiz4() {
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n = 1; n <= m; n++) {
				System.out.printf("%d X %d = %d\n", m, n, m * n);
			}
		}
	}

	private static void Quiz5() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		int[] dice = null;
		int size = 0;

		while (run) {
			System.out.println("=== 1. 주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료 ===");
			System.out.println("메뉴 >");
			int selectNo = Integer.parseInt(sc.nextLine());
			switch (selectNo) {
			case 1:
				System.out.println("주사위 크기 >");
				size = Integer.parseInt(sc.nextLine());
				if (size < 5 || size > 10) {
					size = 0;
					System.out.println("입력한 값이 범위를 벗어났습니다. 5~10 사이의 수를 입력해주세요.");
				} else {
					dice = new int[size];
				}
				break;
			case 2:
				int count = 0; // while 문 중 살아있어야 함
				while (true) {
					int random = (int) (Math.random() * size) + 1;
					dice[random - 1]++;
					count++;
					if (random == 5) {
						break;
					}
				}
				System.out.println("5가 나올때 까지 주사위를" + count + "번 굴렸습니다.");
			case 3:
				for (int i = 0; i < dice.length; i++) {
					System.out.println((i + 1) + "은 " + dice[i] + "번 나왔습니다.");
				}
				break;
			case 4:
				int max = 0;
				for (int num : dice) {
					if (max < num) {
						max = num;
					}
				}

				int i = 0;
				for (; i < dice.length; i++) {
					if (dice[i] == max) {
						break;
					}
				}
				System.out.println("가장 많이 나온 수는 " + (i + 1) + "입니다.");
				break;
			case 5:
				run = false;
				System.out.println("시스템 종료");
				break;
			}
		}
	}
}