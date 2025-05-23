package core;

public class Test61 {

    public static void main(String[] args) {
        /*
         * 배열 비교하기
         *
         * 문제 설명
         * 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
         * 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
         * 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
         * 두 정수 배열 arr1과 arr2가 주어질 때,
         * 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1,
         * 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
         *
         *
         * arr1	                arr2	            result
         * [49, 13]	            [70, 11, 2]	        -1
         * [100, 17, 84, 1]	    [55, 12, 65, 36]	1
         * [1, 2, 3, 4, 5]	    [3, 3, 3, 3, 3]	    0
         *
         *
         * 입출력 예 #1
         * 예제 1번에서는 arr1의 길이는 2이고 arr2의 길이는 3으로 arr2의 길이가 더 깁니다.
         * 따라서 arr2가 arr1보다 크므로 -1을 return 합니다.
         *
         * 입출력 예 #2
         * 예제 2번에서는 arr1의 길이과 arr2의 길이가 4로 같습니다.
         * arr1의 모든 원소의 합은 100 + 17 + 84 + 1 = 202이고
         * arr2의 모든 원소의 합은 55 + 12 + 65 + 36 = 168으로
         * arr1의 모든 원소의 합이 더 큽니다.
         * 따라서 arr1이 arr2보다 크므로 1을 return 합니다.
         *
         * 입출력 예 #3
         * 예제 3번에서는 arr1의 길이와 arr2의 길이가 5로 같고 각 배열의 모든 원소의 합 또한 15로 같습니다.
         * 따라서 arr1과 arr2가 같으므로 0을 return 합니다.
         *
         */
        class Solution {
            public int solution(int[] arr1, int[] arr2) {
                int answer = 0;
                int arrSum01 = 0;
                int arrSum02 = 0;
                for (int j : arr1) {
                    arrSum01 += j;
                }
                for (int j : arr2) {
                    arrSum02 += j;
                }

                if (arr1.length > arr2.length) {
                    answer = 1;
                }else if (arr1.length < arr2.length) {
                    answer = -1;
                }else {
                    if (arrSum01 > arrSum02) {
                        answer = 1;
                    }else if (arrSum01 < arrSum02) {
                        answer = -1;
                    }else {
                        answer = 0;
                    }
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[] { 49, 13 }, new int[] { 70, 11, 2 });
        }
    }
