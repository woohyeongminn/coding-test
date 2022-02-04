// 45분 일찍 알람
package com.coding.pms;

import java.util.Scanner;

public class Test020407 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static void solution(int h, int m) {

    if (h == 1 && m < 45) {
      h = 23;
      m = 60+(m-45);
    } else if (h != 1 && m < 45) {
      h = h-1;
      m = 60+(m-45);
    } else {
      m = m-45;
    }

    System.out.println(h + ":" + m);
  }

  public static void main(String[] args) {

    int h = 0;
    int m = 0;

    while (true) {
      try {
        h = inputInt(keyboardScan.nextLine());
        m = inputInt(keyboardScan.nextLine());
      } catch (Exception e) {
        System.out.println("숫자를 입력하세요.");
        continue;
      }
      if ((h < 1 || h >23) || (m < 1 || m > 59)) {
        System.out.println("정확한 시간을 입력하세요.");
        continue;
      }
      break;
    }
    solution(h, m);
  }

  public static int inputInt(String time) {
    return Integer.parseInt(time);
  }
}
