package core;

import java.util.ArrayList;
import java.util.List;

public class Test58 {

    public static void main(String[] args) {
        /*
         * 배열의 원소 삭제하기
         *
         * 문제 설명
         * 정수 배열 arr과 delete_list가 있습니다.
         * arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던
         * 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
         *
         *
         * arr	                        delete_list	                    result
         * [293, 1000, 395, 678, 94]	[94, 777, 104, 1000, 1, 12]	    [293, 395, 678]
         * [110, 66, 439, 785, 1]	    [377, 823, 119, 43]	            [110, 66, 439, 785, 1]
         *
         *
         * 출력 예 #1
         * 예제 1번의 arr의 원소 중 1000과 94가 delete_list에 있으므로 이 두 원소를 삭제한
         * [293, 395, 678]을 return 합니다.
         *
         *
         * 입출력 예 #2
         * 예제 2번의 arr의 원소 중 delete_list에 있는 원소는 없습니다. 따라서 arr 그대로인
         * [110, 66, 439, 785, 1]을 return 합니다.
         *
         */
        class Solution {
            public List solution(int[] arr, int[] delete_list) {
                List<Integer> answer = new ArrayList<>();

                for(int i=0;i<arr.length; i++){
                    answer.add(arr[i]);
                }
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j<delete_list.length; j++){
                        if(arr[i] == delete_list[j]){
                            answer.remove(Integer.valueOf(arr[i]));
                        }
                    }
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
        }
    }
