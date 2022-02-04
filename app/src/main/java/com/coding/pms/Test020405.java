// 사분면 고르기

package com.coding.pms;

import java.util.Scanner;

public class Test020405 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static int solution(int x, int y) {

    if (x > 0 && y > 0) {
      return 1;
    } else if (x < 0 && y > 0) {
      return 2;
    } else if (x < 0 && y < 0) {
      return 3;
    } else {
      return 4;
    }
  }

  public static void main(String[] args) {
    int x = 0;
    int y = 0;

    while (true) { 
      try {
        x = inputInt(keyboardScan.nextLine());
        y = inputInt(keyboardScan.nextLine());
      } catch (Exception e) {
        System.out.println("숫자를 입력하세요");
        continue;
      }
      if ((x < -1000 || x > 1000) || (y < -1000 || y > 1000)) {
        System.out.println("-1000~1000 사이의 수를 입력하세요.");
        continue;
      }
      break;
    }

    System.out.println(solution(x,y));

  }

  public static int inputInt(String num) {
    return Integer.parseInt(num);
  }
}
