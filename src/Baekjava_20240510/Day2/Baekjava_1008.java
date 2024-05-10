package Baekjava_20240510.Day2;

// 문제
// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

// 출력
// 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

import java.util.Scanner;

public class Baekjava_1008 {
    public static void main(String[] args) throws Exception {
        // 스캐너 불러옴
        Scanner sc = new Scanner(System.in);

        // 정수 A, B값 받아옴
        double A = sc.nextInt();
        double B = sc.nextInt();
        
        // 분모에 0이 올수 없기 때문에 처리과정이 필요함
        if (B == 0){
            return;
        }
        
        System.out.println(A/B);

    }
}


// 포인트1 : 정수로 받아오면 소수점을 표시해줄 수 없다.
// 포인트2 : long, short은 정수 , float는 4바이트 double는 8바이트 => 더 길게 표현 
// 포인트3 : nextDouble() 이라는 기능도 존재함
