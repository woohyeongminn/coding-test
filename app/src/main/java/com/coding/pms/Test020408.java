// 구구단 : 숫자 n 입력시 n에 대한 구구단 출력
package com.coding.pms;

import java.util.Scanner;

public class Test020408 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static void solution(int num) {

    for (int i = 1; i < 10; i++) {
      System.out.println(num + " * " + i + " = " + num*i);
    }

  }

  public static void main(String[] args) {

    int num = 0;

    while (true) {
      try {
        num = keyboardScan.nextInt();

      } catch (Exception e) {
        System.out.println("숫자를 입력하세요.");
        continue;
      }
      if (num == 0) {
        System.out.println("1이상의 수 입력.");
        continue;
      }
      break;
    }

    solution(num);
  }
}
