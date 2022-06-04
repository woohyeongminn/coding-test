// 평균 구하기
package com.coding.pms;

import java.util.Arrays;

public class Test060401 {

  public static double solution(int[] arr) {
    return (double) Arrays.stream(arr).parallel().reduce(0,(a,b)->  a + b) / arr.length;
  }


  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    System.out.println(solution(arr));
  }






}
