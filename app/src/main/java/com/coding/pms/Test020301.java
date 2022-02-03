// 두 정수 사이의 합 구하기
package com.coding.pms;

public class Test020301 {

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

    long answer = solution(13, 13);
    System.out.println(answer);
  }

}
