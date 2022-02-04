// 합 : 숫자 n 입력시 n까지 합 출력
package com.coding.pms;

import java.util.Scanner;

public class Test020411 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static int solution(int d[], int limit) {
    int answer = 0;
    int sum = 0;

    for (int i = 0; i < d.length; i++) {
      sum = sum + d[i];
      if (sum >= limit) {
        if (i < d.length) {
          int temp = sum;
          sum = sum - d[i];
          continue;
        }
        break;
      }
      answer++;


      int[] a = {};
    }

    return answer;


  }

  public static void main(String[] args) {

    int[] d = {1,2,3,4,1,2,7};
    int limit = 10;

    System.out.println(solution(d, limit));
  }
}
