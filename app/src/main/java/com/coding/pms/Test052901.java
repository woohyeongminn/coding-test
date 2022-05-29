package com.coding.pms;

class Test052901 {
  public static String solution(String phone_number) {
    // 1) 방법 1
    StringBuffer answer = new StringBuffer();
    answer.append(phone_number);
    for (int i = 0; i < phone_number.length() - 4; i++) {
      answer.replace(i, i+1, "*");
    }

    // 2) 방법2
    char[] ch = phone_number.toCharArray();
    for (int i = 0; i < ch.length-4; i++) {
      ch[i] = 'x';
    }
    return String.valueOf(ch);
    //return answer.toString();
  }

  public static void main(String[] args) {
    System.out.println(solution("01048709134"));
  }
}