package core;

public class Test31 {

    public static void main(String[] args) {
        /*
         * 소문자로 바꾸기
         *
         * 문제 설명
         * 알파벳으로 이루어진 문자열 myString이 주어집니다.
         * 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
         *
         *
         * myString	    result
         * "aBcDeFg"	"abcdefg"
         * "aaa"	"aaa"
         *
         */
        class Solution {
            public String solution(String myString) {
                String answer = myString.toLowerCase();
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("aBcDeFg");
    }
}
