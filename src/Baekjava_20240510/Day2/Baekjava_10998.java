package Baekjava_20240510.Day2;

// 문제명 : A×B (10998)

// 문제
// 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

// 출력
// 첫째 줄에 A×B를 출력한다.

import java.util.Scanner;

public class Baekjava_10998 {
    public static void main(String[] args) throws Exception {
        //자연수 A, B를 받아온다.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A * B);
    }
}

// 포인트1 : input값이 작은 경우는 Scanner를 사용할 것 그 외에는 bufferReader사용할 예정