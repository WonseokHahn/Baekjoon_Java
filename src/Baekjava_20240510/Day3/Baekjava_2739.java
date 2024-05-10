package Baekjava_20240510.Day3;

// 문제명 : 구구단 (2739)

// 문제
// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

// 입력
// 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

// 출력
// 출력형식과 같게 N*1부터 N*9까지 출력한다.

import java.util.Scanner;

public class Baekjava_2739 {
    public static void main(String[] args) throws Exception {
        // 구구단을 할 정수 N을 받아옴
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 숫자를 문자형으로 바꿔주고 N * 1~9 = N*1~9 형식으로 만들어준다.
        for(int i = 1; i <= 9 ; i++){
            System.out.println(Integer.toString(N) + " * " + Integer.toString(i) + " = " + Integer.toString(i*N));
        }

    }
}

// 포인트1 : Integer.toString()는 괄호안에 정수를 넣어주면 문자형으로 변환된다.
//           => 근데 사실 문자형과 + 해주면 자동으로 문자형으로 변환되는거같다...
