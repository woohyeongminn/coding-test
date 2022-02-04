package com.coding.pms;

public class App {

  public static int solution(int price, int money, int count) {
    int sum = 0;
    int p = 0;
    for (int i = 1; i <= count; i++) {
      p = price*i;
      sum = sum + p;
    }
    if (sum > money) {
      return sum - money;
    }
    return 0;
  }

  public static void main(String[] args) {

    System.out.println(solution(5, 20, 4));
  }
}
