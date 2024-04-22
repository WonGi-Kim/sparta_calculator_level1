/**
 * 스파르타내일배움캠프 개인과제 level - 1 계산기
 * Won Gi - Kim
 * -------------------------------
 * 개발하기 전 고려해야할 점?
 * 정수형이기 때문에 Int -> 실수형으로 계산하기 위해 캐스팅 필요
 * 만약에 실수형이 들어 오게 되면? String으로 받고 계산시에 Double, Float로 형변환?
 */

package App;

import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        /** 과제 요구사항 .4
         * 반복문을 사용하여 반복의 종료를 알려주는 exit 문자열을 입력하기 전 까지 무한으로 계산을 진행한다.
         */

        Scanner in = new Scanner(System.in);

        int a; // 첫 번째 숫자
        int b; // 두 번째 숫자
        char operand; // 연산자
        int result; // 연산 결과
        int result2; // 나눗셈 나머지 연산 임시 사용

        String finish = new String();

        // 요구사항 4에서 무한 반복을 구현해야 하므로 while반복문 사용
        // while문의 내부 조건은 조건이 만족할 때 까지 반복한다.
        while (!finish.equals("exit")) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            a = in.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            operand = in.next().charAt(0);

            System.out.println("두 번째 숫자를 입력하세요: ");
            b = in.nextInt();

            // 요구사항 4에서는 연산자 조건의 제어문을 switch-case 사용
            switch (operand) {
                case ('+'):
                    result = a + b;
                    System.out.println("결과는 : " + result);
                    break;
                case ('-'):
                    result = a - b;
                    System.out.println("결과는 : " + result);
                    break;
                case ('*'):
                    result = a * b;
                    System.out.println("결과는 : " + result);
                    break;
                case ('/'):
                    if(b == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = a / b;
                    result2 = a % b;
                    System.out.println("결과는 " + "몫 : " + result + " 나머지 : " + result2);
                    break;

                default:
                    System.out.println("잘못된 연산자 입니다.");
                    break;
            }

            // 요구사항 4의 exit를 위한 입력과 조건
            System.out.print("더 계산하시겠습니까? ( y 입력시 연산 계속 / exit 입력 시 종료 )");
            finish = in.next();
            if (finish.equals("y")) {
                continue;
            } else if (finish.equals("exit")) {
                break;
            }
        }
    }
}

/**
 * Java에서 문자열을 비교할 때 equlas를 사용한다.
 * == 연산자는 동일한 객체를 참조하는지 확인한다.
 * 다른 언어 습관 무섭다...
 */

