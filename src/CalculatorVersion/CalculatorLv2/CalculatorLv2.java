package CalculatorVersion.CalculatorLv2;

import java.util.ArrayList;
import java.util.List;

public class CalculatorLv2 {

    private List<Float> results = new ArrayList<>();

    public float calculate(int num1, int num2 , char c){

        //result 초기화
        float result = 0;
        /**덧셈,뺄셈,곱셈,나눗셈
         * 나눗셈에서 분자가 0인 경우 처리
         * 연산자가 4개 중 하나도 같지 않을 경우 처리
         */
        switch (c) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                //분자 0일 경우 처리
                if (num2 == 0) {
                    System.out.println("나눈셈 연산에 분자는 0이 입력되면 안됩니다");
                    break;
                }
                result = num1 / num2;
                break;

            // 예상치 못한 연산자가 들어왔을 경우 처리
            default:
                System.out.println("연산에 사용할 수 없는 연산자 입니다.");

        }

        return result;
    }

    //Getter 메소드 구현
    public List<Float> getResults() {
        return results;
    }

    //Setter 메소드 구현
    public void setResults(List<Float> results) {
        this.results = results;
    }

    //첫 번째 데이터 삭제
    public void removeResults() {
        results.remove(0);
    }


}
