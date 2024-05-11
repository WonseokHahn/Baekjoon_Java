package Baekjava_20240510.Day8;

// 문제명 : A+B - 5 (10952)

// 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// 입력
// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 입력의 마지막에는 0 두 개가 들어온다.

// 출력
// 각 테스트 케이스마다 A+B를 출력한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjava_10952 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 0;
        do{
            // A와 B에 받아올 공간을 만들어준다
            String arrN[] = br.readLine().split(" ");
            int A = Integer.parseInt(arrN[0]);   
            int B = Integer.parseInt(arrN[1]);   
            
            result = A + B;
            if(result == 0){
                return;
            }
            System.out.println(result);

        }while(result != 0);


    }
}

// 포인트1 : 반복문 안에 input받기
