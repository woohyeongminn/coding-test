package com.coding.pms;

public class Test052902 {

  public static boolean solution(int x) {
    int ten = 0;
    int own = 0;
    if (x < 100) {
      ten = (x%100 - x%10)/10;
      System.out.println(ten);
      own = x%10;
      System.out.println(own);
    }

    int total = ten + own;
    if (x % total == 0) {
      return true;
    }
    return false;
  }


  public static void main(String[] args) {
    System.out.println(solution(19));
  }

}
