package core;

public class Test64 {

    public static void main(String[] args) {
        /*
         * 원하는 문자열 찾기
         *
         * 문제 설명
         * 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
         * myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면
         * 0을 return 하는 solution 함수를 완성해 주세요.
         * 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
         *
         *
         * myString	    pat	    return
         * "AbCdEfG"	"aBc"	1
         * "aaAA"	    "aaaaa"	0
         *
         *
         * 입출력 예 #1
         * "AbCdEfG"의 0~2번 인덱스의 문자열은 "AbC"이며,
         * 이는 pat인 "aBc"와 같습니다. 따라서 1을 return 합니다.
         *
         * 입출력 예 #2
         * myString의 길이가 pat보다 더 짧기 때문에 myString의
         * 부분 문자열 중 pat와 같은 문자열이 있을 수 없습니다. 따라서 0을 return 합니다.
         *
         */
        class Solution {
            public int solution(String myString, String pat) {
                myString = myString.toLowerCase();
                pat = pat.toLowerCase();

                if (myString.contains(pat)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        Solution sol = new Solution();
        sol.solution("AbCdEfG" , "aBc");
        }
    }
