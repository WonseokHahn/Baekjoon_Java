package Baekjava_20240510.Day2;

// 문제명 : 시험 성적 (9498)

// 문제
// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

// 출력
// 시험 성적을 출력한다.

import java.util.Scanner;

public class Baekjava_9498 {
    public static void main(String[] args) throws Exception {
        // 시험성적을 받아온다.
        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();

        // 결과를 담을 변수를 만들어준다.
        String result = "";

        // 90 ~ 100점은 A
        if(Score >= 90 && Score <= 100){
            result = "A";
        }else if(Score >= 80 && Score <= 89){
            result = "B";
        }else if(Score >= 70 && Score <= 79){
            result = "C";
        }else if(Score >= 60 && Score <= 69){
            result = "D";
        }else{
            result = "F";
        }

        System.out.println(result);
    }
}

// 포인트1 : else if는 위에 조건이 아니면 다음조건을 향하고 if문 여러개는 일단 다 통과하고 봄
