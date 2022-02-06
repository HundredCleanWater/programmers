package inflearn;


import java.util.*;

class 대소문자변환 {
     public String solution(String str) {
         String answer = "";

         for (char c : str.toCharArray()) {
             if (Character.isLowerCase(c)) {
                 answer += Character.toUpperCase(c);
             } else {
                 answer += Character.toLowerCase(c);
             }

         }
         return answer;
     }

    public static void main(String[] args) {
        대소문자변환 T = new 대소문자변환();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}