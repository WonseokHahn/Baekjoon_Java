package Baekjava_20240510.Day2;

// 문제명 : 사칙연산 (10869)

// 문제
// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

// 입력
// 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

// 출력
// 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

import java.util.Scanner;

public class Baekjava_10869 {
    public static void main(String[] args) throws Exception {
        //자연수 A, B를 받아온다.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

    }
}

// 포인트1 : 나머지를 구하는 방법은 %이다.
// Scanner는 열엇으면 닫아주는게 매너다.