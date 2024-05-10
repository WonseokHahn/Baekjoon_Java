package Baekjava_20240510.Day7;

// 문제명 : X보다 작은 수 (10871)

// 문제
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

// 출력
// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

// 예시 10, 2 => 1, 2 

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjava_10871 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 예시처럼 10 2 를 받아준다.
        String arrN[] = br.readLine().split(" ");
        int N = Integer.parseInt(arrN[0]);   // 수열 갯수
        int X = Integer.parseInt(arrN[1]);   // 수열 안에 숫자판별하는 숫자
        
        // 예시의 10개의 input값을 받아준다
        String str[] = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            if(Integer.parseInt(str[i]) < X){
                System.out.print(str[i] + " ");
            }
        }

    }
}

// 포인트1 : 반복문 안에 input받기
