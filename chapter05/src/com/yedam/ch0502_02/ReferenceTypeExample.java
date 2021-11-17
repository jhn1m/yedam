package com.yedam.ch0502_02;

public class ReferenceTypeExample {

	public static void main(String[] args) {
//		if(args.length != 2) {
//			System.out.println("값의 수가 부족합니다.");
//			System.exit(0);
//		}
//		String strNum1 = args[0];
//		String strNum2 = args[1];
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		
//		int result = num1 + num2;
//		System.out.println(num1 + " + " + num2 + "=" + result);

		int[][] mathScores = new int[2][3];
		// mathScores[0] = int[3], mathScores[1] = int[3]
		for (int i = 0; i < mathScores.length; i++) {
//			int[] temp = mathScores[i];
//			for(int k = 0; k < temp.length; k++) {
//				int value = temp[k];
//			}
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
			}
		}
		System.out.println();
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i < englishScores.length; i++) {
			for(int k = 0; k<englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]");
			}
		}
	}

}
