// 두 수 비교

package com.coding.pms;

import java.util.Scanner;

public class Test020401 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static String solution(int a, int b) {

    if (a > b) {
      return ">";
    } else if (a < b) {
      return "<";
    }
    return "=";
  }

  public static void main(String[] args) {

    int a = 0;
    int b = 0;

    while (true) {

      try {
        a= inputInt(keyboardScan.nextLine());
        b= inputInt(keyboardScan.nextLine());
      } catch (Exception e) {
        System.out.println("숫자를 입려하세요");
        continue;
      }      
      break;
    }

    System.out.println(solution(a, b));
  }

  public static int inputInt(String title) {
    return Integer.parseInt(title);
  }
}
