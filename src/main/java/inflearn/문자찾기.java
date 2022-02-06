package inflearn;


import java.util.Scanner;
import java.util.*;


class 문자찾기 {
     public int solution(String str, char t) {
         int answer = 0;
         str = str.toUpperCase();
         t= Character.toUpperCase(t);

         for( char c : str.toCharArray()){
             if(t == c) answer++;
         }

         return answer;
 }
    public static void main(String[] args) {
        문자찾기 T = new 문자찾기();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        System.out.println(T.solution(str,c));
    }
}