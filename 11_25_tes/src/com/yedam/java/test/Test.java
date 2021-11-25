package com.yedam.java.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int[] student = null;
        int studentNum = 0;
        while (run) {
            System.out.println("=== 1. 학생수 입력 2. 학생점수 등록 3. 학생점수 전체조회 4. 학생점수 분석 5. 종료 ===");
            int menu = sc.nextInt();
            switch (menu) {
            case 1:
                System.out.print("학생 수 > ");
                studentNum = sc.nextInt();
                student = new int[studentNum];
                break;

            case 2:                
                for (int i = 0; i < student.length; i++) {
                	System.out.println("점수 > ");
                    student[i] = sc.nextInt();
                }
                break;
            case 3:
                for (int i = 0; i < student.length; i++) {
                    System.out.println("점수 : " + student[i]);
                }
                break;
            case 4:
                int max = student[0];
                for (int i = 0; i < student.length; i++) {
                    if (student[i] > max) {
                        max = student[i];
                    }
                }
                int min = student[0];
                for (int i = 0; i < student.length; i++) {
                    if (student[i] < min) {
                        min = student[i];
                    }
                }
                System.out.println("최고 점수 : " + max + "점");
                System.out.println("최저 점수 : " + min + "점");
                break;
            case 5:
                System.out.println("프로그램 종료");
                sc.close();                run = false;
            }
        }
    }
}