package CalculatorVersion.CalculatorLv2;

import CalculatorVersion.CalculatorLv1;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //인스턴스 생성
        CalculatorLv2 cc = new CalculatorLv2();

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

            //CalculatorLv2 class를 활용한 계산
            float result = cc.calculate(operand1, operand2, operator);

            //list getter로 가져온 후 결과값 추가
            List<Float> results = cc.getResults();
            results.add(result);

            //list를 setter로 저장
            cc.setResults(results);


            //getter로 계산한 결과값 가져오기
            List<Float> finalResults = cc.getResults();

            //저장했던 값 출력 -> 항상 이를 수행한 후에 제거 과정이 있어서 계산한 결과 값의 index는 항상 0
            System.out.println("결과: " + finalResults.get(0));

            //항상 index 0에 결과값이 있도록 삭제 과정을 거침
            cc.removeResults();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            //exit입력 시 탈출
            if(sc.next().equals("exit")){

                break;
            }

        }

    }
}