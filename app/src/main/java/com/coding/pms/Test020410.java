// 합 : 숫자 n 입력시 n까지 합 출력
package com.coding.pms;

import java.util.Scanner;

public class Test020410 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static void solution(int num) {

    int sum =0 ;
    for (int i = 1; i < num+1; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
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
