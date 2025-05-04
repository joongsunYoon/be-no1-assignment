package CalculatorVersion;

import java.sql.SQLOutput;
import java.util.Scanner;


public class CalculatorLv1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            //피연산자 한개씩 받아 저장
            System.out.println("첫 번째 숫자를 입력하시오:  ");
            int operand1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하시오:  ");
            int operand2 = sc.nextInt();

            //가장 앞의 문자만 저장
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            //result 초기화
            int result = 0;
            /**덧셈,뺄셈,곱셈,나눗셈
             * 나눗셈에서 분자가 0인 경우 처리
             * 연산자가 4개 중 하나도 같지 않을 경우 처리
             */
            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    //분자 0일 경우 처리
                    if(operand2 == 0){
                        System.out.println("나눈셈 연산에 분자는 0이 입력되면 안됩니다");
                        break;
                    }
                    result = operand1 / operand2;
                    break;

                // 예상치 못한 연산자가 들어왔을 경우 처리
                default:
                    System.out.println("연산에 사용할 수 없는 연산자 입니다.");

            }

            //결과 출력
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            //exit입력 시 탈출
            if(sc.next().equals("exit")){
                break;
            }

        }
    }

}
