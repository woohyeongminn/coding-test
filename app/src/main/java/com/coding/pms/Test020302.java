package com.coding.pms;

public class Test020302 {

  public static boolean solution(int num) {
    for(int i=2; i*i<=num; i++){
      if(num % i == 0) return false;
    }
    return true;
  }

}
