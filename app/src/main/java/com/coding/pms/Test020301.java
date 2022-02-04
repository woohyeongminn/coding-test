// 두 정수 사이의 합 구하기
package com.coding.pms;

import java.util.Scanner;

public class Test020301 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static long solution(int a, int b) {
    long answer = 0;

    if (a == b) {
      return a | b;
    } else if ( a > b){
      for (int i = b; i < a+1; i++)
        answer = answer + i;
    } else if ( a <  b) {
      for (int i = a; i < b+1; i++)
        answer = answer + i;
    }

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
      break;
    }
    System.out.println(solution(a, b));

  }

  public static int inputInt(String num) {
    return Integer.parseInt(num);
  }

}
