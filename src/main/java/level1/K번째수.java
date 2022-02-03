package level1;

import java.util.Arrays;

//i번째부터 j번째까지 자르고/ 정렬 후 k번째 숫자 선택
//1.i번째부터 j번째까지 자르기 -> sort(a,b)하면 될듯?
//2.내림차순이야 desc?
//3.k번째 숫자 선택은 select이런게 있나 찾아보기
public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int a,b,c;
            a=commands[i][0];
            b=commands[i][1];
            c=commands[i][2];
            int[] temp = Arrays.copyOfRange(array,a-1,b);
            Arrays.sort(temp);
            answer[i]=temp[c-1];
        }
        return answer;
    }
}
