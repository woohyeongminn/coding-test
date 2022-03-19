// 약수 : 개수와 덧셈   게산 안됨
package com.coding.pms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test031901 {

  static Scanner keyboardScan = new Scanner(System.in);

  public static int solution(int left, int right) {
    int answer = 0;
    ArrayList<Integer> arr = new ArrayList<>();


    for (int i = left; i <= right; i++) {
      int sqrtI = (int)Math.sqrt(i);

      for(int j = 1; j <= sqrtI; j++){
        if(i % j == 0){ // 약수 중 작은 수 저장
          arr.add(j);
          if(i / j != j){ // 약수 중 큰 수 저장
            arr.add(sqrtI / i);
          }
        }
      }
      arr.sort(Comparator.naturalOrder());
      if (arr.size() % 2 == 1) {
        answer = answer - i;
      }
      else {
        answer = answer + i;
      }
    }

    return answer;
  }


  public static void main(String[] args) {
    System.out.println(solution(13,17));

  }
}
