package Programmers_CodingTest;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class Programmers_구명보트 {
    public static void main(String[] args) {
//        System.out.println(solution(new int[]{70, 50, 80, 50}, 100));
//        System.out.println("=======================");
//        System.out.println(solution(new int[]{70, 80, 50}, 100));
        System.out.println("=======================");
        System.out.println(solution(new int[]{20, 10, 90, 100}, 100));
//        System.out.println("=======================");
//        System.out.println(solution(new int[]{20, 10, 15, 90, 100}, 100));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int minIdx = 0;
        int maxIdx = people.length - 1;

        while (minIdx <= maxIdx) {
            System.out.println("minIdx : " + minIdx);
            System.out.println("maxIdx : " + maxIdx);

            if (people[maxIdx] + people[minIdx] <= limit) {
                minIdx++;
            }
            maxIdx--;
            answer++;
        }
        return answer;
    }
}
