package Baekjava_20240510.Day6;

// 문제명 : A+B-3 (10950)

// 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 출력
// 각 테스트 케이스마다 A+B를 출력한다.

import java.util.Scanner;

public class Baekjava_10950 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스
        int T = sc.nextInt();

        // 테스트 케이스만큼 input값 받기
        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
        
        sc.close();
    }
}

// 포인트1 : 반복문 안에 input받기
