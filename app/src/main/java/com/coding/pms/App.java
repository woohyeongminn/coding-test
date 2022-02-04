package com.coding.pms;

public class App {

  public static int solution(int[] citations) {
    int answer = 0;
    int n = citations.length;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      sum = sum + citations[i];
    }

    float aver = (float) sum / n ;
    System.out.println(aver);

    for (int j = 0; j < n; j++) {
      if (aver <= citations[j]) {
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 1};
    System.out.println(solution(a));
  }
}
