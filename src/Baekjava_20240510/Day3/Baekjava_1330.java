package Baekjava_20240510.Day3;

// 문제명 : 두 수 비교하기 (1330)

// 문제
// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

// 출력
// 첫째 줄에 다음 세 가지 중 하나를 출력한다.
// A가 B보다 큰 경우에는 '>'를 출력한다.
// A가 B보다 작은 경우에는 '<'를 출력한다.
// A와 B가 같은 경우에는 '=='를 출력한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjava_1330 {
    public static void main(String[] args) throws Exception {
        // split을 이용해보기 위해 bufferReader를 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String AB = br.readLine();

        // split함수 사용해서 arr[] 배열에 담아줍니다.
        String arr[] = AB.split(" ");
        
        // 받은 배열에서 int형에 분배해줌
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        
        // 삼항연산자로 깔끔하게 답변
        System.out.println((A > B) ? ">" : (A < B) ? "<" :"==");

    }
}

// 포인트1 : 컴퓨터는 띄어쓰기 또는 개행을 기준으로 값을 받아온다. 
//        => 1 2를 input 시 1과 2를 받아온다.
// 포인트2 : BufferedReader는 InputStreamReader통로를 열어줘야 한다. 그리고 받아온 값은 언제나 문자형이다.
// 포인트3 : Split함수를 이용할 경우 반드시 배열에 담아준다. => 이 또한 문자형이기 때문에 숫자는 숫자로 바꿔주는 작업이 필요하다.
// 포인트4 : 삼항연산자는 물어보고(?) 대답을 참:거짓(:)으로 나눠준다. => 간소화  
