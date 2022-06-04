// 하샤드수 구하기
package com.coding.pms;

public class Test052902 {

  public static boolean solution(int x) {
    int sum = 0;

    String s = Integer.toString(x);

    for (int i = 0; i < s.length(); i++) {
      sum += Integer.parseInt(s.substring(i, i+1));
    }

    if ((x % sum) == 0) {
      System.out.println(sum);
      System.out.println(x);
      System.out.println(x % sum);
      return true;
    }
    return false;
  }


  public static void main(String[] args) {
    System.out.println(solution(19));
  }

  /**
     public class HarshadNumber{
      private int sum = 0;
      public boolean isHarshad(int num){
          sum = 0;
          Integer.toString(num).chars().forEach(c -> sum += c - '0');
          return num % sum == 0;
      }

  }
   **/






}
