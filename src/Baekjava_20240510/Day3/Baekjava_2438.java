package Baekjava_20240510.Day3;

// 문제명 : 별 찍기 -1 (2438)

// 문제
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

// 입력
// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

// 출력
// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

import java.util.Scanner;

public class Baekjava_2438 {
    public static void main(String[] args) throws Exception {
        // N번째 줄을 받아옴
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 줄만큼 돌릴 반복문
        for(int i = 0; i < N; i++){
            // i+1보다 작을 때 별 반복해서 찍어주기
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            // 끝나고 개행하기 위한 프린트
            System.out.println("");
        }

    }
}

// 포인트1 : 이중 반복문 사용