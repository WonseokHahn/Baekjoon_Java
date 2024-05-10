package Baekjava_20240510.Day5;

// 문제명 : 합 (8393)

// 문제
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

// 출력
// 1부터 n까지 합을 출력한다.

import java.util.Scanner;

public class Baekjava_8393 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;

        for(int i = 1; i <= n; i++){
            result += i;
        }

        System.out.println(result);

        sc.close();
    }
}

// 포인트1 : long으로 result를 받아서 혹시 안되는 합의 경우도 가능하게끔 받아줌
