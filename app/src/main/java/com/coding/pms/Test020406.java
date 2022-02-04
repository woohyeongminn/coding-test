// 윤년
package com.coding.pms;

import java.util.Scanner;

public class Test020406 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static int solution(int year) {

    if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
      return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    int year = 0;
    while (true) { 
      try {
        year = keyboardScan.nextInt();
      } catch (Exception e) {
        System.out.println("숫자를 입력하세요");
        continue;
      }
      if (year < 1 || year > 4000) {
        System.out.println("1~4000 사이의 수를 입력하세요.");
        continue;
      }
      break;
    }

    System.out.println(solution(year));

  }
}
