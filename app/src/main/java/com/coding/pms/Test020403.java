// 성적

package com.coding.pms;

import java.util.Scanner;

public class Test020403 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static String solution(int grade) {

    if (grade <= 100 && grade > 90) {
      return "A";
    } else if (grade <= 90 && grade > 80) {
      return "B";
    } else if (grade <= 80 && grade > 70) {
      return "C";
    } else if (grade <= 70 && grade > 60) {
      return "D";
    } else {
      return "F";
    }
  }

  public static void main(String[] args) {
    int grade = 0;

    while (true) { 
      try {
        grade = inputInt(keyboardScan.nextLine());

      } catch (Exception e) {
        System.out.println("숫자를 입력하세요");
        continue;
      }
      if (grade < 0 || grade > 100) {
        System.out.println("옳바른 성적을 입력하세요");
        continue;
      }
      break;
    }

    System.out.println(solution(grade));

  }

  public static int inputInt(String num) {
    return Integer.parseInt(num);
  }
}
