// 세 자리 수 곱셈

package com.coding.pms;

import java.util.Scanner;

public class Test020402 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static int[] solution(int a, int b) {

    int s1 = a;
    int s2 = b;
    int s3 = s1 * (s2 % 10);
    int s4 = s1 * ((s2 % 100) - (s2 % 10));
    int s5 = s1 * (s2 / 100) * 100;
    int s6 = s3 + s4 + s5;
    int[] answer = {s1, s2, s3, s4, s5, s6};
    return answer;
  }

  public static void main(String[] args) {

    int a = 0; 
    int b = 0; 

    while (true) { 
      try {
        a = inputInt(keyboardScan.nextLine());
        b = inputInt(keyboardScan.nextLine());

      } catch (Exception e) {
        System.out.println("숫자를 입력하세요");
        continue;
      }
      if ((a < 99 || b < 99) || (a > 999 || b > 999)) {
        System.out.println("세 자리수를 입력하세요.");
        continue;
      }
      break;
    }

    int[] arr = solution(a, b);
    System.out.printf(arr[3] +"," + arr[4] +"," + arr[5]);
  }

  public static int inputInt(String num) {
    return Integer.parseInt(num);
  }
}
