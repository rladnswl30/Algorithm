package Programmers_CodingTest;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class Programmers_멀리뛰기 {
    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(3));
        System.out.println(solution(2000));
    }

    private static long solution(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        List<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(2);
        for (int i = 2; i < n; i++) {
            res.add((res.get(i - 1) + res.get(i - 2)) % 1234567);
        }

        return res.get(res.size() - 1);
    }
}
