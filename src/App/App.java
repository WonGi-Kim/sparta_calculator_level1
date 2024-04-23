/**
 * 스파르타내일배움캠프 개인과제 level - 1 계산기
 * Won Gi - Kim
 * -------------------------------
 * 개발하기 전 고려해야할 점?
 * 정수형이기 때문에 Int -> 실수형으로 계산하기 위해 캐스팅 필요
 * 만약에 실수형이 들어 오게 되면? String으로 받고 계산시에 Double, Float로 형변환?
 * -> level3에 있었네 ㅎㅎ...
 */

package App;

import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        /** 과제 요구사항 .
         * 연산 결과를 10개를 저장할 수 있는 적합한 타입의 배열을 생성한다.
         * 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성한다.
         * 연산의 결과를 비어있는 곳에 저장하기 위해 저장할 때 마다 count한다.
         */

        Scanner in = new Scanner(System.in);
        String finish = new String(); // 연산을 끝내기 위한 문자 변수

        int a; // 첫 번째 숫자
        int b; // 두 번째 숫자
        char operand; // 연산자
        int result; // 연산 결과
        int result2; // 나눗셈 나머지 연산 임시 사용

        int[] resultArray = new int[10]; // 연산을 저장할 배열
        int count = 0; // 연산이 저장될 때 마다 count증가

        // while문의 내부 조건은 조건이 만족해야만 반복한다.
        while (!finish.equals("exit")) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            a = in.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            operand = in.next().charAt(0);

            System.out.println("두 번째 숫자를 입력하세요: ");
            b = in.nextInt();

            // Switch 내부에서 count가 증가함
            switch (operand) {
                case ('+'):
                    result = a + b;
                    System.out.println("결과는 : " + result);
                    resultArray[count] = result;
                    count++;
                    break;
                case ('-'):
                    result = a - b;
                    System.out.println("결과는 : " + result);
                    resultArray[count] = result;
                    count++;
                    break;
                case ('*'):
                    result = a * b;
                    System.out.println("결과는 : " + result);
                    resultArray[count] = result;
                    count++;
                    break;
                case ('/'):
                    if(b == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = a / b;
                    result2 = a % b;
                    System.out.println("결과는 " + "몫 : " + result + " 나머지 : " + result2);
                    resultArray[count] = result;
                    count++;
                    break;

                default:
                    System.out.println("잘못된 연산자 입니다.");
                    break;
            }

            System.out.print("더 계산하시겠습니까? ( 계속 계산하시려면 아무키나 입력해주세요. exit 입력 시 종료됩니다. )");
            finish = in.next();
            if(finish.equals("exit")) {
                break;
            } else {
                continue;
            }
        }
        System.out.println(count); // count가 증가하는지
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " "); // 배열에 값이 정상적으로 저장 되었는지
        }

    }
}

/**
 * 강의를 들으면서 while문 안쓰던게 뽀록남....
 * 뭐랄까... 쓸 줄은 아는데 설명은 못하는..?
 *
 * while(조건) 조건을 만족해야 반복
 * for(변수;연산;증감;) 연산이 만족할 때 까지 반복
 *
 * 내가 한 설명 두 개 합친거;;
 */

